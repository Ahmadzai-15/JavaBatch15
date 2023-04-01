package Class10_2DArrays;

import java.util.Arrays;

public class D2ArraysHW5 {
    public static void main(String[] args) {
        /*5)Create a 2D array of integers. Develop a program which will calculate the sum of
        even and odd numbers for that array.*/
        int total1=0;
        int total2=0;

        int[][]numbers={{2,3,45,6,} ,{8,6,3,1}};

        for (int i = 0; i <numbers.length ; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] % 2 == 0) {
                    total1=+numbers[i][j];
                }else{
                    total2=+numbers[i][j];
                }
            }
        }
        System.out.println("Even Number "+total1);
        System.out.println("Odd Number "+total2);
    }
}
