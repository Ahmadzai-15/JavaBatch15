package WeekendClassReview;
import java.util.Scanner;
public class ScannerInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the your age ");
        int age=scan.nextInt();
        System.out.println("Your are "+age+" Years old");

        System.out.println("Please enter your weight");
        double weight=scan.nextDouble();
        System.out.println("Your weight is "+weight);
    }
}
