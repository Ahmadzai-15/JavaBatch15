package SelfTestExcersice;

import java.util.Arrays;

public class D2ArraysSum {
    public static void main(String[] args) {
        //Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.


        int[][] arr= {{12,12,23,2,3},{2,3,4,5,6,},{2,33,45,11}};


        int sum=0;

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.println(arr[i][j] + " ");
                sum = sum + arr[i][j];
            }

            System.out.println();



        }
        System.out.println();
        System.out.print("The Sum of all number is: "+sum);

    }
}
