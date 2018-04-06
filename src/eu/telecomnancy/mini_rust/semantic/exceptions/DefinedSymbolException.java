package eu.telecomnancy.mini_rust.semantic.exceptions;

import eu.telecomnancy.mini_rust.TDS.symbols.Symbol;
import eu.telecomnancy.mini_rust.semantic.SemanticErrorMessage;
import eu.telecomnancy.mini_rust.semantic.SemanticExceptionCode;

public class DefinedSymbolException extends SemanticException {
    private final Symbol symbol;

    public DefinedSymbolException(SemanticExceptionCode code, Symbol symbol) {
        super(code);
        this.symbol = symbol;
    }

    @Override
    public String getMessage() {
        String message;

        switch (this.getCode()) {
            case MODIFYING_NOT_MUTABLE_SYMBOL:
                message = SemanticErrorMessage.modifyingNotMutableSymbol(this.symbol);
                break;
            case REDEFINING_FUNCTION:
                message = SemanticErrorMessage.redefiningFunction(this.symbol);
                break;
            case REDEFINING_STRUCTURE:
                message = SemanticErrorMessage.redefiningStructure(this.symbol);
                break;
            default:
                message = super.getMessage();
                break;
        }

        return message;
    }
}
