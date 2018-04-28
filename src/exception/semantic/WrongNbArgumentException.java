package exception.semantic;

public class WrongNbArgumentException extends FunctionParamCallException {
    public WrongNbArgumentException(String message) {
        super(message);
    }
}
