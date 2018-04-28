package exception.semantic;

public class WrongTypeCalledElementException extends StructElementCallException {
    public WrongTypeCalledElementException(String message) {
        super(message);
    }
}
