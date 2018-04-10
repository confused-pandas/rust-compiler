package eu.telecomnancy.mini_rust.semantic.exceptions;

import eu.telecomnancy.mini_rust.TDS.symbols.Symbol;
import eu.telecomnancy.mini_rust.semantic.SemanticErrorMessage;
import eu.telecomnancy.mini_rust.semantic.SemanticExceptionCode;
import org.antlr.runtime.tree.CommonTree;

public class DefinedSymbolException extends SemanticException {
    private final Symbol symbol;
    private final CommonTree node;

    public DefinedSymbolException(SemanticExceptionCode code, Symbol symbol) {
        this(code, symbol, null);
    }

    public DefinedSymbolException(SemanticExceptionCode code, Symbol symbol, CommonTree node) {
        super(code);
        this.symbol = symbol;
        this.node = node;
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
            case MAIN_FUNCTION_HAS_PARAMETERS:
                message = SemanticErrorMessage.mainFunctionHasParameters(this.symbol);
                break;
            case INCORRECT_NUMBER_OF_SYMBOLS_STRUCTURE:
                message = SemanticErrorMessage.incorrectNbSymbolsStructure(this.symbol);
                break;
            case INCORRECT_NUMBER_OF_SYMBOLS_FUNCTION:
                message = SemanticErrorMessage.incorrectNbSymbolsFunction(this.symbol);
                break;
            case WRONG_RETURN_TYPE:
                message = SemanticErrorMessage.wrongReturnType(this.symbol, this.node);
                break;
            case WRONG_TYPE_PARAM:
                message = SemanticErrorMessage.wrongTypeParam(this.symbol);
                break;
            default:
                message = super.getMessage();
                break;
        }

        return message;
    }
}
