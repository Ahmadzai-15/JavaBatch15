package SelfTestExcersice;
import java.util.Scanner;
public class SwitchCaseCalculator {
    public static void main(String[] args) {


        Scanner selab=new Scanner(System.in);
        System.out.println("Enter the number ");

        double num1=selab.nextDouble();
        double num2=selab.nextDouble();

        System.out.println("Select opreator");
        char opreator=selab.next().charAt(0);

        switch(opreator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid key");





        }

    }


}
