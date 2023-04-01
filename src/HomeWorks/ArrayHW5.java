package HomeWorks;

public class ArrayHW5 {
    public static void main(String[] args) {
        /* 5) Create an array of size 5 on integers and calculate the sum of even elements in an array .*/

        int[] numbers = {23,44,55,21,34,55};

        int sum=0;

        for(int i= 0; i<numbers.length;i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}