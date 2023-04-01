package Class8_NestedLoop;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter the name : ");

         while(scanner.next().equalsIgnoreCase("Java")){
             System.out.println("Great Program");
         }
    }
}
