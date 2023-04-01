package SelfTestExcersice;
import java.util.Scanner;
public class Calculator_2_IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();

        System.out.print("Enter the opreator (+, -, *, /): ");
        char opreator = scan.next().charAt(0);
        double result = 0;

        if (opreator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        }
        else if (opreator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        }
        else if (opreator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        }
        else if (opreator == '/') {
            result = num1 / num2;
            System.out.println("Result: " + result);
        }
        else {
            System.out.println("invalid input");
        }


    }
}
