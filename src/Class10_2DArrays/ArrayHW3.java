package Class10_2DArrays;

import java.util.Arrays;

public class ArrayHW3 {
    public static void main(String[] args) {
        //3) Create a 2D array of integer values. Print the sum of all numbers.

        int[][]numbers= {{2,4,6,8,},{8,6,4,2}};

        int total=0;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                total=total+numbers[i][j];
            }

        }

        System.out.println("The Total sum is equal to "+total);
    }
}
