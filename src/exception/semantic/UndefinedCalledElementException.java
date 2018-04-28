package exception.semantic;

public class UndefinedCalledElementException extends StructElementCallException {
    public UndefinedCalledElementException(String message) {
        super(message);
    }
}
