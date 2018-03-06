package home4;

public enum ShapeSelector {

    CIRCLE(1, new CircleFactory()),
    TRIANGLE(2, new TriangleFactory()),
    SQUARE(3, new SquareFactory()),
    RECTANGLE(4, new RectangleFactory());

    int id;
    ShapeFactory shapeFactory;

    private ShapeSelector(int id, ShapeFactory shapeFactory){
        this.id = id;
        this.shapeFactory = shapeFactory;
    }

    public static ShapeSelector getById(int id) throws IllegalAccessException {
        if (id > 5){
            throw new IllegalAccessException();
        } else if (id == 5){
            System.exit(0);
        }
        return values()[id - 1];
    }
}
