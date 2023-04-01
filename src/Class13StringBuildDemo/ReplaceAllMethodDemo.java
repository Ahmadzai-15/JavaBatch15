package Class13StringBuildDemo;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
// how to avoid a number to print in String


        String str = "kJDKJDZLMNOPFj452nfjdnf384834%^&((()";
        //replaces All upper case letters from A to Z
        System.out.println(str.replaceAll("[A-Z]", "#"));
        //replaces All lower case letters from a to z
        System.out.println(str.replaceAll("[a-z]", "#"));
        //replaces All lower case letters from 0 to 9
        System.out.println(str.replaceAll("[0-9]", "#"));
        //replaces All lower case letters from A-Z and lower case letters from a-z
        System.out.println(str.replaceAll("[A-Za-z]", "#"));
        //replaces All lower case letters from A-Z and lower case letters from a-z and numbers as well
        System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
        //Do not replace (^)All lower case letters from A-Z and lower case letters from a-z
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "#"));
        // it just remove the mention characters so leave the "blank"
        System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));


    }
}





