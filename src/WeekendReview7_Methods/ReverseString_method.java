package WeekendReview7_Methods;

public class ReverseString_method {
    String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        ReverseString_method reverseString=new ReverseString_method();
        System.out.println(reverseString.reverseString("Hello"));
    }
}
