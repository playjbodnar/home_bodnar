package home4;

public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        shapeName = "Rectangle";
        this.width = width;
        this.height = height;
    }

    @Override
    public double caculateSquare() {
        return width * height;
    }

    @Override
    public double caculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    protected void printParameters() {
        System.out.printf("width = %f%n", width);
        System.out.printf("height = %f%n", height);
    }
}
