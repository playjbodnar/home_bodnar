package home1;

public class Assignment12 {

    public static void parseAndPrint(int number){
        for(int i = 0;number > 0;i++){
            int lastNumber = number % 10;
            System.out.println(lastNumber);
            number = (number - lastNumber) / 10;
        }
    }

    public static void main(String[] args) {
        int number = 12547896;
        System.out.println(number);
        parseAndPrint(number);
    }
}
