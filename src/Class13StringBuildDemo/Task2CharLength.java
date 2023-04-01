package Class13StringBuildDemo;

public class Task2CharLength {
    public static void main(String[] args) {

        /*2) Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphanumeric(abd AZ 284) characters are there in the String.*/


        String str="Hello Syntax 123456 &)(&@#$ HELLO SYNTAX";
        System.out.println(str.replace("[^A-Z a-z0-9]"," ").length());


    }
}
