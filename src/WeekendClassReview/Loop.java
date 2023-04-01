package WeekendClassReview;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int a=1;// when we dont know how many time repeat the code we use while or do while
        while(a<=1){
            System.out.println("I am while loop");
            a++;
        }



        Scanner scan=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in java");
            answer = scan.nextLine();
        }while(!answer.equalsIgnoreCase("yes"));
        System.out.println("Lets learn Arrays now");
    }
}
