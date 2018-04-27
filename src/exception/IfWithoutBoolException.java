package exception;

import org.antlr.runtime.tree.Tree;

public class IfWithoutBoolException extends SemanticException{
	
	public IfWithoutBoolException(String message) {
		super(message);
	}
	
}
