package calculator;

public class InvalidExpressionFormatException extends Exception{

    private final String message = "The expression cannot be parsed";

    @Override
    public String getMessage(){
        return message;
    }
}
