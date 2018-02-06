package home1;

public class Assignment11 {


    public static long calculate(long x, long y, long z, long n){
        return x + (y - 100) * z / n;
    }
    public static int calculate(int x, int y, int z, int n){
        return (x - (50 + y * z) * n) + x;
    }
    public static float calculate(float x, float y, float z, float n){
        return x * (y / (z-1) + 555) - n;
    }
    public static double calculate(double x, double y, double z, double n){
        return (-1)*x / y + z * (n+1);
    }

    public static void main(String[] args) {
        long x1 = 10;
        long y1 = 110;
        long z1 = 4;
        long n1 = 2;
        System.out.printf("first result is: %d (should be 30) %n", calculate(x1, y1, z1, n1));

        int x2 = 310;
        int y2 = 2;
        int z2 = 10;
        int n2 = 3;
        System.out.printf("second result is: %d (should be 410) %n", calculate(x2, y2, z2, n2));

        float x3 = 1;
        float y3 = 5;
        float z3 = 3;
        float n3 = 500;
        System.out.printf("third result is: %f (should be 57.5) %n", calculate(x3, y3, z3, n3));

        double x4 = -2.0;
        double y4 = 5.0;
        double z4 = 0.2;
        double n4 = 1.0;
        System.out.printf("third result is: %f (should be 0.8) %n", calculate(x4, y4, z4, n4));

    }

}
