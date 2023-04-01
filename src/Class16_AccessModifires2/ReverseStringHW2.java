package Class16_AccessModifires2;

public class ReverseStringHW2 {

    /*2) Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.*/

    public String Reversed(String str){
        String newStr="";
        for (int i =str.length()-1; i >=0 ; i--) {
            newStr+=str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        ReverseStringHW2 reverse=new ReverseStringHW2();
        System.out.println(reverse.Reversed("Selab"));
    }
}
