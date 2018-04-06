package eu.telecomnancy.mini_rust.semantic.exceptions;

import eu.telecomnancy.mini_rust.semantic.SemanticExceptionCode;

public class SemanticException extends Exception{
    private final SemanticExceptionCode code;

    public SemanticException(SemanticExceptionCode code) {
        super();
        this.code = code;
    }

    public SemanticExceptionCode getCode() {
        return this.code;
    }
}
