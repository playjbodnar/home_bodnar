package calculator;

public class RootPow implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, 1/right);
    }
}
