package home3.task4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Assignment34 {


    public static int[][] buildMatrix(int size){
        int n = size;
        int[][] matrix = new int[n][n];
        int counter = 1;
        int index = 0;
        for(int d = 0; d < 2*n-1; d++){
            for(int i = index; (i <= d)&&(i < n); i++){
                if(d%2 == 0){
                    matrix[i][d-i] = counter;
                } else {
                    matrix[d-i][i] = counter;
                }

                counter++;
            }
            if(d >= n-1){
                index++;
            }
        }
        return matrix;

    }
    public static void main(String[] args) {

        int size = 5;
        int[][] matrix = buildMatrix(size);

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(matrix[i][j] + (matrix[i][j]>99?"  ":(matrix[i][j]>9?"   ":"    ")));
            }
            System.out.println();
        }


    }
}
