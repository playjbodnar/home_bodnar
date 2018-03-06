package home4;

/**
toString нужно переопределить во всех фигурах
**/
public class Circle extends Shape {


    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        shapeName = "Circle";
    }

    @Override
    public double caculateSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public double caculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    protected void printParameters() {
        System.out.printf("radius = %f%n", radius);
    }
}
