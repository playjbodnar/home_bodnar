package home4;

public class Triangle extends Shape {


    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) {
        shapeName = "Triangle";
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double caculateSquare() {
        double p = caculatePerimeter()/2;
        return Math.sqrt(p*(p - side1)*(p - side2)*(p - side3));
    }

    @Override
    public double caculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    protected String getParametersString() {
        return String.format("side1 = %f%n side2 = %f%n side3 = %f%n", side1, side2,side3);
    }

}
