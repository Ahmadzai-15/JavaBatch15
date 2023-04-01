package WeekendClassReview6;

public class JavaMethods {
    public static void main(String[] args) {

        String str="Hello";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(1));
        System.out.println(str.isEmpty());

        String str1="Hello is my world";
        String[]array=str1.split(" ");
        for(String s:array){
            System.out.println(s);
        }



    }
}
