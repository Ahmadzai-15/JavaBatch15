package SelfTestExcersice;

public class FibonacciSeries {
    public static void main(String[] args) {

        int a=0,b=1,sum=0;

        System.out.print(a+" "+b);
        for (int i = 2; i <10 ; i++) {
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(" "+sum);

        }
    }
}
