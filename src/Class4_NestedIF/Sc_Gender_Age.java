package Class4;

import java.util.Scanner;

public class Sc_Gender_Age {
    public static void main(String[] args) {

        Scanner selab = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        String gender = selab.next();
        System.out.println("Please enter your age");
        int age = selab.nextInt();
        if (age < 25)
            if (gender.equals("F")) {
                System.out.println("Women");
            } else {
                System.out.println("Girl");
            }


        if (age < 25)
            if (gender.equals("M")) {
                System.out.println("Man");

            } else {
                System.out.println("Boy");
            }

    }
}







