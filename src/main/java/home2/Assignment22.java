package home2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

public class Assignment22 {

    static int number;

    public static List<Integer> parseAndPrint(int number){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0;number > 0;i++){
            int lastNumber = number % 10;
            numbers.add(lastNumber);
            number = (number - lastNumber) / 10;
        }
        return numbers;
    }

    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for(int x: numbers){
            max = max > x ? max : x;
        }
        return max;
    }

    public static int findMin(List<Integer> numbers){
        int min = numbers.get(0);
        for(int x: numbers){
            min = min < x ? min : x;
        }
        return min;
    }

    public static void main(String[] args) {
        number = 956709;
        System.out.printf("Number: %d%n", number);
        System.out.printf("Max digit:%d%n", findMax(parseAndPrint(number)));
        System.out.printf("Min digit:%d%n", findMin(parseAndPrint(number)));
    }
}
