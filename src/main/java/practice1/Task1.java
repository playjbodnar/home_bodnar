package practice1;

import java.util.Scanner;

public class Task1 {

    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("how much 1kg of candies costs?");
        double candisPrice = scanner.nextDouble();
        System.out.println("how much 1kg of cookies costs?");
        double cookiesPrice = scanner.nextDouble();

        double firstPurchase = 0.3 * candisPrice + 0.4 * cookiesPrice;
        double secondPurchase = 3 * ( 1.8 * candisPrice +  2 * cookiesPrice);

        System.out.printf("First purchase costs: %.2f %n", firstPurchase);
        System.out.printf("Second purchase costs: %.2f %n", secondPurchase);

    }
}
