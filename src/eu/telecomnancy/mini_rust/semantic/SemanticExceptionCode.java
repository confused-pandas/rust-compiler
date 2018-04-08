package eu.telecomnancy.mini_rust.semantic;

public enum SemanticExceptionCode {
    MODIFYING_NOT_MUTABLE_SYMBOL,
    UNDEFINED_SYMBOL,
    REDEFINING_FUNCTION,
    REDEFINING_STRUCTURE,
    NO_MAIN_FUNCTION,
    MAIN_FUNCTION_HAS_PARAMETERS
}
