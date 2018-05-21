package symbolTable;

import exception.UnknownNodeException;
import exception.semantic.*;
import grammar.mini_rustParser;
import javafx.util.Pair;
import org.antlr.runtime.tree.Tree;
import symbolTable.symbols.FunctionSymbol;
import symbolTable.symbols.StructureSymbol;
import symbolTable.symbols.VariableSymbol;
import java.util.Stack;

public class TreeTraversal {
    private final SymbolTableManager symbolTableManager;
    private final Tree root;

    public TreeTraversal(Tree tree) {
        this.symbolTableManager = new SymbolTableManager();
        this.root = tree;
    }

    public SymbolTable buildSymbolTable() throws SemanticException, UnknownNodeException {
        SymbolTable symbolTable = this.symbolTableManager.openSymbolTable();
        this.traverseFile(root, true);

        FunctionSymbol mainSymbol = this.symbolTableManager.getCurrentTable().getFunctionSymbol("main", true);

        if (mainSymbol == null){
            throw new NoMainFoundException("Your file doesn't contain a main function");
        }

        else if (mainSymbol.getParameters().size()!=0){
            throw new MainWithArgumentException("The main function shouldn't have any argument. Line : " + root.getLine());
        }
        else if (!mainSymbol.getReturnType().isVoid()){
            throw new MainWithReturnTypeException("The main function should have a void type.");
        }

        this.traverseFile(root, false);
        this.symbolTableManager.closeSymbolTable();


        return symbolTable;
    }

    private void traverseFile(Tree root, boolean onlyDeclarations) throws SemanticException, UnknownNodeException {
        if (root.getChildCount() <= 0 ){
            throw new EmptyFileException("The file you want to load is empty");
        }

        else {
            for(int i = 0; i < root.getChildCount() ; i ++) {
                Tree child = root.getChild(i);

                switch (child.getType()) {
                    case mini_rustParser.DECL_FUNC:
                        this.traverseFunction(child, onlyDeclarations);
                        break;
                    case mini_rustParser.DECL_STRUCT:
                        this.traverseStructure(child, onlyDeclarations);
                        break;
                }
            }
        }
    }

    private void traverseFunction(Tree functionNode, boolean onlyDeclarations) throws SemanticException, UnknownNodeException {
        String idf = getIDF(functionNode.getChild(0));

        if(onlyDeclarations) {
            int parameterStartIndex = 2;
            Type returnType = new Type(EnumType.VOID);

            SymbolTable symbolTable = this.symbolTableManager.openSymbolTable();

            if(functionNode.getChildCount() > 2) {
                if (functionNode.getChild(2).getType() != mini_rustParser.PARAMETER){
                    returnType = traverseType(functionNode.getChild(2));
                    parameterStartIndex ++;
                }

                for (int i =  parameterStartIndex; i < functionNode.getChildCount(); i++){
                    traverseParameter(functionNode.getChild(i));
                }
            }

            this.symbolTableManager.closeSymbolTable();

            FunctionSymbol functionSymbol = new FunctionSymbol(
                    functionNode,
                    idf,
                    Scope.LOCAL,
                    returnType,
                    symbolTable
            );

            if(this.symbolTableManager.getCurrentTable().symbolExists(functionSymbol, true)) {
                throw new RedefiningFunctionException("Redefining function " + idf + ". Line : " + functionNode.getLine());
            }

            this.symbolTableManager.getCurrentTable().addSymbol(functionSymbol);
        }
        else {
            FunctionSymbol functionSymbol = this.symbolTableManager.getCurrentTable().getFunctionSymbol(idf, true);

            functionSymbol.getSymbolTable().setSymbolTableType(EnumSymbolTableType.FUNCTION);
            this.symbolTableManager.openSymbolTable(functionSymbol.getSymbolTable());
            BlocType blocType = this.traverseBloc(functionNode.getChild(1), EnumSymbolTableType.FUNCTION, false);
            if (!(blocType.equals(functionSymbol.getReturnType()) || (!blocType.isDeterminedByReturn() && functionSymbol.getReturnType().isVoid()))) {
            	throw new WrongTypeReturnException("Type returned in function " + idf + " differs from type defined in declaration. (" + blocType + " instead of " + functionSymbol.getReturnType() + "). Line : "+ blocType.getLastNode().getLine() +".");
            }

            this.symbolTableManager.closeSymbolTable();
        }
    }

    private void traverseStructure(Tree structureNode, boolean onlyDeclarations) throws SemanticException, UnknownNodeException {
        String idf = this.getIDF(structureNode.getChild(0));

        if(onlyDeclarations) {
            SymbolTable symbolTable = this.symbolTableManager.openSymbolTable();
            StructureSymbol structureSymbol = new StructureSymbol(
                    structureNode,
                    idf,
                    Scope.LOCAL,
                    symbolTable
            );

            if(this.symbolTableManager.getCurrentTable().symbolExists(structureSymbol, true)) {
                throw new RedefiningStructureException("Redefining structure " + idf + ". Line : " + structureNode.getLine());
            }

            this.symbolTableManager.closeSymbolTable();
            this.symbolTableManager.getCurrentTable().addSymbol(structureSymbol);
        }
        else {
            StructureSymbol structureSymbol = this.symbolTableManager.getCurrentTable().getStructureSymbol(idf, true);
            this.symbolTableManager.openSymbolTable(structureSymbol.getSymbolTable());

            for(int i = 1; i < structureNode.getChildCount(); i++) {
                Tree child = structureNode.getChild(i);

                switch (child.getType()) {
                    case mini_rustParser.MEMBER:
                        this.traverseStructureMember(child);
                        break;
                    default:
                        throw new UnknownNodeException("");
                }
            }

            this.symbolTableManager.closeSymbolTable();
        }
    }

    private void traverseStructureMember(Tree structMemberNode) throws SemanticException, UnknownNodeException {
        String idf = this.getIDF(structMemberNode.getChild(0));
        Type type = this.traverseType(structMemberNode.getChild(1));

        VariableSymbol variableSymbol = new VariableSymbol(structMemberNode, idf, Scope.LOCAL, type, false);

        if(this.symbolTableManager.getCurrentTable().symbolExists(variableSymbol, false)) {
            throw new RedefiningStructureElementException("The element " + variableSymbol.getName()+" is already defined in the structure. Line : " + structMemberNode.getLine());
        }
        else {
            this.symbolTableManager.getCurrentTable().addSymbol(variableSymbol);
        }
    }

    private Type traverseFunctionCall(Tree functionCallNode) throws SemanticException, UnknownNodeException {
        String idf = this.getIDF(functionCallNode.getChild(0));
        FunctionSymbol functionSymbol = this.symbolTableManager.getCurrentTable().getFunctionSymbol(idf,true);

        if (functionSymbol == null){
            throw new UndefinedFunctionException("The function "+ idf + " is not defined. Line :" + functionCallNode.getLine());
        }

        int size = functionSymbol.getParameters().size();
        int realSize = functionCallNode.getChildCount()-1;

        if (size != realSize){
            throw new WrongNbArgumentException("The function "+ idf + " has been called with wrong number of arguments (" + realSize + " instead of " + size + "). Line :" + functionCallNode.getLine());
        }

        for (int i = 1; i < realSize + 1; i++){
            Tree param = functionCallNode.getChild(i);
            Type realType = functionSymbol.getParameters().get(i-1).getType();
            Type type = traverseExpr(param);

            if(!type.equals(realType)){
                throw new WrongTypeArgumentException("The argument "+ param.getText() + " is called with the wrong type (" + type + " instead of " + realType + "). Line :" + functionCallNode.getLine());
            }
        }

        return functionSymbol.getReturnType();
    }

    private BlocType traverseBloc(Tree blocNode, EnumSymbolTableType symbolTableType) throws SemanticException, UnknownNodeException {
        return this.traverseBloc(blocNode, symbolTableType, true);
    }

    private BlocType traverseBloc(Tree blocNode, EnumSymbolTableType symbolTableType, boolean createBloc) throws SemanticException, UnknownNodeException {
        BlocType type = new BlocType(EnumType.VOID, false, blocNode);

        if(createBloc) {
            this.symbolTableManager.openSymbolTable();
        }

        for(int i = 0; i < blocNode.getChildCount(); i++) {
            Tree child = blocNode.getChild(i);
            BlocType tempType;

            switch (child.getType()) {
                case mini_rustParser.LET:
                    this.traverseLet(child, false);

                    if(!type.isDeterminedByReturn()) {
                        type = new BlocType(EnumType.VOID, false, child);
                    }
                    break;
                case mini_rustParser.LETMUT:
                    this.traverseLet(child, true);

                    if(!type.isDeterminedByReturn()) {
                        type = new BlocType(EnumType.VOID, false, child);
                    }
                    break;
                case mini_rustParser.WHILE:
                    tempType = this.traverseWhile(child);

                    if(!type.isDeterminedByReturn()) {
                        type = tempType;
                    }
                    break;
                case mini_rustParser.RETURN:
                    tempType = this.traverseReturn(child);

                    if(!type.isDeterminedByReturn()) {
                        type = tempType;
                    }
                    break;
                case mini_rustParser.IF:
                    tempType = this.traverseIf(child);

                    if(!type.isDeterminedByReturn()) {
                        type = tempType;
                    }
                    break;
                default:
                    Type exprType = this.traverseExpr(child);

                    if(!type.isDeterminedByReturn()) {
                        type = new BlocType(exprType.getType(), false, child);
                    }
                    break;
            }
        }

        if(createBloc) {
            SymbolTable blocSymbolTable = this.symbolTableManager.closeSymbolTable();
            blocSymbolTable.setSymbolTableType(symbolTableType);
            this.symbolTableManager.getCurrentTable().addBloc(blocNode.hashCode(), blocSymbolTable);
        }

        return type;
    }

    private Type traverseType(Tree typeNode) throws UnknownTypeException {
        Tree currentNode = typeNode;
        int vec = 0;
        int pointer = 0;
        int ref = 0;
        String structureType = null;
        String stringType;
        EnumType enumType = EnumType.UNKNOWN;
        boolean b = true;

        while(b) {
            switch (currentNode.getType()) {
                case mini_rustParser.VEC_TYPE:
                    vec++;
                    break;
                case mini_rustParser.POINTER:
                    pointer++;
                    break;
                case mini_rustParser.REF:
                    ref++;
                    break;
                default:
                    b = false;
                    break;
            }

            if(b) {
                currentNode = currentNode.getChild(0);
            }
        }

        stringType = currentNode.getText();

        if(!Type.isDefaultType(stringType)) {
            StructureSymbol structureSymbol = this.symbolTableManager
                    .getCurrentTable()
                    .getStructureSymbol(stringType, true);

            if(structureSymbol == null) {
                throw new UnknownTypeException("Unknown type : " + stringType + ". Line : " + typeNode.getLine());
            }

            structureType = stringType;
        }
        else {
            enumType = Type.getDefaultType(stringType);
        }

        return new Type(
                enumType,
                structureType,
                vec,
                pointer,
                ref
        );
    }

    private void traverseParameter(Tree paramNode) throws SemanticException, UnknownNodeException {
        String idf = this.getIDF(paramNode.getChild(0));
        Type type = this.traverseType(paramNode.getChild(1));
        VariableSymbol variableSymbol = new VariableSymbol(paramNode, idf, Scope.FUNCTION, type, true);

        if(this.symbolTableManager.getCurrentTable().symbolExists(variableSymbol, true)){
            throw new RedefiningParamException("The parameter " + idf + " is already defined in the function. Line : " + paramNode.getLine());
        }

        this.symbolTableManager.getCurrentTable().addSymbol(variableSymbol);
    }

    private BlocType traverseWhile(Tree whileNode) throws SemanticException, UnknownNodeException {
        BlocType type;

        this.traverseExpr(whileNode.getChild(0));

    	if (!(this.traverseExpr(whileNode.getChild(0)).isBool())) {
    		throw new WhileWithoutBoolException("Boolean expected in while expression. Line : " + whileNode.getLine() + ".");
    	}

    	type = this.traverseBloc(whileNode.getChild(1), EnumSymbolTableType.WHILE);

    	return type;
    }

    private BlocType traverseIf(Tree ifNode) throws SemanticException, UnknownNodeException {
        BlocType ifType;

        traverseExpr(ifNode.getChild(0));

		if (!(this.traverseExpr(ifNode.getChild(0)).isBool())) {
			throw new IfWithoutBoolException("Boolean expected in if expression. Line : "+ ifNode.getLine()+ ".");
		}

		ifType = traverseBloc(ifNode.getChild(1), EnumSymbolTableType.IF);

		if(ifNode.getChildCount() > 2){
		    BlocType elseType = traverseElse(ifNode.getChild(2));

		    if(!elseType.equals(ifType)) {
		        throw new DifferentTypeException("Different block types : " + ifType.toString() + " : " + elseType.toString());
            }

            ifType = elseType;
		}

		return ifType;
    }

    private BlocType traverseElse(Tree elseNode) throws SemanticException, UnknownNodeException {
        BlocType type;

        switch(elseNode.getChild(0).getType()){
    		case mini_rustParser.BLOC :
    			type = traverseBloc(elseNode.getChild(0), EnumSymbolTableType.ELSE);
    			break;
    		case mini_rustParser.IF :
    			type = traverseIf(elseNode.getChild(0));
    			break;
            default:
                throw new UnknownNodeException("Unknown node : " + elseNode.getText());
    	}

    	return type;
    }

    private Type traverseExpr(Tree exprNode) throws SemanticException, UnknownNodeException {
    	Type leftExpr;
    	Type rightExpr;
    	Type type;

    	switch(exprNode.getType()){
            case mini_rustParser.BLOC :
                type = this.traverseBloc(exprNode, EnumSymbolTableType.ANONYMOUS);
                break;
            case mini_rustParser.OR :
            case mini_rustParser.AND :
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if(!leftExpr.isBool() || !rightExpr.isBool()) {
                    throw new AndOrWithoutBooleanException("The logical connectives AND and OR should be used with two booleans. Line : " + exprNode.getLine());
                }

                type = new Type(EnumType.BOOL);
                break;
            case mini_rustParser.LT :
            case mini_rustParser.LE :
            case mini_rustParser.GT :
            case mini_rustParser.GE :
            case mini_rustParser.EQ :
            case mini_rustParser.NE :
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if(!leftExpr.isInt() || !rightExpr.isInt()) {
                    throw new OperationWithNoIntException("Mathematical inequalities or comparisons should be done between two integers. Line : "+ exprNode.getLine());
                }

                type = new Type(EnumType.BOOL);
                break;
            case mini_rustParser.PLUS :
            case mini_rustParser.MINUS :
            case mini_rustParser.MUL :
            case mini_rustParser.DIV :
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if(!leftExpr.isInt() || !rightExpr.isInt()) { // check type int
                    throw new OperationWithNoIntException("Mathematical operations should be done between two integers. Line : " + exprNode.getLine());
                }

                type = new Type(EnumType.I32);
                break;
            case mini_rustParser.UNARY_MINUS :
                leftExpr = this.traverseExpr(exprNode.getChild(0));

                if(!leftExpr.isInt()){
                    throw new OperationWithNoIntException("Unary operation should be done with an integer, " + exprNode.getChild(0).getText() + "is not one. Line : " + exprNode.getLine());
                }

                type = new Type(EnumType.I32);
                break;
            case mini_rustParser.NEG :
                leftExpr = this.traverseExpr(exprNode.getChild(0));

                if(!leftExpr.isBool()){
                    throw new IsNotWithoutBoolException("The logical connective 'not' should be used before a boolean, " + exprNode.getChild(0).getText() + "is not one. Line : " + exprNode.getLine());
                }

                type = new Type(EnumType.I32);
                break;
            case mini_rustParser.POINTER :
            case mini_rustParser.REF :
                type = this.traversePointerRefExpr(exprNode);
                break;
            case mini_rustParser.INDEX :
            case mini_rustParser.DOT :
                type = this.traverseIndexDotExpr(exprNode);
                break;
            case mini_rustParser.FUNCTION_CALL :
                type = this.traverseFunctionCall(exprNode);
                break;
            case mini_rustParser.VEC_MACRO :
                type = this.traverseVec(exprNode);
                break;
            case mini_rustParser.PRINT_MACRO :
                Type typePrint = this.traverseExpr(exprNode.getChild(0));

                if (typePrint.getType().equals(EnumType.VOID)){
                    throw new PrintVoidException(exprNode.getChild(0).getText()+" has a void type and can't be printed. Line : " + exprNode.getLine());
                }

                type = new Type(EnumType.VOID);
                break;
            case mini_rustParser.CSTE_ENT :
                type = new Type(EnumType.I32);
                break;
            case mini_rustParser.TRUE :
            case mini_rustParser.FALSE :
                type = new Type(EnumType.BOOL);
                break;
            case mini_rustParser.IDF :
                VariableSymbol variableSymbol = this.symbolTableManager
                        .getCurrentTable()
                        .getVariableSymbol(exprNode.getText(), true);

                if(variableSymbol == null) {
                    type = new Type(EnumType.UNKNOWN);
                }
                else {
                    type = variableSymbol.getType();
                }
                break;
            case mini_rustParser.OBJ:
                type = this.traverseObject(exprNode);
                break;
            default:
                throw new UnknownTypeException("Unknown node : " + exprNode.getText());
    	}

    	return type;
    }

    private Type traverseIndexDotExpr(Tree indexDotNode) throws SemanticException {
        Stack<Pair<String, Integer>> nodes = new Stack<>();
        Tree currentNode = indexDotNode;
        boolean b = true;
        VariableSymbol variableSymbol;
        Type type;

        while(b) {
            switch (currentNode.getType()) {
                case mini_rustParser.INDEX:
                case mini_rustParser.DOT:
                    int typePair = currentNode.getType();

                    if(currentNode.getChild(1).getType() == mini_rustParser.LEN) {
                        typePair = mini_rustParser.LEN;
                    }

                    nodes.push(new Pair<>(currentNode.getChild(1).getText(), typePair));
                    currentNode = currentNode.getChild(0);
                    break;
                default:
                    nodes.push(new Pair<>(currentNode.getText(), 0));
                    b = false;
            }
        }

        String idf = nodes.pop().getKey();

        variableSymbol = this.symbolTableManager
                .getCurrentTable()
                .getVariableSymbol(idf, true);
        if(variableSymbol == null) {
            throw new UndefinedSymbolException("Undefined symbol : " + idf + " line : " + indexDotNode.getLine());
        }

        type = variableSymbol.getType();

        while(!nodes.isEmpty()) {
            Pair<String, Integer> node = nodes.pop();

            switch (node.getValue()) {
                case mini_rustParser.INDEX:
                    if(!type.isVec()) {
                        throw new UsingIndexAccessorOnNotVecException("Using index accessor on not vec variable. Line : " + indexDotNode.getLine());
                    }

                    type = new Type(
                            type.getType(),
                            type.getStructure(),
                            type.getVec() - 1,
                            type.getPointer(),
                            type.getRef()
                    );
                    break;
                case mini_rustParser.LEN:
                    if(!type.isVec()) {
                        throw new UsingLenOnNotVecException("Using len on not vec variable. Line : " + indexDotNode.getLine());
                    }

                    if(!nodes.empty()) {
                        throw new LenNotAtEndException("Len must be the last expression operation. Line : " + indexDotNode.getLine());
                    }

                    type = new Type(EnumType.I32);
                    break;
                case mini_rustParser.DOT:
                    if(!type.isStructure()) {
                        throw new UsingStructureAccessorOnNotStructureException("Using structure accessor on not structure variable. Line : " + indexDotNode.getLine());
                    }

                    StructureSymbol structureSymbol = this.symbolTableManager
                            .getCurrentTable()
                            .getStructureSymbol(type.getStructure(), true);

                    variableSymbol = structureSymbol.getSymbolTable()
                            .getVariableSymbol(node.getKey(), false);

                    if(variableSymbol == null) {
                        throw new UndefinedCalledElementException("Accessing undefined structure member. Line : " + indexDotNode.getLine());
                    }

                    type = variableSymbol.getType();

                    break;
            }
        }

        return type;
    }

    private Type traversePointerRefExpr(Tree pointerRefNode) throws SemanticException, UnknownNodeException {
        boolean b = true;
        int pointer = 0;
        int ref = 0;
        Tree currentNode = pointerRefNode;
        Type type;

        while(b) {
            switch (currentNode.getType()) {
                case mini_rustParser.POINTER:
                    pointer++;
                    break;
                case mini_rustParser.REF:
                    ref++;
                    break;
                default:
                    b = false;
                    break;
            }

            if(b) {
                currentNode = currentNode.getChild(0);
            }
        }

        type = this.traverseExpr(currentNode);

        return new Type(
                type.getType(),
                type.getStructure(),
                type.getVec(),
                pointer,
                ref
        );
    }

    private BlocType traverseReturn(Tree returnNode) throws SemanticException, UnknownNodeException {
    	Type type;

        if(returnNode.getChildCount() == 1){
            type = traverseExpr(returnNode.getChild(0));
    	}
    	else {
            type = new Type(EnumType.VOID);
        }

        return new BlocType(type, true, returnNode);
    }

    private void traverseLet(Tree letNode, boolean isMutable) throws SemanticException, UnknownNodeException {
        String idf = this.getIDF(letNode.getChild(0));
        Type exprLeftType = this.traverseExpr(letNode.getChild(0));
        Type exprRightType = new Type(EnumType.UNKNOWN);
        Type type;

        if (letNode.getChildCount() >= 2) {
            exprRightType = this.traverseExpr(letNode.getChild(1));
        }

        if(exprRightType == null) {
            type = exprLeftType;
        }
        else {
            type = exprRightType;
            // TODO : check pointer type
            type.setPointer(exprLeftType.getPointer());
            type.setRef(0);
        }

        VariableSymbol variableSymbol = new VariableSymbol(
                letNode,
                idf,
                Scope.LOCAL,
                type,
                isMutable
        );

        if(exprRightType == null && variableSymbol.isMutable() == false){
            throw new UnusableVariableException(letNode.getChild(0).getText() + " is not usable because it is not mutable. Line : " + letNode.getLine());
        }

        if(this.symbolTableManager.getCurrentTable().symbolExists(variableSymbol, true)) {
            variableSymbol = this.symbolTableManager.getCurrentTable().getVariableSymbol(idf, true);

            if (!variableSymbol.isMutable()) {
                throw new NonMutableException(idf + " is not a mutable variable and is already defined. Line : " + letNode.getLine());
            }
            else{
                Type realType = this.symbolTableManager.getCurrentTable().getVariableSymbol(variableSymbol.getName(),true).getType();

                if (realType.isUnknown()){
                    this.symbolTableManager.getCurrentTable().getVariableSymbol(variableSymbol.getName(),true).setType(type);;
                }
                else if (!variableSymbol.getType().equals(realType)) {
                    throw new RedefiningVariableTypeException(letNode.getChild(0).getText()+" is already defined with the type " + realType + ". It can't change its type. Line : " + letNode.getLine());
                }
            }
        }
        else {
            this.symbolTableManager.getCurrentTable().addSymbol(variableSymbol);
        }
    }

    private Type traverseObject(Tree objectNode) throws SemanticException, UnknownNodeException {
        String idf = this.getIDF(objectNode.getChild(0));
        StructureSymbol structureSymbol = this.symbolTableManager.getCurrentTable().getStructureSymbol(idf,true);

        if (structureSymbol == null){
            throw new UndefinedSymbolException(idf + " is not defined. Line :" + objectNode.getLine());
        }

        int size = objectNode.getChildCount()-1;
        int realSize = structureSymbol.getSymbolTable().getSymbols().size();
        if(size != realSize){
            throw new WrongNumberCalledElementException(idf + "is called with the wrong number of elements (" + size + " instead of " + realSize + "). Line :" + objectNode.getLine());
        }
        
        traverseExpr(objectNode.getChild(0));
        traverseObjectMember(objectNode.getChild(1));

        return new Type(
                EnumType.UNKNOWN,
                structureSymbol.getName(),
                0,
                0,
                0
        );
    }

    private void traverseObjectMember(Tree objMem) throws SemanticException, UnknownNodeException {
        String idf = getIDF(objMem.getChild(0));
        
        Type type = this.traverseExpr(objMem.getChild(1));
        String structName = objMem.getParent().getChild(0).getText();
        StructureSymbol structSymbol = this.symbolTableManager.getCurrentTable().getStructureSymbol(structName, true);
        switch (objMem.getChild(1).getType()) {
            case mini_rustParser.OBJ:
                this.traverseObject(objMem.getChild(1));
                break;
            default:
                this.traverseExpr(objMem.getChild(1));
               VariableSymbol varSymbol = structSymbol.getSymbolTable().getVariableSymbol(idf, true);
               if(varSymbol==null){
                   throw new UndefinedCalledElementException(objMem.getChild(0).getText()+" is not defined on the structure. Line : " + objMem.getLine());
               }
               if(!varSymbol.getType().equals(type)) {
                   throw new WrongTypeCalledElementException(idf + "is called with the wrong types of elements. Line : "+ objMem.getLine() +".");
                }

                break;
        }
    }


    private Type traverseVec(Tree vecNode) throws SemanticException, UnknownNodeException {
    	Type type = null;

    	for (int i = 0; i < vecNode.getChildCount(); i++) {
    		Tree child = vecNode.getChild(i);
    		if (type == null) {
    			type = this.traverseExpr(child);
    		} else if (!(type.equals(this.traverseExpr(child)))) {
    			throw new DifferentTypeException("Expressions of same types expected in vector. Line : " + vecNode.getLine() + ".");
    		}
    	}

    	if(type != null) {
    	    type = new Type(
    	            type.getType(),
                    type.getStructure(),
                    type.getVec() + 1,
                    type.getPointer(),
                    type.getRef()
            );
        }
        else {
    	    throw new EmptyVectorException(vecNode.getText() + "shouldn't be empty. Line : " + vecNode.getLine());
        }

    	return type;
    }


    public String getIDF(Tree node) throws UnknownNodeException {
        if(node.getType() == mini_rustParser.IDF) {
            return node.getText();
        }
        else if(node.getType() == mini_rustParser.DOT || node.getType() == mini_rustParser.POINTER) {
            Tree currentNode = node;

            while(currentNode.getType() == mini_rustParser.DOT
                    || currentNode.getType() == mini_rustParser.POINTER) {
                currentNode = currentNode.getChild(0);
            }

            return currentNode.getText();
        }
        else{
            throw new UnknownNodeException(node.getText() + " is an unknown node. Line : " + node.getLine());
        }
    }
}