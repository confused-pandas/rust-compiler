package eu.telecomnancy.mini_rust.TDS.semanticErrors;

public  class SemanticError extends SemanticException{
    
    public static SemanticException AlreadyDefinedException(String messageError) {
        return new SemanticException(messageError);

    }
    public SemanticException WrongTypeException(String messageError) {
        return new SemanticException(messageError);
    }
}
