package eu.telecomnancy.mini_rust.semantic;

public enum SemanticExceptionCode {
    MODIFYING_NOT_MUTABLE_SYMBOL,
    CALLING_UNDEFINED_FUNCTION,
    UNDEFINED_SYMBOL,
    REDEFINING_FUNCTION,
    REDEFINING_STRUCTURE,
    NO_MAIN_FUNCTION,
    MAIN_FUNCTION_HAS_PARAMETERS,
    UNDEFINED_TYPE,
    IF_BOOL_EXPR,
    WHILE_BOOL_EXPR,
    VEC_EXPR_SAME_TYPE,
    UNCORRECT_NUMBER_OF_SYMBOLS,
    UNCORRECT_NUMBER_OF_SYMBOLS_F;
}
