package Class7_Loop;
import java.util.Scanner;
public class Task01whileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number=0;
        do{
            System.out.println("Please enter a number");
            number=scanner.nextInt();
        }while(number!=5);

        System.out.println("**********************");

        int number2=5;
        while (number2 != 5){
            System.out.println("Please enter a number : ");
            number2=scanner.nextInt();

        }
    }
}
