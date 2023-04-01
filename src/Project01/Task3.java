package Project01;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Create a 2D array of integer values. Print the sum of all numbers.
        int arr[][]=new int[3][2];
        int sum=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 2D array 3*2");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]= scan.nextInt();
                sum=sum+arr[i][j];
            }
        }
        System.out.println("Sum = "+sum);
    }
}
