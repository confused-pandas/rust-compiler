package exception.semantic;

public class WrongNumberCalledElementException extends StructElementCallException {
    public WrongNumberCalledElementException(String message) {
        super(message);
    }
}
