package Class4;
import java.util.Scanner;
public class HW_OddandEven {
    public static void main(String[] args) {
        /*
        Ask the user to enter any number if a user enters a number and it is even, print "Value is even",
         after that it should check if the number is greater than 1000 it should also print even number is
         large otherwise even value is just right.if number is not even it should print number is odd after
         that it should check if odd number is greater than 1000 it should say odd value is large otherwise
         odd value is just right
         */
        Scanner selab = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = selab.nextInt();
        if (num % 2 == 0) {
            System.out.println("Value is even");
            if (num > 1000) {
                System.out.println("Even value is large");
            }
        } else {
            System.out.println("Value is odd");
            if (num > 1000) {
                System.out.println("Odd value is large");
            }
        }

    }
}