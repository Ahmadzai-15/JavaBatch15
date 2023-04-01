package Class8_NestedLoop;
import java.util.Scanner;
public class HW2ScannerCreditCard {
    public static void main(String[] args) {
       /* Create a program that will be asking user to apply for a credit card 10 times.
          As soon you get an “yes” from a user program should stop asking.*/

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Do you Need credit card");
            String UserResponse=sc.next();
            if(UserResponse.equalsIgnoreCase("yes")){
                break;
            }


        }
    }
}
