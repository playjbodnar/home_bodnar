/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

import static java.lang.Double.NaN;

/**
 * @author Andrey
 */
public class Calculator {

    static Parser parser = new Parser();

    public double calculate(double val1, double val2, String operator) {
        BinaryOperation operation = null;
        try {
            operation = new OperationMaker(operator).getOperation();
        } catch (IndeterminableOperatorException e) {
            System.out.println(e.toString());
            return NaN;
        }
        return operation.resultFor(val1, val2);
    }

    public static void main(String[] args) {

        String[] expression = null;
        double result = 0;
        try {
            expression = parser.parceExpression();
        } catch (InvalidExpressionFormatException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        double left = 0;
        double right = 0;
        try {
            left = Double.parseDouble(expression[0]);
            right = Double.parseDouble(expression[2]);
        } catch (NumberFormatException nfe) {
            System.err.println(nfe.toString());
            result = NaN;
        }
        String operator = expression[1];
        Calculator calculator = new Calculator();
        result = calculator.calculate(left, right, operator);
        System.out.printf("result = %f%n", result);
    }
}
