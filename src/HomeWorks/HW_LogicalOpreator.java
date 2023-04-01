package HomeWorks;
import java.util.Scanner;
public class HW_LogicalOpreator {
    public static void main(String[] args) {
        /*
        5) Write a program to find largest of three double values using if-else..
        if and logical operators provided by a user (numbers must be distinct)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Numbers :");
        double val1=scan.nextDouble();
        double val2=scan.nextDouble();
        double val3=scan.nextDouble();



        if(val1>val2 && val1>val3){
            System.out.println("val1 is greater");

        }else if(val2>val1 && val2>val3){
            System.out.println("val2 is greater");
        }else if(val3>val1 && val3>val2){
            System.out.println("val3 is greater");
        }

    }
}
