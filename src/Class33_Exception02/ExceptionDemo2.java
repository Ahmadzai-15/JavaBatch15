package Class33_Exception02;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        System.out.println("Line 5");
        System.out.println("Line 6");
        try {
            // here we put the code which might throw an error
            System.out.println(10/0);
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException npe){
            System.out.println("You are trying to accessing a method on a null object");
        }catch (ArithmeticException e){
            System.out.println("Some one is trying to divide by 0");
        }
        System.out.println("Line 7");
        System.out.println("Line 8");
        System.out.println("Line 9");
    }
}
