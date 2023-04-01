package Class15_AccessModifires1;

public class Task5 {

    // 5) Write a method to return whether given number is prime or not?
    boolean isPrime(int num) {
        boolean isPrime = true;
        if (num<=1){
            isPrime=false;
        }else if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }

        }
        return isPrime;
    }

    public static void main(String[] args) {
        Task5 task5=new Task5();
        int num=11;
        System.out.println(task5.isPrime(num));

    }
}

