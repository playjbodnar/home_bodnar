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
    protected String getParametersString() {
        return String.format("side = %f%n", side);
    }

}
