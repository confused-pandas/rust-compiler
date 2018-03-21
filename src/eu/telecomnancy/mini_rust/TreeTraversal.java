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
                // TODO : TDS ROOT
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
        System.out.println("Member");

        this.exploreIDF((CommonTree)structureMember.getChild(0));
        this.exploreType((CommonTree)structureMember.getChild(1));
    }

    private void exploreIDF(CommonTree idf) {
        System.out.println("IDF : " + idf.toString());
    }

    private void exploreArgument(CommonTree argument) {
        System.out.println("Argument");

        this.exploreIDF((CommonTree)argument.getChild(0));
        this.exploreType((CommonTree)argument.getChild(1));
    }

    private void exploreBloc(CommonTree bloc) {
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
                case mini_rustParser.PRINT_MACRO:
                    this.explorePrintMacro(child);
                    break;
                case mini_rustParser.BLOC:
                    System.out.println("Anonymous block");
                    this.exploreBloc(child);
                    break;
                default:
                    System.out.println("Node not recognized : " + child.toString());
                    break;
            }
        }
    }

    private void exploreLet(CommonTree let) {
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
                    this.exploreValue(child);
            }
        }
    }

    private void exploreValue(CommonTree value) {
        System.out.println(value.toString());
    }

    private void exploreFunctionCall(CommonTree functionCall) {

    }

    private void exploreObj(CommonTree obj) {

    }

    private void exploreLetMut(CommonTree letmut) {

    }

    private void exploreWhile(CommonTree whileNode) {

    }

    private void exploreReturn(CommonTree returnNode) {

    }

    private void explorePrintMacro(CommonTree printMacro) {

    }

    private void exploreExpr(CommonTree expr) {
        System.out.println("Expr : " + expr.toString());
    }

    private void exploreType(CommonTree type) {
        System.out.println("Type : " + type.toString());
    }
}
