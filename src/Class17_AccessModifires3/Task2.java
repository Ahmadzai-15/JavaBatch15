package Class17_AccessModifires3;

public class Task2 {
     /*
    Create a method that will take a String as a parameter
     and returns reversed String.
     Method should be available to all classes within your project
     and accessible by class name./
     */

    /*
    static methods can be called by just
    writing the name of the class
    .method name
     */
    public static String reverseStr(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {

      /*
      if we are within the same class we
      don't need the class name as well
       */
        System.out.println(reverseStr("Monday"));
    }
}
