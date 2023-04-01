package Class4;
import java.util.Scanner;
public class HW_Sc_NestedIf_Condition {
    public static void main(String[] args) {

        Scanner selab = new Scanner(System.in);

        System.out.println("Please enter 3 distinct numbers");

        int num1 = selab.nextInt();
        int num2 = selab.nextInt();
        int num3 = selab.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The largest number is "+num1);
            }else if(num1<num3){
                System.out.println("The largest number is "+num3);
            }
        }else if(num2>num3){
            System.out.println("The largest number is "+num2);
        }else{
            System.out.println("The largest number is "+num3);
        }
    }
}