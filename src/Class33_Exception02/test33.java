package Class33_Exception02;

public class test33 {
    public static void main(String[] args) {

        System.out.println("main method Started");
        int a=10, b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
        }

        System.out.println("Main method ended ");
    }
}
