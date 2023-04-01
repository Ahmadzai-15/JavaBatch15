package HomeWorks;

public class ArrayPrimeNumberHW7 {
    public static void main(String[] args) {
        //7)Write a java program to check whether a given number is prime or not?
        int[]number={12,3,45,5,3,1};

        for (int i = 1; i <=5 ; i++) {
            if (number[i]%1==0) {

                System.out.println("prime number is "+number[i]);
            }

        }
    }
}
