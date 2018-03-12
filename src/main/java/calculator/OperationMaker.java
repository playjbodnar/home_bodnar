package calculator;

public class OperationMaker {

    private final String operator;

    public OperationMaker(String operator) {
        this.operator = operator;
    }

    public BinaryOperation getOperation() throws IndeterminableOperatorException {
        switch (operator) {
            case "+":
                return new Addition();
            case "-":
                return new Substraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            case "^":
                return new Power();
            case "log":
                return new Logarithm();
            case "root":
                return new RootPow();
            default:
                throw new IndeterminableOperatorException();
        }

    }
}
