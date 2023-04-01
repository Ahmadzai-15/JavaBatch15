package Class9_Arrays;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        /*

    Write a program that reads a range of integers
    (start and end point), provided by a user and then
    from that range prints the sum of the even and odd integers.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter two Numbers starting point and ending point");
        int start=scanner.nextInt();
        int end=scanner.nextInt();

        System.out.println("start "+start+"  end "+end);

        int evenSum=0; // accumulate
        int oddSum=0;
        for (int i = start; i <=end ; i++) {
            if(i%2==0){
                evenSum+=i; // can also be written like this
            }else {
                oddSum=oddSum+i; // can also be written like this oddSum+=i
            }
        }
        System.out.println("Sum of all the Even Numbers "+evenSum);
        System.out.println("Sum of all the Odd Numbers "+oddSum);

    }
}
