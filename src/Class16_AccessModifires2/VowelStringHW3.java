package Class16_AccessModifires2;

public class VowelStringHW3 {
    /*
    3) Create a method that will accept a String as a parameter and return a new String
    that consist only of vowels. Method should be available inside the class only where it was declared
    and executed by calling it is name.*/

    private String Vowels(String str) {
        return str.replaceAll("[^aeiou]","");
    }

    public static void main(String[] args) {
        VowelStringHW3 vowel = new VowelStringHW3();
        System.out.println(vowel.Vowels("aesdfiosdfgfgu"));
    }
}