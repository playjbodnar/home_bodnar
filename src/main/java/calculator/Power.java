package calculator;

public class Power implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, right);
    }
}
