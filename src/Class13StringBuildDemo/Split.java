package Class13StringBuildDemo;

public class Split {
    public static void main(String[] args) {

        String str="I like java. I write a lot of code daily. I am from batch 15.";
        String [] strArr=str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
        //whenever we are working with arrays we use the length and whenever we are working with Strings
        // we use the length()
    }
}
