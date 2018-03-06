package home4;


abstract public class Shape {

    protected String shapeName = null;

    abstract public double caculateSquare();
    abstract public double caculatePerimeter();

    abstract protected String getParametersString();
    
    @Override
    public String toString(){
        StringBuilder shapeString = new StringBuilder();
        shapeString.append(String.format("%s with parameters:%n", shapeName));
        shapeString.append(getParametersString);
        shapeString.append(String.format(""%n  square is %f%n  perimeter is %f",caculateSquare(),caculatePerimeter()));
    }
    
    
}
