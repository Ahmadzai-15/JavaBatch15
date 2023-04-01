package Class17_AccessModifires3;

public class Task3 {
    public static void main(String[] args) {
        /*    Create a method that will accept a String as a parameter
and return a new String that consist only of vowels.
Method should be available inside the class only
where it was declared and executed by calling it is name.
return type=> String
name => getOnlyVowels
parameters=> String inputStr
*/
        System.out.println(getOnlyVowels("Java"));

    }

    private static String getOnlyVowels(String inputStr){
        // AEIOUY aeiouy
        // Asghar => Aa
        return inputStr.replaceAll("[^AEIOUYaeiouy]","");
    }
}
