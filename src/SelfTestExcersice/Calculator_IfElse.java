package SelfTestExcersice;
import java.util.Scanner;
public class Calculator_IfElse {
    public static void main(String[] args) {

        Scanner selab=new Scanner(System.in);

        System.out.println("Enter First Number :");
        double num1=selab.nextDouble();

        System.out.println("Enter Second Number :");
        double num2=selab.nextDouble();

        System.out.println("Press 1 For Addition");
        System.out.println("Press 2 For Subtract");
        System.out.println("Press 3 For Multiplication");
        System.out.println("Press 4 For Division");
        System.out.println("Enter Your Choice");

        double choice=selab.nextDouble();

        if(choice==1){
            System.out.println("Addition:"+(num1+num2));
        }else if(choice==2){
            System.out.println("Subtract:" +(num1-num2));
        }else if(choice==3){
            System.out.println("Multiplication:"+(num1*num2));
        }else if(choice==4){
            System.out.println("Division:"+(num1/num2));
        }else{
            System.out.println("Invalid");
        }

    }
}
