package exception.semantic;

public class RedefiningParamException extends FunctionException {
    public RedefiningParamException(String message) {
        super(message);
    }
}
