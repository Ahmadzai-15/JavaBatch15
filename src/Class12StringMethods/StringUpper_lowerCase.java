package Class12StringMethods;

public class StringUpper_lowerCase {
    public static void main(String[] args) {

        //Converting String to UperCase
        String str="JAVA is FUN";

        String newStr =str.toLowerCase(); // both are same result
        System.out.println(newStr); //both are same result

        // convert String to UperCase below methods

        String str2="i love java";
        String upperCaseLetter=str2.toUpperCase();
        System.out.println(upperCaseLetter);
    }
}
