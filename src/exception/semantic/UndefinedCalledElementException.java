package exception.semantic;

public class UndefinedCalledElementException extends StructureElementCallException {
    public UndefinedCalledElementException(String message) {
        super(message);
    }
}
