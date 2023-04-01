package SelfTestExcersice;
import java.util.Scanner;
public class USCIS {
    public static void main(String[] args) {


        Scanner selab=new Scanner(System.in);



        int Current=2023;
        int Arrival=2019;


        System.out.println("Enter your arrival year");
        Arrival=selab.nextInt();

        if(Arrival+5<=Current){
            System.out.println("you are eligible to apply for passport");
        }
        else
            System.out.println("Sorry you must wait");
    }
}
