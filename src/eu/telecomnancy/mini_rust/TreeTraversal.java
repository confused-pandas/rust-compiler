package eu.telecomnancy.mini_rust;

import eu.telecomnancy.mini_rust.TDS.*;
import eu.telecomnancy.mini_rust.TDS.symbols.FunctionSymbol;
import eu.telecomnancy.mini_rust.TDS.symbols.StructSymbol;
import eu.telecomnancy.mini_rust.TDS.symbols.VarSymbol;
import eu.telecomnancy.mini_rust.grammar.mini_rustLexer;
import eu.telecomnancy.mini_rust.grammar.mini_rustParser;
import eu.telecomnancy.mini_rust.semantic.SemanticExceptionCode;
import eu.telecomnancy.mini_rust.semantic.exceptions.DefinedSymbolException;
import eu.telecomnancy.mini_rust.semantic.exceptions.SemanticException;
import eu.telecomnancy.mini_rust.semantic.exceptions.UndefinedSymbolException;
import org.antlr.runtime.tree.CommonTree;

public class TreeTraversal {
    private final CommonTree root;
    private TDSBuilder tdsBuilder;
    private TDS TDSGlobal;

    public TreeTraversal(final CommonTree root) {
        this.root = root;
    }

    private boolean isUnaryOp(CommonTree expr) {
        switch (expr.getType()) {
            case mini_rustParser.UNARY_MINUS:
            case mini_rustParser.NEG:
            case mini_rustParser.POINTER:
            case mini_rustParser.REF:
                return true;
            default:
                return false;
        }
    }

    private boolean isBinaryOp(CommonTree expr) {
        switch (expr.getType()) {
            case mini_rustParser.OR:
            case mini_rustParser.AND:
            case mini_rustParser.LT:
            case mini_rustParser.LE:
            case mini_rustParser.GT:
            case mini_rustParser.GE:
            case mini_rustParser.EQ:
            case mini_rustParser.NE:
            case mini_rustParser.PLUS:
            case mini_rustParser.MINUS:
            case mini_rustParser.MUL:
            case mini_rustParser.DIV:
            case mini_rustParser.DOT:
            case mini_rustParser.INDEX:
                return true;
            default:
                return false;
        }
    }

    public void traverse() {
        this.traverse(this.root, 0);
    }

    private void traverse(CommonTree node, int indent) {
        if(node != null) {
            String strIndent = Utils.repeatString(" ", indent);

            for(int i = 0; i < node.getChildCount(); i++) {
                CommonTree child = (CommonTree)node.getChild(i);
                System.out.println(strIndent + child.getText());
                this.traverse(child, indent + 1);
            }
        }
    }

    public void explore() throws SemanticException {
        this.tdsBuilder = new TDSBuilder();
        this.explore(this.root);
    }

    private void explore(CommonTree node) throws SemanticException {
        if(node != null) {
            if(node.getParent() == null && node.getType() == mini_rustParser.FICHIER) {
                this.exploreFile(node);
            }
            else {
                System.err.println("[" + node.toString() + "] Unknown node : " + node.getText());
            }
        }
    }

    private void exploreFile(CommonTree file) throws SemanticException {
        /*
         * ^(FICHIER decl*)
         *
         * decl
         * 	:
         * 	  decl_func
         * 	| decl_struct
         * 	;
         *
         * 	decl* peut générer les noeuds :
         * 	    - decl_func
         * 	        - DECL_FUNC
         * 	    - decl_struct
         * 	        - DECL_STRUCT
         */

        /*
         * Création de la TDS Globale
         * Un pushTDS est toujours suivi d'un popTDS (à appeler quand
         * il n'y a plus d'opération à faire sur la TDS, généralement
         * à la fin d'une fonction explore)
         */
        this.TDSGlobal = this.tdsBuilder.pushTDS();

        // Première passe pour construire la table des symboles globales avec
        // les fonctions et les structures
        this.exploreFile(file, true);

        FunctionSymbol mainFunction = this.tdsBuilder.getCurrentTDS().getFunctionSymbol("main");

        if(mainFunction == null) {
            throw new UndefinedSymbolException(SemanticExceptionCode.NO_MAIN_FUNCTION);
        }
        else if(mainFunction.getArguments().size() != 0) {
            throw new DefinedSymbolException(SemanticExceptionCode.MAIN_FUNCTION_HAS_PARAMETERS, mainFunction);
        }

        // Deuxième passe pour construire les TDS des fonctions
        this.exploreFile(file, false);

        this.tdsBuilder.popTDS();
    }

    private void exploreFile(CommonTree file, boolean firstPass) throws SemanticException {
        for(int i = 0; i < file.getChildCount(); i++) {
            CommonTree child = (CommonTree)file.getChild(i);

            switch (child.getType()) {
                case mini_rustLexer.DECL_FUNC:
                    this.exploreFunction(child, firstPass);
                    break;
                case mini_rustLexer.DECL_STRUCT:
                    this.exploreStructure(child, firstPass);
                    break;
                default:
                    System.err.println("[" + file.toString() + "] Unknown node : " + child.getText());
                    break;
            }
        }
    }

    private void exploreFunction(CommonTree function, boolean firstPass) throws SemanticException {
        /*
         * ^(DECL_FUNC IDF bloc (type)? (argument)*)
         * Une fonction aura toujours au moins deux fils :
         *  - Le premier un IDF
         *  - Le second un bloc
         *
         * Le troisième fils d'un noeud fonction est soit son type retour,
         * soit un argument
         */

        // Récupération de l'identifiant de la fonction
        String idf = this.exploreIDF((CommonTree)function.getChild(0));

        if(firstPass) {
            System.out.println("---------");
            System.out.println("Function");

            // On garde la TDS courante de coté pour pouvoir
            // faire l'ajout de la fonction à la TDS
            // après avoir ajouté ses arguments à sa TDS
            // (surcharge)
            TDS parentTDS = this.tdsBuilder.getCurrentTDS();

            // Création d'une TDS pour la fonction pour stocker ses
            // paramètres et les symboles de son bloc
            TDS tds = this.tdsBuilder.pushTDS();

            // Création d'un symbole fonction
            FunctionSymbol functionSymbol = new FunctionSymbol(function);
            functionSymbol.setName(idf);
            // Création du lien entre le symbole fonction et sa TDS
            functionSymbol.setTDS(tds);
            functionSymbol.setScope(Scope.GLOBAL);

            if(function.getChildCount() > 2) {
                CommonTree thirdChild = (CommonTree)function.getChild(2);
                int argumentsStartIndex = 2;

                // Si c'est le type retour, on incrémente l'index du début des arguments
                if(thirdChild.getType() != mini_rustParser.ARGUMENT) {
                    Type returnType = this.exploreType(thirdChild);
                    argumentsStartIndex += 1;

                    functionSymbol.setReturnType(returnType);
                }

                // S'il y'a des arguments
                for(int i = argumentsStartIndex; i < function.getChildCount(); i++) {
                    CommonTree child = (CommonTree)function.getChild(i);

                    switch (child.getType()) {
                        case mini_rustLexer.ARGUMENT:
                            this.exploreArgument(child, functionSymbol);
                            break;
                        default:
                            System.err.println("[" + function.toString() + "] Unknown node : " + child.getText());
                            break;
                    }
                }
            }

            // Ajout du symbole à la TDS courante (ici en miniruste,
            // le symbole est ajouté à la TDS globale car une fonction
            // ne peut être déclarée que dans le scope global
            parentTDS.addSymbol(functionSymbol);

            this.tdsBuilder.popTDS();
        }
        else {
            FunctionSymbol functionSymbol = this.TDSGlobal.getFunctionSymbol(idf);
            this.tdsBuilder.pushTDS(functionSymbol.getTDS());

            // exploreBloc est appelé après l'ajout du symbole fonction
            // à la TDS globale et de ses arguments, en effet dans le
            // bloc on peut utiliser les arguments de la fonction (il faut
            // donc qu'ils soient défini dans la TDS pour pouvoir les utiliser
            // dans le bloc). Il faut aussi que le symbole fonction soit
            // ajouté à la TDS globale avant l'appel d'exploreBloc, le bloc
            // peut faire un appel récursif.
            this.exploreBloc((CommonTree)function.getChild(1), false);
            this.tdsBuilder.popTDS();
        }
    }

    private void exploreStructure(CommonTree structure, boolean firstPass) throws SemanticException {
        /*
         * ^(DECL_STRUCT $idf ^(MEMBER $i $t)*)
         *
         * Le premier fils d'une structure est son identifiant
         * Les autres sont les membres de la structure
         */
        String idf = this.exploreIDF((CommonTree)structure.getChild(0));

        if(firstPass) {
            System.out.println("---------");
            System.out.println("Structure");

            StructSymbol structSymbol = new StructSymbol(structure);
            structSymbol.setName(idf);

            this.tdsBuilder.getCurrentTDS().addSymbol(structSymbol);
            TDS tds = this.tdsBuilder.pushTDS();
            structSymbol.setTDS(tds);
            this.tdsBuilder.popTDS();
        }
        else {
            StructSymbol structSymbol = this.tdsBuilder.getCurrentTDS().getStructureSymbol(idf);

            this.tdsBuilder.pushTDS(structSymbol.getTDS());

            for(int i = 1; i < structure.getChildCount(); i++) {
                CommonTree child = (CommonTree)structure.getChild(i);

                switch (child.getType()) {
                    case mini_rustParser.MEMBER:
                        exploreStuctureMember(child);
                        break;
                    default:
                        System.err.println("[" + structure.toString() + "] Unknown node : " + child.toString());
                        break;
                }
            }

            this.tdsBuilder.popTDS();
        }
    }

    private void exploreStuctureMember(CommonTree structureMember) throws SemanticException {
        /*
         * ^(MEMBER $i $t)
         *
         * Un membre d'une structure à toujours deux fils :
         *  - Le premier est son identifiant
         *  - Le second est son type
         */
        System.out.println("---------");
        System.out.println("Member_Structure");

        String idf = this.exploreIDF((CommonTree)structureMember.getChild(0));
        Type type = this.exploreType((CommonTree)structureMember.getChild(1));

        VarSymbol varSymbol = new VarSymbol(structureMember);
        varSymbol.setName(idf);
        varSymbol.setType(type);

        this.tdsBuilder.getCurrentTDS().addSymbol(varSymbol);
    }

    private Type exploreType(CommonTree typeNode) {
        /*
         * type
         * 	:
         * 	  IDF
         * 	| VEC_TYPE LT type GT -> ^(VEC_TYPE type)
         * 	| AMPS type
         * 	| INT32_TYPE
         * 	| BOOL_TYPE
         * 	;
         */

        CommonTree currentNode = typeNode;
        int vecDimension = 0;

        while(currentNode.getType() == mini_rustParser.VEC_TYPE) {
            currentNode = (CommonTree)currentNode.getChild(0);
            vecDimension += 1;
        }

        TypeEnum typeEnum = Type.stringToExprType(currentNode.getText());
        Type type = new Type(typeEnum, vecDimension);

        if(typeEnum == TypeEnum.UNKNOWN) {
            StructSymbol structSymbol = this.tdsBuilder.getCurrentTDS().getStructureSymbol(currentNode.getText());

            if(structSymbol == null) {
                // TODO : throw new undefined type
            }
            else {
                type.setStructType(structSymbol.getName());
            }
        }

        System.out.println("Type : " + type.toString());

        return type;
    }

    private void exploreArgument(CommonTree argument, FunctionSymbol functionSymbol) throws SemanticException {
        /*
         * ^(ARGUMENT IDF type)
         * Un argument à toujours deux fils :
         *  - Le premier est son identifiant
         *  - Le second est son type
         */
        System.out.println("---------");
        System.out.println("Argument");

        String idf = this.exploreIDF((CommonTree)argument.getChild(0));
        Type type = this.exploreType((CommonTree)argument.getChild(1));

        // Création d'un symbole variable
        VarSymbol varSymbol = new VarSymbol(argument);
        varSymbol.setName(idf);
        varSymbol.setType(type);
        // Le scope de cette variable est un argument
        // de fonction
        varSymbol.setScope(Scope.FUNCTION);

        // Ajout du symbole à la TDS courante (ici en Minirust,
        // la TDS courante quand on est dans la fonction
        // exploreArgument est la TDS de la fonction)
        this.tdsBuilder.getCurrentTDS().addSymbol(varSymbol);
        functionSymbol.addArgument(varSymbol);
    }

    private void exploreBloc(CommonTree bloc) throws SemanticException {
        this.exploreBloc(bloc, true);
    }

    private void exploreBloc(CommonTree bloc, boolean createTDS) throws SemanticException {
        /*
         * ^(BLOC instruction_bloc?)
         *
         * instruction_bloc
         * 	:
         * 	  instruction instruction_bloc
         * 	| (expr)? (SEMICOLON instruction_bloc)? -> expr? instruction_bloc?
         * 	;
         *
         * instruction
         * 	:
         * 	  LET instruction_let SEMICOLON -> instruction_let
         * 	| WHILE expr bloc -> ^(WHILE expr bloc)
         * 	| RETURN (expr)? SEMICOLON -> ^(RETURN expr?)
         * 	| if_expr
         * 	| bloc
         * 	;
         *
         * instruction_let
         * 	:
         * 	    MUT expr (let_assign)? -> ^(LETMUT expr (let_assign)?)
         * 	  | expr (let_assign)? -> ^(LET expr (let_assign)?)
         * 	;
         *
         * 	if_expr
         * 	:
         * 	IF expr bloc (else_expr)? -> ^(IF expr bloc (else_expr)?)
         * 	;
         *
         * 	Revient à checker tout les noeuds que peut générer la règle bloc :
         * 	    - instruction_bloc
         * 	        - instruction
         * 	            - instruction_let
         * 	                - LET
         * 	                - LETMUT
         * 	            - WHILE
         * 	            - RETURN
         * 	            - if_expr
         * 	                - IF
         * 	            - bloc
         * 	                - BLOC
         * 	        - expr
         *
         */
        System.out.println("---------");
        System.out.println("Bloc");

        if(createTDS) {
            this.tdsBuilder.pushTDS();
        }

        for(int i = 0; i < bloc.getChildCount(); i++) {
            CommonTree child = (CommonTree)bloc.getChild(i);

            switch (child.getType()) {
                /*
                 LET et LETMUT ont exactement la même structure
                 Le type du noeud nous donne l'information de si
                 le LET est mutable ou pas
                  */
                case mini_rustParser.LET:
                    this.exploreLet(child, false);
                    break;
                case mini_rustParser.LETMUT:
                    this.exploreLet(child, true);
                    break;
                case mini_rustParser.WHILE:
                    this.exploreWhile(child);
                    break;
                case mini_rustParser.RETURN:
                    this.exploreReturn(child);
                    break;
                case mini_rustParser.IF:
                    this.exploreIf(child);
                    break;
                case mini_rustParser.BLOC:
                    this.exploreBloc(child, true);
                    break;
                default:
                    this.exploreExpr(child);
                    break;
            }
        }

        if(createTDS) {
            this.tdsBuilder.popTDS();
        }
    }

    private void exploreLet(CommonTree let, boolean isMutable) throws SemanticException {
        /*
         * ^(LETMUT expr (let_assign)?)
         * ^(LET expr (let_assign)?)
         *
         * let_assign
         * 	:
         * 	ASSIGN expr
         * 	(
         * 		-> expr
         * 		| obj_def -> ^(OBJ expr obj_def)
         * 	)
         * 	;
         *
         * 	Le premier noeud sera toujours une expr
         * 	Le second (si présent) sera toujours un let_assign
         *
         * 	let_assign peut générer les noeuds :
         * 	    - expr
         * 	    - OBJ
         *
         */
        System.out.println("---------");

        if(isMutable) {
            System.out.println("Letmut");
        }
        else {
            System.out.println("Let");
        }
        this.exploreExpr((CommonTree)let.getChild(0));

        if(let.getChild(0).getType() == mini_rustParser.IDF) {
            VarSymbol varSymbol = new VarSymbol(let);
            varSymbol.setName(let.getChild(0).getText());
            varSymbol.setScope(Scope.LOCAL);
            varSymbol.setMutable(isMutable);

            this.tdsBuilder.getCurrentTDS().addSymbol(varSymbol);
        }

        if(let.getChildCount() > 1) {
            CommonTree child = (CommonTree)let.getChild(1);
            this.evalExpr((CommonTree)let.getChild(1));

        }
    }

    private void exploreObj(CommonTree obj) {
    	/*
    	 * ^(OBJ expr obj_def)
    	 */
    	
    	System.out.println("---------");
    	System.out.println("Obj");

    	idf = this.exploreIDF((CommonTree)obj.getChild(0));
    	VarSymbol varSymbol = new varSymbol (obj);
    	varSymbol.setName = idf;
    	this.tdsBuilder.getCurrentTDS().addSymbol(varSymbol);
    	
    	for(int i = 1; i < obj.getChildCount(); i++) {
            CommonTree child = (CommonTree)obj.getChild(i);

            switch (child.getType()) {
                case mini_rustParser.MEMBER:
                    exploreObjMember(child);
                    break;
                default:
                    System.err.println("[" + obj.toString() + "] Unknown node : " + child.getText());
                    break;
            }
        }
    }

    private void exploreObjMember(CommonTree member) {
    	/*
    	 * 
         * ^(MEMBER $i $o)*
         *
         * Un membre d'un obj a toujours deux fils :
         *  - Le premier est son identifiant
         *  - Le second est un obj ou un idf
         */
    	 
    	System.out.println("---------");
    	System.out.println("Member");   	

    	String idf = this.exploreIDF((CommonTree)member.getChild(0));
        
        CommonTree child = (CommonTree)member.getChild(1);
        switch (child.getType()) {
        	case mini_rustParser.OBJ:
        		this.exploreObj(child);
        		break;
        	default:
        		this.exploreExpr(child);
        		break;
            }
        
        VarSymbol varSymbol = new VarSymbol(member);
        varSymbol.setIDF = idf;
    }

    private void exploreWhile(CommonTree whileNode) throws SemanticException {
        /*
         * ^(WHILE expr bloc)
         *
         * Un noeud while aura toujours deux fils
         * Le premier une expr
         * Le second un bloc
         */

        System.out.println("---------");
        System.out.println("While");

        this.exploreExpr((CommonTree)whileNode.getChild(0));
        this.exploreBloc((CommonTree)whileNode.getChild(1));
    }

    private void exploreReturn(CommonTree returnNode) {
        /*
         * ^(RETURN expr?)
         *
         * Un return à éventuellement un fils : une expr
         */

        System.out.println("---------");
        System.out.println("Return");

        if(returnNode.getChildCount() > 0) {
            this.exploreExpr((CommonTree)returnNode.getChild(0));
        }
    }

    private void exploreIf(CommonTree ifNode) throws SemanticException {
    	System.out.println("---------");
    	System.out.println("If");

    	this.exploreExpr((CommonTree)ifNode.getChild(0));
    	this.exploreBloc((CommonTree)ifNode.getChild(1));

    	if(ifNode.getChildCount() > 2){
    		this.exploreElse((CommonTree)ifNode.getChild(2));
    	}
    	
    }

    private void exploreElse(CommonTree elseNode) throws SemanticException {
    	System.out.println("---------");
    	System.out.println("Else");

    	switch (elseNode.getChild(0).getType()){
    		case mini_rustParser.IF:
    			this.exploreIf((CommonTree)elseNode.getChild(0));
    			break;
    		case mini_rustParser.BLOC:
    			this.exploreBloc((CommonTree)elseNode.getChild(0));
    			break;
    		default:
    			System.out.println(elseNode.getChild(0).toString());
    	}
    }

    private void exploreExpr(CommonTree expr) {
        System.out.println("---------");
        System.out.println("Expr");

        if(this.isUnaryOp(expr)){
            this.exploreUnaryOp(expr);
        } else if(this.isBinaryOp(expr)) {
            this.exploreBinaryOp(expr);
        } else {
            switch (expr.getType()) {
                case mini_rustParser.PRINT_MACRO:
                    this.explorePrintMacro(expr);
                    break;
                case mini_rustParser.VEC_MACRO:
                		this.exploreVecMacro(expr);
                		break;
                case mini_rustParser.FUNCTION_CALL:
                    this.exploreFunctionCall(expr);
                    break;
                case mini_rustParser.IDF:
                    this.exploreIDF(expr);
                    break;
                case mini_rustParser.CSTE_ENT:
                case mini_rustParser.CSTE_STR:
                case mini_rustParser.TRUE:
                case mini_rustParser.FALSE:
                    break;
                default:
                    System.err.println("[expr] Unknown node : " + expr.getText());
            }
        }
    }

    private void exploreUnaryOp(CommonTree expr) {
    		System.out.println("------------");
    		System.out.println("Unary Expr");
    	
    		/*:
	  	*	MINUS expr_unaire -> ^(UNARY_MINUS expr_unaire)
		*	| (
	    * 		EXCL expr_unaire -> ^(NEG expr_unaire)
	    *		| STAR expr_unaire -> ^(POINTER expr_unaire)
	    *		| AMPS expr_unaire -> ^(REF expr_unaire)
	    *	)
		*	| (a=atom -> $a) 
	  	*	(
	  	* 	LSQBRACKET expr RSQBRACKET -> ^(INDEX $expr_unaire expr)
	  	*| 	DOT dot_factorisation -> ^(DOT $expr_unaire dot_factorisation)
	  	*	)*
	  	*/
    		
    		
    }

    private void exploreBinaryOp(CommonTree expr) {
    }

    private void explorePrintMacro(CommonTree printMacro) {
        System.out.println("---------");
        System.out.println("Print");
        this.exploreExpr((CommonTree)printMacro.getChild(0));
    }

    private void exploreVecMacro(CommonTree vecMacro) {
    	System.out.println("---------");
    	System.out.println("Vec");
    	
    	for (int i = 0; i < vecMacro.getChildCount(); i++) {
    		this.exploreExpr((CommonTree)vecMacro.getChild(i));
    	}
    }

    private void exploreFunctionCall(CommonTree functionCall) {
        System.out.println("----------");
        System.out.println("Function_Call");

        this.exploreIDF((CommonTree)functionCall.getChild(0));
        for(int i = 1; i < functionCall.getChildCount(); i++) {
            this.exploreParam((CommonTree)functionCall.getChild(i));
        }

    }

    private void exploreParam(CommonTree param) {
        System.out.println("---------");
        System.out.println("Param");

        this.exploreExpr(param);
    }

    private String exploreIDF(CommonTree idfNode) {
        String idf = idfNode.getText();
        System.out.println("IDF : " + idf);

        return idf;
    }

    private TypeEnum evalExpr(CommonTree expr) {
        if (isBinaryOp(expr)) {
            TypeEnum evalExprLeft = evalExpr((CommonTree) expr.getChild(0));
            TypeEnum evalExprRight = evalExpr((CommonTree) expr.getChild(1));
            if (evalExprLeft.equals(evalExprRight)) {
                return evalExprLeft;
            } else {
                return TypeEnum.ERROR;
            }
        } else if (isUnaryOp(expr)) {
            return evalExpr((CommonTree) expr.getChild(0));
        } else {
            if (expr.getType() == mini_rustParser.CSTE_ENT) {
                return TypeEnum.I32;
            }
            if (expr.getType() == mini_rustParser.CSTE_STR) {
                return TypeEnum.STRING;
            }
            if (expr.getType() == mini_rustParser.BOOL_TYPE) {
                return TypeEnum.BOOL;
            } else {
                return TypeEnum.ERROR;
            }
        }
    }

    public TDS getGlobalSymbolTable() {
        return this.TDSGlobal;
    }
}
