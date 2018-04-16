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
    	this.traverseExpr(whileNode.getChild(0));
    	this.traverseBloc(whileNode.getChild(1));
    }
    
    
    private void traverseIf(Tree ifNode){
		traverseExpr(ifNode.getChild(0));
		traverseBloc(ifNode.getChild(1));
		if(ifNode.getChildCount() > 2){
				traverseElse(ifNode.getChild(2));
		}
    }

    private void traverseElse(Tree elseNode){
    	switch(elseNode.getChild(0).getType()){
    		case mini_rustParser.BLOC :
    			traverseBloc(elseNode.getChild(0));
    			break;
    		case mini_rustParser.IF :
    			traverseIf(elseNode.getChild(0));
    			break;
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

    public String getIDF(Tree node){
        return node.getText();
    }
}