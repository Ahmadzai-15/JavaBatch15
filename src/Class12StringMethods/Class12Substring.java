package Class12StringMethods;

public class Class12Substring {

    // this method returns the new String from this index.
    public static void main(String[] args) {

        String str="send it to support channel.  more java ";
        String newStr=str.substring(28);
        System.out.println(newStr);
        System.out.println(str.substring(0,27));
    }
}
