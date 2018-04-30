package symbolTable;

import exception.UnknownNodeException;
import exception.semantic.*;
import grammar.mini_rustParser;
import org.antlr.runtime.tree.Tree;
import symbolTable.symbols.FunctionSymbol;
import symbolTable.symbols.StructureSymbol;
import symbolTable.symbols.VariableSymbol;

public class TreeTraversal {
    private final SymbolTableManager symbolTableManager;
    private final Tree root;

    public TreeTraversal(Tree tree) throws SemanticException {
        this.symbolTableManager = new SymbolTableManager();
        this.root = tree;
    }

    public void traverse() throws SemanticException, UnknownNodeException {
        this.traverseFile(root);
    }

    private void traverseFile(Tree root) throws SemanticException, UnknownNodeException {
        if (root.getChildCount() <= 0 ){
            throw new EmptyFileException("");
        }
        else {
            for(int i = 0; i < root.getChildCount() ; i ++){
                Tree child = root.getChild(i);

                switch (child.getType()){
                    case mini_rustParser.DECL_FUNC :
                        this.traverseFunction(child);
                        break;
                    case mini_rustParser.DECL_STRUCT :
                        this.traverseStructure(child);
                        break;
                }
            }
        }
    }

    private void traverseFunction(Tree functionNode) throws SemanticException, UnknownNodeException {
        int argIndex = 2;
        this.symbolTableManager.openSymbolTable();
        getIDF(functionNode.getChild(0));
        traverseBloc(functionNode.getChild(1), false);

        if(functionNode.getChildCount() > 2) {
            if (functionNode.getChild(2).getType() != mini_rustParser.PARAMETER){
                traverseType(functionNode.getChild(2));
                argIndex ++;
                //returntype ?
             }

             for (int i =  argIndex; i < functionNode.getChildCount(); i++){
                 traverseParameter(functionNode.getChild(i));
             }        	
        }
        this.symbolTableManager.closeSymbolTable();
    }

    private void traverseFunctionCall(Tree functioncallNode) throws SemanticException, UnknownNodeException {
        String idf = this.getIDF(functioncallNode.getChild(0));
        FunctionSymbol functionSymbol = this.symbolTableManager.getCurrentTable().getFunctionSymbol(idf,false);
        if (functionSymbol == null){
            throw new UndefinedFunctionException("The function "+ idf + "is not defined. Line :" + functioncallNode.getLine());
        }

        int size = functionSymbol.getArguments().size();
        int realSize = functioncallNode.getChildCount()-1;

        if (size != realSize){

            throw new WrongNbArgumentException("The function"+ idf + " has been called with wrong number of arguments (" + size + "instead of " + realSize + ". Line :" + functioncallNode.getLine());
        }

        for (int i = 1; i < realSize; i++){
            Tree param = functioncallNode.getChild(i);
            Type realType = functionSymbol.getArguments().get(i-1).getType();
            Type type = traverseExpr(param);

            if(!type.equals(realType)){
                throw new WrongTypeArgumentException("The argument "+ param.getText() + "is called with the wrong type (" + type + "instead of " + realType + ". Line :" + functioncallNode.getLine());
            }
        }

    }

    private void traverseStructure(Tree structureNode) throws SemanticException, UnknownNodeException {
        String idf = this.getIDF(structureNode.getChild(0));
        this.symbolTableManager.openSymbolTable();

        for(int i = 1; i < structureNode.getChildCount(); i++) {
            Tree child = structureNode.getChild(i);

            switch (child.getType()) {
                case mini_rustParser.MEMBER:
                    this.traverseStructMember(child);
                    break;
                case mini_rustParser.OBJ:
                    this.traverseStructObj(child);
                default:
                    throw new UnknownNodeException("");
            }
        }

        this.symbolTableManager.closeSymbolTable();
    }

    private void traverseBloc(Tree blocNode) throws SemanticException, UnknownNodeException {
        this.traverseBloc(blocNode, true);
    }

    private void traverseBloc(Tree blocNode, boolean createBloc) throws SemanticException, UnknownNodeException {
        if(createBloc) {
            this.symbolTableManager.openSymbolTable();
        }

        for(int i = 0; i < blocNode.getChildCount(); i++) {
            Tree child = blocNode.getChild(i);

            switch (child.getType()) {
                case mini_rustParser.LET:
                    this.traverseLet(child, false);
                    break;
                case mini_rustParser.LETMUT:
                    this.traverseLet(child, true);
                    break;
                case mini_rustParser.WHILE:
                    this.traverseWhile(child);
                    break;
                case mini_rustParser.RETURN:
                    this.traverseReturn(child);
                    break;
                case mini_rustParser.IF:
                    this.traverseIf(child);
                    break;
                default:
                    this.traverseExpr(child);
                    break;
            }
        }

        if(createBloc) {
            this.symbolTableManager.closeSymbolTable();
        }
    }

    private Type traverseType(Tree typeNode) throws SemanticException {
        switch (typeNode.getType()){
            case mini_rustParser.IDF :
                //TODO IDF
                break;
            case mini_rustParser.VEC_TYPE :
                traverseType(typeNode.getChild(0));
                break;
            case mini_rustParser.REF:
                //TODO amps
                break;
            case mini_rustParser.CSTE_ENT :
                //TODO int
                break;
            case mini_rustParser.TRUE :
            case mini_rustParser.FALSE :
                //TODO bool
                break;
        }

        return null;
    }

    private void traverseStructMember(Tree structMemberNode) throws SemanticException {
    	String idf = this.getIDF(structMemberNode.getChild(0));
    	Type type = this.traverseType(structMemberNode.getChild(1));

    	VariableSymbol variableSymbol = new VariableSymbol(idf, type, Scope.LOCAL);

    	if(this.symbolTableManager.getCurrentTable().symbolExists(variableSymbol, false)) {
    	    throw new RedefiningStructElemException(variableSymbol.getName()+"is already defined in the structure" + structMemberNode.getAncestor(0).getChild(0).getText() + ". Line :" + structMemberNode.getLine());
        }
        else {
            this.symbolTableManager.getCurrentTable().addSymbol(variableSymbol);
        }
    }

    private void traverseStructObj(Tree traverseStructObj) throws SemanticException, UnknownNodeException {
    	this.getIDF(traverseStructObj.getChild(0));
    	if (traverseStructObj.getType() == mini_rustParser.OBJ) {
    		this.traverseObject(traverseStructObj);
    	}
    }

    private void traverseParameter(Tree paramNode) throws SemanticException{
        String idf = this.getIDF(paramNode.getChild(0));
        Type type = this.traverseType(paramNode.getChild(1));
        VariableSymbol variableSymbol = new VariableSymbol(idf, type, Scope.FUNCTION);
        if(this.symbolTableManager.getCurrentTable().symbolExists(variableSymbol, false)){
            throw new RedefiningParamException(idf + " is already defined in the function " + paramNode.getAncestor(0).getChild(0).getText() + ". Line : " + paramNode.getLine());
        }
        else {
            this.symbolTableManager.getCurrentTable().addSymbol(variableSymbol);
        }

    }

    private void traverseWhile(Tree whileNode) throws SemanticException, UnknownNodeException {
    	this.traverseExpr(whileNode.getChild(0));
    	if (!(this.traverseExpr(whileNode.getChild(0)).isBool())) {
    		throw new WhileWithoutBoolException("Boolean expected in while expression. Line : " + whileNode.getLine() + ".");
    	}
    	this.traverseBloc(whileNode.getChild(1));
    }
    
    private void traverseIf(Tree ifNode) throws SemanticException, UnknownNodeException {
		traverseExpr(ifNode.getChild(0));
		if (!(this.traverseExpr(ifNode.getChild(0)).isBool())) {
			throw new IfWithoutBoolException("Boolean expected in if expression. Line : "+ ifNode.getLine()+ ".");
		}
		traverseBloc(ifNode.getChild(1));
		if(ifNode.getChildCount() > 2){
				traverseElse(ifNode.getChild(2));
		}
		
    }

    private void traverseElse(Tree elseNode) throws SemanticException, UnknownNodeException {
    	switch(elseNode.getChild(0).getType()){
    		case mini_rustParser.BLOC :
    			traverseBloc(elseNode.getChild(0));
    			break;
    		case mini_rustParser.IF :
    			traverseIf(elseNode.getChild(0));
    			break;
    	}
    }

    private Type traverseExpr(Tree exprNode) throws SemanticException, UnknownNodeException {
    	Type leftExpr;
    	Type rightExpr;
    	Type type = new Type(EnumType.UNKNOWN);
    	
    	switch(exprNode.getType()){
    	case mini_rustParser.BLOC :
    		this.traverseBloc(exprNode);
    		break;
    	case mini_rustParser.OR :
    	case mini_rustParser.AND :
    		leftExpr = this.traverseExpr(exprNode.getChild(0));
    		rightExpr = this.traverseExpr(exprNode.getChild(1));
    		
    		if(!leftExpr.isBool() && !rightExpr.isBool()) { //TODO: check type bool
    			throw new IsNotWithoutBoolException("");
    		}
    		break;
    	case mini_rustParser.LT :
    	case mini_rustParser.LE :
    	case mini_rustParser.GT :
    	case mini_rustParser.GE :
    	case mini_rustParser.EQ :
    	case mini_rustParser.NE :
    		leftExpr = this.traverseExpr(exprNode.getChild(0));
    		rightExpr = this.traverseExpr(exprNode.getChild(1));

    		if(!leftExpr.isInt() && !rightExpr.isInt()) { // check type int
    			throw new OperationWithNoIntException("");
    		}
    		break;
    	case mini_rustParser.PLUS :
    	case mini_rustParser.MINUS :
    	case mini_rustParser.MUL :
    	case mini_rustParser.DIV :
    		leftExpr = this.traverseExpr(exprNode.getChild(0));
    		rightExpr = this.traverseExpr(exprNode.getChild(1));

    		if(!leftExpr.isInt() && !rightExpr.isInt()) { // check type int
    			throw new OperationWithNoIntException("");
    		}
    		break;
    	case mini_rustParser.UNARY_MINUS :
    		leftExpr = this.traverseExpr(exprNode.getChild(0));
    		if(!leftExpr.isInt()){
    			throw new OperationWithNoIntException("");
    		}
    		break;
    	case mini_rustParser.NEG :
    		leftExpr = this.traverseExpr(exprNode.getChild(0));
    		if(!leftExpr.isBool()){
    			throw new IsNotWithoutBoolException("");
    		}
    		break;
    	case mini_rustParser.POINTER :
    		break;
    	case mini_rustParser.REF :
    		break;
    	case mini_rustParser.INDEX :
    		break;
    	case mini_rustParser.DOT :
    		break;
    	case mini_rustParser.FUNCTION_CALL :
    		for(int i=0; i < exprNode.getChildCount(); i++){
    			rightExpr = this.traverseExpr(exprNode.getChild(i));
    		}
    		break;
    	case mini_rustParser.VEC_MACRO :
    		break;
    	case mini_rustParser.PRINT_MACRO :
    		break;
    	case mini_rustParser.CSTE_ENT :
    		break;
    	case mini_rustParser.CSTE_STR :
    		break;
    	case mini_rustParser.TRUE :
    		leftExpr = this.traverseExpr(exprNode.getChild(0));
    		if(!leftExpr.isBool()){
    			throw new IsNotWithoutBoolException("");
    		}
    		break;
    	case mini_rustParser.FALSE :
    		leftExpr = this.traverseExpr(exprNode.getChild(0));
    		if(!leftExpr.isBool()){
    			throw new IsNotWithoutBoolException("");
    		}
    		break;
    	case mini_rustParser.IDF :
    		break;
    	}

    		return type;
    }

    private void traverseReturn(Tree returnNode) throws SemanticException, UnknownNodeException {
    	if(returnNode.getChildCount() == 1){
            traverseExpr(returnNode.getChild(0));
    	}
    }

    private void traverseLet(Tree letNode, boolean isMutable) throws SemanticException, UnknownNodeException {
        String idf = this.getIDF(letNode.getChild(0));
        Type type = this.traverseExpr(letNode.getChild(0));
        VariableSymbol variableSymbol = new VariableSymbol(idf, type, Scope.LOCAL);

        if (letNode.getChildCount() >= 1) {
            traverseObject(letNode.getChild(1));
        }

    }

    private void traverseObject(Tree objectNode) throws SemanticException, UnknownNodeException {
        String idf = this.getIDF(objectNode);
        StructureSymbol structureSymbol = this.symbolTableManager.getCurrentTable().getStructureSymbol(idf,false);


        if (structureSymbol == null){
            throw new UndefinedSymbolException(idf + "is not defined. Line :" + objectNode.getLine());
        }

        int size = objectNode.getChildCount()-1;
        int realSize = structureSymbol.getSymbolTable().getSymbols().size();
        if(size != realSize){
            throw new WrongNumberCalledElementException(idf + "is called with the wrong number of elements (" + size + " instead of " + realSize + "). Line :" + objectNode.getLine());
        }

        traverseExpr(objectNode.getChild(0));
        traverseObject(objectNode.getChild(1));


    }

    
    private void traverseVec(Tree vecNode) throws SemanticException, UnknownNodeException {
    	Type type = null;
    	for (int i = 0; i < vecNode.getChildCount(); i++) {
    		Tree child = vecNode.getChild(i);
    		if (type == null) {
    			type = this.traverseExpr(child);
    		} else if (!(type.equals(this.traverseExpr(child)))) {
    			throw new DifferentTypeException("Expressions of same types expected in vector. Line : " + vecNode.getLine() + ".");
    		}
    	}
    }


    public String getIDF(Tree node) throws SemanticException {
        if(node.getType() == mini_rustParser.IDF) {
            return node.getText();
        }

        // TODO : unknown node
        return null;
    }
}