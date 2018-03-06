package home4;


abstract public class Shape {

    protected String shapeName = null;

    abstract public double caculateSquare();
    abstract public double caculatePerimeter();

    abstract protected void printParameters();

    public void printShape(){
        System.out.printf("%s with parameters:%n", shapeName);
        printParameters();
        System.out.printf("%n  square is %f%n  perimeter is %f",caculateSquare(),caculatePerimeter());
    }
}
