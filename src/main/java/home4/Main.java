package home4;

import java.util.Scanner;

public class Main {

    static ShapeFactory shapeFactory;
    static Scanner scanner = new Scanner(System.in);
    static final String USAGE = "Enter number of item to select shape:\n" +
            "1. CIRCLE\n" +
            "2. TRIANGLE\n" +
            "3. SQUARE\n" +
            "4. RECTANGLE\n" +
            "5. Exit program\n";


    public static void main(String[] args) {
       while (shapeFactory == null){
            System.out.println(USAGE);
            if (scanner.hasNextInt()){
                try {
                    shapeFactory = ShapeSelector.getById(scanner.nextInt()).shapeFactory;
                } catch (IllegalArgumentException e) {
                    System.out.println("There is no shape with such number\n ");
                }
            }
        }
        shapeFactory.create().printShape();
    }

}
