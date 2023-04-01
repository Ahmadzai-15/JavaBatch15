package Class33_Exception02;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
            //System.out.println(10/0);
            System.out.println("3");
        }catch (ArithmeticException ae){
            System.out.println("4");
            System.out.println(10/0);
            System.out.println("5");
        }
        finally {
            System.out.println("It will always be executed ");
        }
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
    }
}
