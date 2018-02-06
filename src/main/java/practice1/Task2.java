package practice1;

import java.util.Scanner;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter time");
        double time = scanner.nextInt();
        System.out.println("enter distance");
        double distance = scanner.nextDouble();

        double speed =  (distance *1000)/(time * 60);

        System.out.printf("speed is %.2f m/s %n", speed);

    }
}
