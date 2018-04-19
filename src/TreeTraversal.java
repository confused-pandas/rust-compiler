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

    private void traverseFunction(Tree functionNode){
        int argIndex = 2;
        getIDF(functionNode.getChild(0));
        traverseBloc(functionNode.getChild(1));

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

    private void traverseStructure(Tree structureNode){
        String idf = this.getIDF(structureNode.getChild(0));

        for(int i = 1; i < structureNode.getChildCount(); i++) {
            Tree child = structureNode.getChild(0);

            switch (child.getType()) {
                case mini_rustParser.MEMBER:
                    this.traverseStructMember(child);
                    break;
                default:
                    // TODO : exception unknown node
                    break;
            }
        }
    }

    private void traverseBloc(Tree blocNode){
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
    }

    private void traverseType(Tree typeNode){
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
    }

    private void traverseStructMember(Tree structMemberNode){
    	this.getIDF(structMemberNode.getChild(0));
    	this.traverseType(structMemberNode.getChild(1));
    }

    private void traverseStructObj(Tree traverseStructObj){
    	this.getIDF(traverseStructObj.getChild(0));
    	if (traverseStructObj.getType() == mini_rustParser.OBJ) {
    		this.traverseObject(traverseStructObj);
    	}
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
    	if(returnNode.getChildCount() == 1){
            traverseExpr(returnNode.getChild(0));
    	}
    }

    private void traverseLet(Tree letNode, boolean isMutable){
        //TODO : isMutable
        traverseExpr(letNode.getChild(0));
        if (letNode.getChildCount() == 1){
            traverseObject(letNode.getChild(1));
        }
    }

    private void traverseObject(Tree objectNode){
        traverseExpr(objectNode.getChild(0));
        traverseObject(objectNode.getChild(1));

    }

    public String getIDF(Tree node){
        if(node.getType() == mini_rustParser.IDF) {
            return node.getText();
        }

        // TODO : unknown node
        return null;
    }
}