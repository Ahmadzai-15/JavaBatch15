package Class11_OOP;

import java.util.Arrays;

public class D2ArrayRecap {
    public static void main(String[] args) {

        int [][] matrix={{10,20,30},
                {45,55,66},
                {30,40,20,10,25}

        };

        System.out.println(matrix[2][4]);
        System.out.println(Arrays.toString(matrix[0]));
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(matrix[0][i]);
        }
        int[] arr=matrix[0]; // getting complete first array from 2D array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("^^^^^^^^^^^^^^^^^^^^^");

        //if we want to print all arrays so can use this method so use nested loop array

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { //matrix[i].length the size of eact 1D array
                //matrix.length tells how many 1D arrays aree in this 2D arrays.
                System.out.print(matrix[i][j]+" ");
    }
            System.out.println();
        }
    }
}

