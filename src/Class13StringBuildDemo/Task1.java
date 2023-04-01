package Class13StringBuildDemo;

public class Task1 {
    public static void main(String[] args) {

        /*1) Create a String that will hold a sentence. Write a program to get a new String without
        any spaces.*/

        String sentence = "This is a sample sentence.";
        String newSentence = sentence.replaceAll(" ","");
        System.out.println(newSentence);
    }
}
