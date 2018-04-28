package exception.semantic;

public class WrongTypeReturnException extends FunctionException {
    public WrongTypeReturnException(String message) {
        super(message);
    }
}
