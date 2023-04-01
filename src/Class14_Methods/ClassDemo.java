package Class14_Methods;

public class ClassDemo {
    public static void main(String[] args) {

        String str1="Hello";
        String str2="Java";


        System.out.println(str1+" "+str2);

        System.out.println(str1.replace(str1,str2+" ")+str2.replace(str2,str1));
        System.out.println();

    }
}
