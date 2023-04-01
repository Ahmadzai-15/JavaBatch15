package Class8_NestedLoop;

public class WhileLoop_Recap {
    public static void main(String[] args) {
        int a =0;
        while(a<=100){
            if(a%2==0)
            System.out.println(a);
            a++;
        }

        System.out.println("******************");

        int number=10;
        while (number<20){
            System.out.println(number<20);
            if(number<15){
                System.out.println("number is still less than 15");
            }else {
                System.out.println("Number is greater than 15 now");
            }
            System.out.println(number);
            number++; // increases the value of number variable by one when ever executed

        }
    }
}
