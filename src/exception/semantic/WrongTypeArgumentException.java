package exception.semantic;

public class WrongTypeArgumentException extends FunctionParamCallException {
    public WrongTypeArgumentException(String message) {
        super(message);
    }
}
