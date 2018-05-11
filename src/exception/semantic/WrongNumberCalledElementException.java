package exception.semantic;

public class WrongNumberCalledElementException extends StructureElementCallException {
    public WrongNumberCalledElementException(String message) {
        super(message);
    }
}
