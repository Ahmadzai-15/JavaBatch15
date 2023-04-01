package Class12StringMethods;

public class StringDemo7StratWith {
    public static void main(String[] args) {
        String str="I love java";
        boolean startWith=str.startsWith("I");
        System.out.println(startWith);

        //only those method ca be chianed which returns a string
        System.out.println(str.endsWith("java"));

        System.out.println(str.toLowerCase().startsWith("i"));

        System.out.println(str.contains("java"));
    }
}
