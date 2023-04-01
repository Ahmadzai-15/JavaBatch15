package Class8_NestedLoop;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please Enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the totalPrice amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scanner.nextDouble();

        if(amountPaid>totalPrice){
            double chang=amountPaid-totalPrice; //
            System.out.println("Hey here is your change "+chang);
        }
        System.out.println("Thank you for shopping!");



    }
}
