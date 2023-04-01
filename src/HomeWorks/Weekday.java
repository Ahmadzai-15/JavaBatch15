package HomeWorks;
import java.util.Scanner;
public class Weekday {
    public static void main(String[] args) {
/*
        Write a program that will print whether it is a weekend or weekday. If any day from
        1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other
        day → output “Invalid day” (edited)*/

        int day=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number");
        day=scan.nextInt();

        if(day>=1 && day<=5){
            System.out.println("Weekdays");
        }
        else if(day==6 || day==7){
            System.out.println("Its Weekend");

        }else
            System.out.println("Invalid");
    }
}
