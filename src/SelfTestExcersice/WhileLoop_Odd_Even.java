package SelfTestExcersice;

public class WhileLoop_Odd_Even {
    public static void main(String[] args) {

        /*Print even numbers from 20 to 1 (2 ways)*/

        int number=1;
        while(number<=20) {
            if (number % 2 != 1) {
                System.out.println("Even Number: " + number);}
            number++;}
        System.out.println("**************");
       int number1=1;
        while(number1<=20) {
            if (number1 % 2== 0) {
                System.out.println("Even Number: " + number1); }
            number1++;}






    }
}
