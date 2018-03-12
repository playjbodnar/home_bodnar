package calculator;

public class IndeterminableOperatorException extends Exception {

    private final String message = "The operation cannot be resolved.";

    @Override
    public String getMessage(){
        return message;
    }

}
