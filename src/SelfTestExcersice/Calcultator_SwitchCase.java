package SelfTestExcersice;
import java.util.Scanner;
public class Calcultator_IfElse_SwitchCase {
    public static void main(String[] args) {

        Scanner selab=new Scanner(System.in);

        System.out.println("Enter Two Numbers :");
        int num1=selab.nextInt();
        int num2=selab.nextInt();
        char opreator=selab.next().charAt(0);

        switch(opreator){
            case'+':
                System.out.println("The Result is :"+(num1+num2));
                break;
            case'-':
                System.out.println("The Result is :"+(num1-num2));
                break;
            case'*':
                System.out.println("The Result is :"+(num1*num2));
                break;
            case'/':
                System.out.println("The Result is :"+(num1/num2));
                break;
            default:
                System.out.println("Invalid Key");







        }
    }
}
