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
        String name = function.getChild(0).toString();

        System.out.println("Function name : " + name);

        for(int i = 1; i < function.getChildCount(); i++) {
            CommonTree child = (CommonTree)function.getChild(i);

            switch (child.getType()) {
                case mini_rustLexer.ARGUMENTS:
                    exploreArguments(child);
                    break;
                case mini_rustLexer.BLOC:
                    exploreBloc(child);
                    break;
                default:
                    exploreReturnType(child);
                    break;
            }
        }
    }

    private void exploreStructure(CommonTree structure) {
        String name = structure.getChild(0).toString();

        System.out.println("Structure name : " + name);

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
        String name = structureMember.getChild(0).toString();
        String type = structureMember.getChild(1).toString();

        System.out.println("Member : " + type + ":" + name);
    }

    private void exploreArguments(CommonTree arguments) {
        for(int i = 0; i < arguments.getChildCount(); i++) {
            exploreArgument((CommonTree)arguments.getChild(i));
        }
    }

    private void exploreArgument(CommonTree argument) {
        String name = argument.getChild(0).toString();
        String type = argument.getChild(1).toString();

        System.out.println("Argument : " + type + ":" + name);
    }

    private void exploreBloc(CommonTree bloc) {
        for(int i = 0; i < bloc.getChildCount(); i++) {
            CommonTree child = (CommonTree)bloc.getChild(i);

            switch (child.getType()) {
                case mini_rustParser.LET:
                    break;
                case mini_rustParser.LETMUT:
                    break;
                case mini_rustParser.WHILE:
                    break;
                case mini_rustParser.RETURN:
                    break;
                case mini_rustParser.PRINT_MACRO:
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

    private static void exploreReturnType(CommonTree returnType) {
        System.out.println("Return type : " + returnType.toString());
    }
}
