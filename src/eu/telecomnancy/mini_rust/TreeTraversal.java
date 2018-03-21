package eu.telecomnancy.mini_rust;

import org.antlr.runtime.tree.CommonTree;

public class TreeTraversal {
    private final CommonTree root;

    public TreeTraversal(final CommonTree root) {
        this.root = root;
    }

    public void traverse() {
        this.traverse(this.root);
    }

    private void traverse(CommonTree node) {
        if(node != null) {
            if(node.getParent() == null) {
                System.out.println("Root");
            }

            for(int i = 0; i < node.getChildCount(); i++) {
                CommonTree child = (CommonTree)node.getChild(i);

                switch (child.getType()) {
                    case mini_rustLexer.DECL_FUNC:
                        exploreFunction(child);
                        break;
                    case mini_rustLexer.DECL_STRUCT:
                        exploreStructure(child);
                        break;
                    default:
                        break;
                }

                traverse(child);
            }
        }
    }

    private void exploreFunction(CommonTree function) {
        System.out.println("---------");
        System.out.println("Function");

        this.exploreIDF((CommonTree)function.getChild(0));

        for(int i = 1; i < function.getChildCount(); i++) {
            CommonTree child = (CommonTree)function.getChild(i);

            switch (child.getType()) {
                case mini_rustLexer.ARGUMENT:
                    this.exploreArgument(child);
                    break;
                case mini_rustLexer.BLOC:
                    this.exploreBloc(child);
                    break;
                default:
                    this.exploreType(child);
                    break;
            }
        }
    }

    private void exploreStructure(CommonTree structure) {
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
                    break;
            }
        }
    }

    private void exploreStuctureMember(CommonTree structureMember) {
        System.out.println("---------");
        System.out.println("Member_Structure");

        this.exploreIDF((CommonTree)structureMember.getChild(0));
        this.exploreType((CommonTree)structureMember.getChild(1));
    }

    private void exploreIDF(CommonTree idf) {
        System.out.println("IDF : " + idf.toString());
    }

    private void exploreArgument(CommonTree argument) {
        System.out.println("---------");
        System.out.println("Argument");

        this.exploreIDF((CommonTree)argument.getChild(0));
        this.exploreType((CommonTree)argument.getChild(1));
    }

    private void exploreBloc(CommonTree bloc) {
        System.out.println("---------");
        System.out.println("Bloc");

        for(int i = 0; i < bloc.getChildCount(); i++) {
            CommonTree child = (CommonTree)bloc.getChild(i);

            switch (child.getType()) {
                case mini_rustParser.LET:
                    this.exploreLet(child);
                    break;
                case mini_rustParser.LETMUT:
                    this.exploreLetMut(child);
                    break;
                case mini_rustParser.WHILE:
                    this.exploreWhile(child);
                    break;
                case mini_rustParser.RETURN:
                    this.exploreReturn(child);
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

    private void exploreLet(CommonTree let) {
        System.out.println("---------");
        System.out.println("Let");

        this.exploreIDF((CommonTree)let.getChild(0));

        for(int i = 1; i < let.getChildCount(); i++) {
            CommonTree child = (CommonTree)let.getChild(i);

            switch (child.getType()) {
                case mini_rustParser.OBJ:
                    this.exploreObj(child);
                    break;
                case mini_rustParser.FUNCTION_CALL:
                    this.exploreFunctionCall(child);
                    break;
                default:
                    this.exploreExpr(child);
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

    private void exploreObj(CommonTree obj) {
    	System.out.println("---------");
    	System.out.println("Obj");

    	this.exploreMember((CommonTree)obj.getChild(0));
    }
    
    private void exploreMember(CommonTree member) {
    	System.out.println("---------");
    	System.out.println("Member");
    	
    	this.exploreExpr((CommonTree)member.getChild(1));
    }

    private void exploreLetMut(CommonTree letmut) {
    	System.out.println("---------");
    	System.out.println("Letmut");
    }

    private void exploreWhile(CommonTree whileNode) {
        System.out.println("---------");
        System.out.println("While");

        this.exploreExpr((CommonTree)whileNode.getChild(0));
        this.exploreBloc((CommonTree)whileNode.getChild(1));
    }

    private void exploreReturn(CommonTree returnNode) {
        System.out.println("---------");
        System.out.println("Return");

        if(returnNode.getChildCount() > 0) {
            this.exploreExpr((CommonTree)returnNode.getChild(0));
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
            default:
                System.out.println(expr.toString());
        }
    }

    private void exploreType(CommonTree type) {
        System.out.println("Type : " + type.toString());
    }
}
