package Class12StringMethods;

public class StringDemo5Equal {
    public static void main(String[] args) {

        String str="Java";
        String str2="Java";
        boolean areEqual=str.equals(str2);
        System.out.println(areEqual);

        // to IgnoreCase
        String str3="Java";
        String str4="Java";
        boolean areEqual2=str3.equalsIgnoreCase(str4);
        System.out.println(areEqual);

    }
}
