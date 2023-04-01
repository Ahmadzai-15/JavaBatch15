package Class4;
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        //Bellow line helps us get the input from the keywards.
        Scanner input=new Scanner(System.in);
        System.out.println(" Please enter your name");
        String name=input.nextLine();//nextline is used for when we have to take sentance from the keyboard
        System.out.println("My name is "+name);



    }
}
