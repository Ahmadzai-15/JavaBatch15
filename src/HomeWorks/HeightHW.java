package HomeWorks;
import java.util.Scanner;
public class HeightHW {
    public static void main(String[] args) {

      /*  1) Prompt the user to enter person heights in inches. Person should be classified
       as one of the following:
        • short (under 60 inch)
        • medium(between 60 -72 inch)
        • tall (over 72 inch)*/
        int height = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter person Height");
        height = sc.nextInt();

        if (height < 60) {
            System.out.println("Short " + height + " inch");

        }
        else if (height>=60 && height <=72) {
            System.out.println("Medium " + height + " inch");
        }else {
            System.out.println("Tall " + height + " inch");
        }

    }}


