package Project01;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //Create a 2D array or integer type
        // where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2D array of 2*3");
        int arr[][]=new int[2][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=scan.nextInt();

            }
        }
        System.out.println("Even numbers from array ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2==0)

                    System.out.println(+arr[i][j]);

            }
        }

    }
}
