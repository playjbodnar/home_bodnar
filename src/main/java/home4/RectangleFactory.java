package home4;

public class RectangleFactory extends ShapeFactory{

    @Override
    public Rectangle create() {
        double width = getParameter("width");
        double height = getParameter("height");
        return new Rectangle(width, height);
    }
}
