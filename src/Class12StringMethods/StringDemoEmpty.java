package Class12StringMethods;

public class StringDemoEmpty {
    public static void main(String[] args) {
        String str="        ";
        System.out.println(str.isEmpty()); //widely used

        System.out.println(str.isBlank()); // it dose'nt count space
    }
}
