package Class15_AccessModifires1;

public class Palindrome {
     //3) Create a method that will print whether given String is palindrome or not.
     Boolean palindrome(String str){
         StringBuilder sb=new StringBuilder(str);
         if (str.equals(sb.reverse().toString())){
             return true;
         }else{
             return false;
         }


     }

    public static void main(String[] args) {

        Palindrome task3=new Palindrome();
        System.out.println(" is a palindrome ? "+task3.palindrome("Hello"));


// A method which already define in java so we use that direct instead making object for it .
        String str="dad";
        StringBuilder st=new StringBuilder();
        st.reverse();
        String reversedStr=str.toString();
        if(str.equals(reversedStr)){
            System.out.println(str+"is Palindrome");
        }else{
            System.out.println(str+ "Not Is Palindrome");
        }
    }
}


