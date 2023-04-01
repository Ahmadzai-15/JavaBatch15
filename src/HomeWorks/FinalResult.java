package HomeWorks;
import java.util.Scanner;
public class FinalResult {
    public static void main(String[] args) {


        /*3) Write a program that will read three inputs of scores (quiz, mid term, and final
        scores) and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F*/


        Scanner scan=new Scanner(System.in);
        int number=0;

        System.out.println("Enter your Score :");
        number=scan.nextInt();

        if(number>=90 &&(number<=100)){
            System.out.println("Grade A");
        }else if(number>=70&&(number<=90)){
            System.out.println("Grade B");
        }else if(number>=50&&(number<=70)){
            System.out.println("Grade C");
        }else {
            System.out.println("Grade F ");
        }
    }
}
