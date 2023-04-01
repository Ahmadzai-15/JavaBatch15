package Class12StringMethods;

public class StringReverse {
    public static void main(String[] args) {

        //Create a String and print it in reverse order (Sunday → yadnuS).
        String day="Sunday";
        String reverse="";

        for (int i = day.length()-1; i >=0 ; i--) {
            reverse=reverse+day.charAt(i);
        }
        System.out.print(reverse);


// for int we use below method
       /* int number=12;
        for (int i = 12; i >=0 ; i--) {
            System.out.print(i+" ");
        }*/


    }
}
