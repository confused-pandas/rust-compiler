package eu.telecomnancy.mini_rust.semantic.exceptions;

import eu.telecomnancy.mini_rust.semantic.SemanticErrorMessage;
import eu.telecomnancy.mini_rust.semantic.SemanticExceptionCode;
import org.antlr.runtime.tree.CommonTree;

public class UndefinedSymbolException extends SemanticException {
    private final String name;
    private final CommonTree node;

    public UndefinedSymbolException(SemanticExceptionCode code) {
        this(code, null, null);
    }

    public UndefinedSymbolException(SemanticExceptionCode code, String name, CommonTree node) {
        super(code);
        this.name = name;
        this.node = node;
    }

    @Override
    public String getMessage() {
        String message;

        switch (this.getCode()) {
            case UNDEFINED_SYMBOL:
                message = SemanticErrorMessage.undefinedSymbol(this.name, this.node);
                break;
            case CALLING_UNDEFINED_FUNCTION:
                message = SemanticErrorMessage.callingUndefinedFunction(this.name, this.node);
                break;
            case NO_MAIN_FUNCTION:
                message = SemanticErrorMessage.noMainFunction();
                break;
            case UNDEFINED_TYPE:
                message = SemanticErrorMessage.undefinedType(this.name, this.node);
                break;
            case IF_BOOL_EXPR:
            	message = SemanticErrorMessage.boolExprIf(this.name, this.node);
            case WHILE_BOOL_EXPR:
            	message = SemanticErrorMessage.boolExprWhile(this.name, this.node);
            default:
                message = super.getMessage();
                break;
        }

        return message;
    }
}
