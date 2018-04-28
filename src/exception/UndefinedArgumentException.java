package exception;

public class UndefinedArgumentException extends FunctionParamCallException {
    public UndefinedArgumentException(String message) {
        super(message);
    }
}
