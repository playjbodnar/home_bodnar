/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Root;

/**
 *
 * @author Andrey
 */
public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public double calculate(double val1, double val2, String operator) {
        BinaryOperation operation = getOperationFor(operator);
        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }

        return operation.resultFor(val1, val2);
    }

    private BinaryOperation getOperationFor(String operator) {
        switch(operator){
            case "+":
                return new Addition();
            case "-":
                return new Substraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            case "^":
                return new Power();
            case "log":
                return new Logarithm();
            case "root":
                return new RootPow();
        }
        return null;
    }

    private static String[] parceExpression(){
        System.out.println("Enter operation");
        String inputString = null;
        if(scanner.hasNextLine()){
            inputString = scanner.nextLine();
        }
        return inputString.split(" ");
    }

    public static void main(String[] args) {

        String[] expression = parceExpression();
        double left = Double.parseDouble(expression[0]);
        String operator = expression[1];
        double right = Double.parseDouble(expression[2]);
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(left, right, operator));
    }
}
