package Class9_Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayHW1 {
    public static void main(String[] args) {

        /*1)Using Scanner create an array of integer values. After the array is created,
          calculate the sum of all stored elements in that array.*/

        Scanner selab=new Scanner(System.in);
        int[]number=new int[4];
        int total=0;

        for (int i = 0; i <number.length ; i++) {
            number[i]=selab.nextInt();
            total=total+number[i];

        }

        System.out.println(Arrays.toString(number));
        System.out.println("Total Sum is Equal to : "+total);
    }
}
