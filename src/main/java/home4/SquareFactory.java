package home4;

public class SquareFactory extends ShapeFactory {

    @Override
    public Square create() {
        double squareSide = getParameter("square side");
        return new Square(squareSide);
    }

}
