package Class9_Arrays;

public class ArrayDemo3 {
    public static void main(String[] args) {

        // Create an array to store the letters A B c d e F

        char [] letters={'A','B','c','d','e','F'};
        letters[0]='z'; // <========================< NOTES :updating the element at index 0
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }
}
