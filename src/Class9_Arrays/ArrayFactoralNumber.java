package Class9_Arrays;

import java.util.Scanner;

public class ArrayFactoralNumber {
    public static void main(String[] args) {

        int i,num,fact=1;
        System.out.println("Enter the Number ");
        Scanner selab=new Scanner(System.in);
        num=selab.nextInt();

        for (int j = 1; j <=num ; j++) {
            fact=fact*j;
            }
        System.out.println("Factorial Number "+ num+ " is = "+fact);
    }
}
