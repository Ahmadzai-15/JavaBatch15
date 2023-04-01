package Class13StringBuildDemo;

public class Palindrome {
    public static void main(String[] args) {
        // 5) How would you check if String is palindrome or not? aba=> true Abbc =>false

        String str="NADAN";
        String rev="";

        for (int i = str.length()-1; i >=0 ; i--) {
            rev+=str.charAt(i);
            System.out.println(rev);
        }
        boolean palindrome=true;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)!=rev.charAt(i)){

            }
        }
        if(palindrome){
            System.out.println("Palindrom");

        }else{
            System.out.println("not palindrom");
        }
    }
}
