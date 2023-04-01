package HomeWorks;

public class EvenHW {
    public static void main(String[] args) {

     /*   Print even numbers from 20 to 1 (2 ways)

        Print odd numbers between 20 and 50 (2 ways)*/

        int a=1;
        while(a<=20){
            if(a%2==0){
                System.out.println("Even "+a);
            }
            a++;
        }
        System.out.println("_________________");
        int b=1;
        while(b<=20){
            if(b%2!=1){
                System.out.println("Even "+b);
            }
            b++;
        }
    }
}
