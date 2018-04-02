package eu.telecomnancy.mini_rust;

import org.antlr.runtime.tree.CommonTree;

public class TreeTraversal {
    private final CommonTree root;

    public TreeTraversal(final CommonTree root) {
        this.root = root;
    }

    public void traverse() {
        this.traverse(this.root, 0);
    }

    private void traverse(CommonTree node, int indent) {
        if(node != null) {
            String strIndent = new String(new char[indent]).replace("\0", " ");

            for(int i = 0; i < node.getChildCount(); i++) {
                CommonTree child = (CommonTree)node.getChild(i);
                System.out.println(strIndent + child.getText());
                this.traverse(child, indent + 1);
            }
        }
    }

    public void explore() {
        this.exploreRoot(this.root);
    }

    private void exploreRoot(CommonTree node) {
        if(node != null) {
            if(node.getParent() == null && node.getType() == mini_rustParser.FICHIER) {
                this.exploreFichier(node);
            }
            else {
                System.err.println("[" + node.toString() + "] Unknown node : " + node.toString());
            }
        }
    }

    private void exploreFichier(CommonTree fichier) {
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

        for(int i = 0; i < fichier.getChildCount(); i++) {
            CommonTree child = (CommonTree)fichier.getChild(i);

            switch (child.getType()) {
                case mini_rustLexer.DECL_FUNC:
                    exploreFunction(child);
                    break;
                case mini_rustLexer.DECL_STRUCT:
                    exploreStructure(child);
                    break;
                default:
                    System.err.println("[" + fichier.toString() + "] Unknown node : " + child.toString());
                    break;
            }
        }
    }

    private void exploreFunction(CommonTree function) {
        /*
         * ^(DECL_FUNC IDF bloc (type)? (argument)*)
         * Une fonction aura toujours au moins deux fils :
         *  - Le premier un IDF
         *  - Le second un bloc
         *
         * Le troisième fils d'un noeud fonction est soit son type retour,
         * soit un argument
         */
        System.out.println("---------");
        System.out.println("Function");

        this.exploreIDF((CommonTree)function.getChild(0));
        this.exploreBloc((CommonTree)function.getChild(1));

        if(function.getChildCount() > 2) {
            CommonTree thirdChild = (CommonTree)function.getChild(2);
            int argumentsStartIndex = 2;

            // Si c'est le type retour, on incrémente l'index du début des arguments
            if(thirdChild.getType() != mini_rustParser.ARGUMENT) {
                this.exploreType(thirdChild);
                argumentsStartIndex += 1;
            }

            // S'il y'a des arguments
            for(int i = argumentsStartIndex; i < function.getChildCount(); i++) {
                CommonTree child = (CommonTree)function.getChild(i);

                switch (child.getType()) {
                    case mini_rustLexer.ARGUMENT:
                        this.exploreArgument(child);
                        break;
                    default:
                        System.err.println("[" + function.toString() + "] Unknown node : " + child.toString());
                        break;
                }
            }
        }
    }

    private void exploreStructure(CommonTree structure) {
        /*
         * ^(DECL_STRUCT $idf ^(MEMBER $i $t)*)
         *
         * Le premier fils d'une structure est son identifiant
         * Les autres sont les membres de la structure
         */

        System.out.println("---------");
        System.out.println("Structure");

        this.exploreIDF((CommonTree)structure.getChild(0));

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
    }

    private void exploreStuctureMember(CommonTree structureMember) {
        /*
         * ^(MEMBER $i $t)
         *
         * Un membre d'une structure à toujours deux fils :
         *  - Le premier est son identifiant
         *  - Le second est son type
         */
        System.out.println("---------");
        System.out.println("Member_Structure");

        this.exploreIDF((CommonTree)structureMember.getChild(0));
        this.exploreType((CommonTree)structureMember.getChild(1));
    }

    private void exploreIDF(CommonTree idf) {
        System.out.println("IDF : " + idf.toString());
    }

    private void exploreArgument(CommonTree argument) {
        /*
         * ^(ARGUMENT IDF type)
         * Un argument à toujours deux fils :
         *  - Le premier est son identifiant
         *  - Le second est son type
         */
        System.out.println("---------");
        System.out.println("Argument");

        this.exploreIDF((CommonTree)argument.getChild(0));
        this.exploreType((CommonTree)argument.getChild(1));
    }

    private void exploreBloc(CommonTree bloc) {
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
                    System.out.println("Anonymous block");
                    this.exploreBloc(child);
                    break;
                default:
                    this.exploreExpr(child);
                    break;
            }
        }
    }

    private void exploreLet(CommonTree let, boolean isMutable) {
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

        if(let.getChildCount() > 1) {
            CommonTree child = (CommonTree)let.getChild(1);

            switch (child.getType()) {
                case mini_rustParser.OBJ:
                    this.exploreObj(child);
                    break;
                default:
                    this.exploreExpr(child);
                    break;
            }
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
    	
    	this.exploreExpr((CommonTree)param.getChild(0));
    }

    // TODO explore obj
    private void exploreObj(CommonTree obj) {
    	System.out.println("---------");
    	System.out.println("Obj");

    	//this.exploreMember((CommonTree)obj.getChild(0));
    }

    // TODO explore objMember
    private void exploreMember(CommonTree member) {
    	System.out.println("---------");
    	System.out.println("Member");

    	//this.exploreExpr((CommonTree)member.getChild(1));
    }


    private void exploreWhile(CommonTree whileNode) {
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

    private void exploreIf(CommonTree ifNode) {
    	System.out.println("---------");
    	System.out.println("If");

    	this.exploreExpr((CommonTree)ifNode.getChild(0));
    	this.exploreBloc((CommonTree)ifNode.getChild(1));

    	if(ifNode.getChildCount() > 2){
    		this.exploreElse((CommonTree)ifNode.getChild(2));
    	}
    	
    }

    private void exploreElse(CommonTree elseNode){
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

    private void explorePrintMacro(CommonTree printMacro) {
        System.out.println("---------");
        System.out.println("Print");
        this.exploreExpr((CommonTree)printMacro.getChild(0));
    }

    private void exploreExpr(CommonTree expr) {
        System.out.println("---------");
        System.out.println("Expr");

        switch (expr.getType()) {
            case mini_rustParser.PRINT_MACRO:
                this.explorePrintMacro(expr);
                break;
            case mini_rustParser.VEC_MACRO:
            	//this.explorerVecMacro(expr);
            	break;
            case mini_rustParser.FUNCTION_CALL:
                this.exploreFunctionCall(expr);
                break;
            default:
                System.out.println(expr.toString());
        }
    }

    private void exploreType(CommonTree type) {
        System.out.println("Type : " + type.toString());
    }
}
