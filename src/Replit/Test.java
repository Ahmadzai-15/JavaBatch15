package Replit;

public class Test {

        public void print(int number){
            System.out.println (number);
        }
        public void print(double number) {
        System.out.println(number);
        }
        public void print(String name){
            System.out.println (name);

        }
    }
    class Main {

        public static void main(String[] args) {

            Test test =new Test();
            test.print(100);
            test.print(100.09);
            test.print("Syntax Technologies");

        }


    }

