package HomeWorks;
import java.util.Scanner;
public class BonusHW {
    public static void main(String[] args) {
        /*Write a program to ask user to enter numbers of worked years and annual salary.
        If user worked for more or equals to 5 years than user is eligible for the bonus,
         otherwise he is not. Once user is eligible and salary is larger than 50000
         than bonus = 5000, otherwise bonus=3000.*/

    Scanner selab=new Scanner(System.in);
    int salary=50000;
    int years=2;
        System.out.println("enter your salary");
        salary=selab.nextInt();

        System.out.println("How many  years of experince you have ?");
        years=selab.nextInt();
        if(salary>=50000){
            System.out.println("Your are elegible for 5000 bonus");

        }else
            System.out.println("you are elegiible for 3000 bonus");
    }
}
