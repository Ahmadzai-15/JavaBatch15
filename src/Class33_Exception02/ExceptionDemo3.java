package Class33_Exception02;

public class ExceptionDemo3 {
    public static void main(String[] args) {

        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        System.out.println("Line 5");
        System.out.println("Line 6");

        // here we put the code which might throw an error
       // System.out.println(10/0);
        String str="Java";
        str.charAt(10);

        System.out.println("Line 7");
        System.out.println("Line 8");
        System.out.println("Line 9");
    }
}
