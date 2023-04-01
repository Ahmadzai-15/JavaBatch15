package Class16_AccessModifires2;

public class Task3Palindrome {
    /*
   Create a method that will print whether given String is palindrome or not
   return type =>void
   name =>ispalindrome
   parameters=> String inputStr
   {
   }
   example dad => dad true
   abc=> cba false
    */
    void isPalindrome(String str) {
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedStr = st.toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + "Is Not palindrome");
        }
    }


    public static void main(String[] args) {
        Task3Palindrome task3 = new Task3Palindrome();
        // String result=  task3.isPalindrome("Kaya"); can't assign void methods to variables
        //  System.out.println(task3.isPalindrome("Kaya")); can't use void methods in PrintLn
        task3.isPalindrome("kaya: ");

    }
}