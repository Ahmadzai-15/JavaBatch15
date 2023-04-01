package Class12StringMethods;

public class MaxString_Method {
    /*Create the maxLength method that will accept String array of words and return
    the word with the largest length.Method should visible only within same package!
    **Expected Output:**this is long*/

    String maxLength(String[]words){
            String maxWord = "";
            for (String word : words) {
                if (word.length() > maxWord.length()) {
                    maxWord = word;
                }
            }
            return maxWord;
        }

    public static void main(String[] args) {

        MaxString_Method main=new MaxString_Method();
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(main.maxLength(arr));
        //should print "this is long"

    }

}


