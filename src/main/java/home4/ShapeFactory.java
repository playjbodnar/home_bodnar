package home4;

import java.util.Scanner;

abstract public class ShapeFactory {


    private Scanner scanner = new Scanner(System.in);

    public abstract Shape create();

    protected double getParameter(String parameterName) {
        double parameter = 0;
        System.out.printf("Enter parameter: %s%n", parameterName);
        if (scanner.hasNextInt()) {
            parameter = scanner.nextInt();
        }
        return parameter;
    }
}



