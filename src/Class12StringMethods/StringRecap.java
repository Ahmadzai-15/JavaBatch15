package Class12StringMethods;

public class StringRecap {
    public static void main(String[] args) {
        // how can i print all the letter from this String one by one
        String str="Java is great";
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i));
            
        }


        // count how maney time the letter (A) has appeared in the above String
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == 'a') {
                count++;

            }
        }
        System.out.println(count);

}}
