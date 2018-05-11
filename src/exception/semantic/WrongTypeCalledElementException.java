package exception.semantic;

public class WrongTypeCalledElementException extends StructureElementCallException {
    public WrongTypeCalledElementException(String message) {
        super(message);
    }
}
