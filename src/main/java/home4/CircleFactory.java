package home4;

public class CircleFactory extends ShapeFactory{

    @Override
    public Circle create() {
        double radius = getParameter("radius");
        return new Circle(radius);
    }

}
