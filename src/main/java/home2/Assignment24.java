package home2;

public class Assignment24 {

    public static int calculatePowerOfTwo(int n){
        if (n==1){
            return 0;
        }
        if ((n%2 == 1)||(n <= 0)||(calculatePowerOfTwo(n/2)==-1)){
            return -1;
        }
        return calculatePowerOfTwo(n/2)+1;
    }

    public static void main(String[] args) {
        int number = 128;
        int power = calculatePowerOfTwo(number);
        if (power == -1){
            System.out.printf("Number %d is not a power of 2", number);
        } else {
            System.out.printf("Number %d is %d power of 2", number, power);
        }
    }


}
