package home4;

public class Square extends Shape {

    private final double side;

    public Square(double side) {
        shapeName = "Square";
        this.side = side;
    }

    @Override
    public double caculateSquare() {
        return side * side;
    }

    @Override
    public double caculatePerimeter() {
        return 4 * side;
    }

    @Override
    protected void printParameters() {
        System.out.printf("side = %f%n", side);
    }
}
