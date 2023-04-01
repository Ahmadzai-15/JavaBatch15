package Class9_Arrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

Scanner selab=new Scanner(System.in);
        System.out.println("Enter the number for multiplication");
    int number=selab.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+"*"+number+"="+(number*i));
        }
}
}
