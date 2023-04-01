package SelfTestExcersice;
import java.util.Scanner;
public class CalculatorIfElse {
    public static void main(String[] args) {

        Scanner selab=new Scanner(System.in);

        System.out.println("Enter the number");
        int num1=selab.nextInt();
        int num2=selab.nextInt();
        System.out.println("Select Opreator");
        char opreator=selab.next().charAt(0);


        if(opreator=='+'){
            System.out.println(num1+num2);
        }else if(opreator=='_'){
            System.out.println(num1-num2);
        }else if(opreator=='*'){
            System.out.println(num1*num2);
        }else if(opreator=='/'){
            System.out.println(num1/num2);
        }else{
            System.out.println("Invalid key");
        }
    }
}
