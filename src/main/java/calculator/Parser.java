package calculator;

import java.util.Scanner;

public class Parser {


    static Scanner scanner = new Scanner(System.in);

    public static String[] parceExpression() throws InvalidExpressionFormatException {
        System.out.println("Enter operation");
        String inputString = null;
        if (scanner.hasNextLine()) {
            inputString = scanner.nextLine();
        }
        String[] expressionParts = inputString.split(" ");
        if(expressionParts.length != 3){
            throw new InvalidExpressionFormatException();
        }
        return expressionParts;
    }
}
