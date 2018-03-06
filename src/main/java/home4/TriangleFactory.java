package home4;

public class TriangleFactory extends ShapeFactory {

    @Override
    public Triangle create() {
        double side1 = getParameter("side1");
        double side2 = getParameter("side2");
        double side3 = getParameter("side3");
        return new Triangle(side1, side2, side3);
    }
}
