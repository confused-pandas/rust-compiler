import exception.EmptyFileException;
import exception.SemanticException;
import org.antlr.runtime.tree.Tree;
import grammar.mini_rustParser;

public class TreeTraversal {

    private final Tree root;

    public TreeTraversal(Tree tree){
        this.root = tree;
    }

    public void traverse() throws SemanticException {
        this.traverseFile(root);
    }

    private void traverseFile(Tree root) throws SemanticException{
        if (root.getChildCount() <= 0 ){
            throw new EmptyFileException();
        }
        else {
            for(int i = 0; i < root.getChildCount() ; i ++){
                switch (root.getChild(i).getType()){

                    case mini_rustParser.DECL_FUNC :
                        break;

                    case mini_rustParser.DECL_STRUCT :
                        break;
                }

            }
        }
    }

    private void traverseFunction(Tree functionNode){


    }

    private void traverseStructure(Tree structureNode){

    }

    private void traverseBloc(Tree blocNode){

    }

    private void traverseType(Tree typeNode){

    }

    private void traverseStructMember(Tree structMemberNode){
    	this.getIDF(structMemberNode.getChild(0));
    	this.traverseType(structMemberNode.getChild(1));
    }

    private void traverseStructObj(Tree traverseStructObj){

    }

    private void traverseParameter(Tree argNode){

    }

    private void traverseWhile(Tree whileNode){

    }

    private void traverseIf(Tree ifNode){
    	this.traverseExpr(ifNode.getChild(0));
    	this.traverseBloc(ifNode.getChild(1));
    	if (ifNode.getChildCount() > 2) {
    		this.traverseElse(ifNode.getChild(2));
    	}
    }

    private void traverseElse(Tree elseNode){

    }

    private void traverseExpr(Tree exprNode){

    }

    private void traverseReturn(Tree returnNode){

    }

    private void traverseLet(Tree letNode){

    }

    private void traverseObject(Tree objectNode){

    }

    public String getIDF(Tree node){
        return node.getText();
    }
}