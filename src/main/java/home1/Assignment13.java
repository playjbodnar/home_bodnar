package home1;

public class Assignment13 {

    static double x, y, z;

    public static double calculatevectorLength(double x, double y, double z){
        return Math.sqrt(x*x + y*y + z*z);
    }

    public static void main(String[] args) {
        x = 10;
        y = 20;
        z = 30;
        System.out.printf("Длина вектора (%f, %f, %f) = %f %n", x, y, z, calculatevectorLength(x, y, z));
    }


}
