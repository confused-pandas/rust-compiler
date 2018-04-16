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

    }

    private void traverseStructObj(Tree traverseStructObj){

    }

    private void traverseParameter(Tree argNode){

    }

    private void traverseWhile(Tree whileNode){
    	if(whileNode.getChildCount() != 2){
    		//TODO: erreur
    	} else {
    		traverseExpr(whileNode.getChild(0));
    		traverseBloc(whileNode.getChild(1));
    	}

    }

    private void traverseIf(Tree ifNode){
    	if(ifNode.getChildCount() < 2){
    		//TODO: erreur
    	} else {
    		traverseExpr(ifNode.getChild(0));
    		traverseBloc(ifNode.getChild(1));
    		if(ifNode.getChildCount() > 2){
    			for(int i = 2; i < ifNode.getChildCount(); i++){
    				traverseElse(ifNode.getChild(i));
    			}
    		}
    	}
    }

    private void traverseElse(Tree elseNode){
    	if(elseNode.getChildCount() != 1){
    		//TODO: erreur
    	} else {
    		traverseIf(elseNode.getChild(0));
    	}

    }

    private void traverseExpr(Tree exprNode){

    }

    private void traverseReturn(Tree returnNode){
    	if(returnNode.getChildCount() > 1){
    		//TODO: erreur
    	} else {
    		if(returnNode.getChildCount() == 1){
    			traverseExpr(returnNode.getChild(0));
    		}
    	}
    }

    private void traverseLet(Tree letNode){

    }

    private void traverseObject(Tree objectNode){

    }
}