package calculator;

public class RootPow implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        if(left > 0){
            return Math.pow(left, 1/right);
        }
        else {
            return - Math.pow((-1)*left, 1/right);
        }
    }
}
