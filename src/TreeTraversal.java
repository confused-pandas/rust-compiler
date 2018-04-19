import exception.DifferentTypeException;
import exception.EmptyFileException;
import exception.RedefiningStructElemException;
import exception.SemanticException;
import org.antlr.runtime.tree.Tree;
import grammar.mini_rustParser;

public class TreeTraversal {
    private final SymbolTableManager symbolTableManager;
    private final Tree root;

    public TreeTraversal(Tree tree) throws SemanticException {
        this.symbolTableManager = new SymbolTableManager();
        this.root = tree;
    }

    public void traverse() throws SemanticException {
        this.traverseFile(root);
    }

    private void traverseFile(Tree root) throws SemanticException {
        if (root.getChildCount() <= 0 ){
            throw new EmptyFileException();
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

    private void traverseFunction(Tree functionNode) throws SemanticException {
        int argIndex = 2;
        getIDF(functionNode.getChild(0));
        traverseBloc(functionNode.getChild(1), false);

        if(functionNode.getChildCount() > 2) {
            if (functionNode.getChild(2).getType() != mini_rustParser.PARAMETER){
                traverseType(functionNode.getChild(2));
                argIndex ++;
             }

             for (int i =  argIndex; i < functionNode.getChildCount(); i++){
                 traverseParameter(functionNode.getChild(i));
             }        	
        }
    }

    private void traverseFunctionCall(Tree functioncallNode) throws SemanticException {
        this.getIDF(functioncallNode.getChild(0));

        for (int i = 1; i <functioncallNode.getChildCount(); i++){
            this.traverseExpr(functioncallNode.getChild(i));
        }
    }

    private void traverseStructure(Tree structureNode) throws SemanticException {
        String idf = this.getIDF(structureNode.getChild(0));
        this.symbolTableManager.openSymbolTable();

        for(int i = 1; i < structureNode.getChildCount(); i++) {
            Tree child = structureNode.getChild(i);

            switch (child.getType()) {
                case mini_rustParser.MEMBER:
                    this.traverseStructMember(child);
                    break;
                default:
                    // TODO : exception unknown node
                    break;
            }
        }

        this.symbolTableManager.closeSymbolTable();
    }

    private void traverseBloc(Tree blocNode) throws SemanticException {
        this.traverseBloc(blocNode, true);
    }

    private void traverseBloc(Tree blocNode, boolean createBloc) throws SemanticException {
        if(createBloc) {
            this.symbolTableManager.openSymbolTable();
        }

        for(int i = 0; i < blocNode.getChildCount(); i++) {
            Tree child = blocNode.getChild(i);

            switch (child.getType()) {
                case mini_rustParser.LET:
                    this.traverseLet(child, false);
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
    	    throw new RedefiningStructElemException();
        }
        else {
            this.symbolTableManager.getCurrentTable().addSymbol(variableSymbol);
        }
    }

    private void traverseStructObj(Tree traverseStructObj) throws SemanticException {
    	this.getIDF(traverseStructObj.getChild(0));
    	if (traverseStructObj.getType() == mini_rustParser.OBJ) {
    		this.traverseObject(traverseStructObj);
    	}
    }

    private void traverseParameter(Tree paramNode) throws SemanticException{
        this.getIDF(paramNode.getChild(0));
        this.traverseType(paramNode.getChild(1));
    }

    private void traverseWhile(Tree whileNode) throws SemanticException {
    	this.traverseExpr(whileNode.getChild(0));
    	this.traverseBloc(whileNode.getChild(1));
    }
    
    private void traverseIf(Tree ifNode) throws SemanticException {
		traverseExpr(ifNode.getChild(0));
		traverseBloc(ifNode.getChild(1));
		if(ifNode.getChildCount() > 2){
				traverseElse(ifNode.getChild(2));
		}
    }

    private void traverseElse(Tree elseNode) throws SemanticException {
    	switch(elseNode.getChild(0).getType()){
    		case mini_rustParser.BLOC :
    			traverseBloc(elseNode.getChild(0));
    			break;
    		case mini_rustParser.IF :
    			traverseIf(elseNode.getChild(0));
    			break;
    	}
    }

    private Type traverseExpr(Tree exprNode) throws SemanticException {
    	Tree child = exprNode.getChild(0);
    	Type type = null;
    	
    	switch(child.getType()){
    	case mini_rustParser.BLOC :
    		this.traverseBloc(child);
    		break;
    	case mini_rustParser.OR :
    	case mini_rustParser.AND :
    		Type leftExpr = this.traverseExpr(child.getChild(0));
    		Type rightExpr = this.traverseExpr(child.getChild(1));
    		
    		if(!leftExpr.equals(rightExpr)) {
    			throw new DifferentTypeException();
    		}
    		break;
    	case mini_rustParser.LT :
    	case mini_rustParser.LE :
    	case mini_rustParser.GT :
    	case mini_rustParser.GE :
    	case mini_rustParser.EQ :
    	case mini_rustParser.NE :
    		break;
    	case mini_rustParser.PLUS :
    	case mini_rustParser.MINUS :
    	case mini_rustParser.MUL :
    	case mini_rustParser.DIV :
    		break;
    	case mini_rustParser.UNARY_MINUS :
    		break;
    	case mini_rustParser.NEG :
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
    		break;
    	case mini_rustParser.FALSE :
    		break;
    	case mini_rustParser.IDF :
    		break;
    	}

    		return type;
    }

    private void traverseReturn(Tree returnNode) throws SemanticException {
    	if(returnNode.getChildCount() == 1){
            traverseExpr(returnNode.getChild(0));
    	}
    }

    private void traverseLet(Tree letNode, boolean isMutable) throws SemanticException {
        //TODO : isMutable
        traverseExpr(letNode.getChild(0));
        if (letNode.getChildCount() == 1){
            traverseObject(letNode.getChild(1));
        }
    }

    private void traverseObject(Tree objectNode) throws SemanticException {
        traverseExpr(objectNode.getChild(0));
        traverseObject(objectNode.getChild(1));

    }

    public String getIDF(Tree node) throws SemanticException {
        if(node.getType() == mini_rustParser.IDF) {
            return node.getText();
        }

        // TODO : unknown node
        return null;
    }
}