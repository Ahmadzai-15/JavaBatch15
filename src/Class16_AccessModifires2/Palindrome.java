package Class16_AccessModifires2;

public class Palindrome {
    public static void main(String[] args) {

        String str="NADAN";
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if(str.equals(reversedStr)){
            System.out.println("This is Palindrome");
        }else{
            System.out.println("This is not Palindrome");
        }
    }
}
