package Class10_2DArrays;

import java.util.Arrays;

public class HW2DArraysSum {
    public static void main(String[] args) {
        // Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

        int[][] arr= {{12,3,5,6},{12,33,44,5,6,},{3,2,11,56,}};

        int sum=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                System.out.print(arr[i][j]+" ");

                sum=sum+arr[i][j];
            }
            System.out.println();
            }
        System.out.println(sum+" ");


    }
}
