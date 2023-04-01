package Class10_2DArrays;

import java.util.Arrays;
import java.util.Scanner;
public class ScannerAndArraysNotes {
    public static void main(String[] args) {


       /* numbers[0]=23;
        numbers[1]=22;
        numbers[2]=25;
        numbers[3]=11;
        numbers[4]=51;*/
        // System.out.println(Arrays.toString(numbers));in this method we don't
        // need to use loop to print arrays and import the arrays object.


        //bellow code take the numbers from user and store them in array.
        int [] numbers=new int[6];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 6 numbers ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));


    }


}
