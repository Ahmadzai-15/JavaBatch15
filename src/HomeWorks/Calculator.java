package HomeWorks;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        /*8)HomeWork: Using scanner class create calculator. Allow user to enter 2 numbers and
        operator(+,-,*,/). Based on operator provide the result to user*/

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
