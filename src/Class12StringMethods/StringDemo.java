package Class12StringMethods;

public class StringDemo {
    public static void main(String[] args) {
        String str=new String("Java"); // one way of creating String

        String str1="Java";
        // Second way for String and mostly used to create objects fo String Class.

        System.out.println(str1.length());
        String str2="Banana ";
        int len=str2.length();
        System.out.println(len);
        String name="Naqibullah Ahmadzai";
        if(name.length()>10){
            System.out.println("Name cant be mote than 10 letters");

        }
    }
}
