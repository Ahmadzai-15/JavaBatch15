package Class13StringBuildDemo;

public class SwapTowString {
    public static void main(String[] args) {

        //6) How would you swap  2 strings without a temporary variable?

        String s1="Hello";
        String s2="Java";

        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println(s1+"  "+s2);


        //Second method
        String str1="strawberry";
        String str2="blueberry";
        System.out.println(str1.replace(str1,str2));
        System.out.println(str2.replace(str2,str1));

        System.out.println("After swap str1 is "+str1.replace(str1, str2)+" and str2 is "+str2.replace(str2, str1));


    }
}
