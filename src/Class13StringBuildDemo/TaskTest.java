package Class13StringBuildDemo;

public class TaskTest {
    public static void main(String[] args) {


        String st1="Hello";
        String st2="Java";

        st1=st1+st2;
        st2=st1.substring(0 ,st1.length()-st2.length());
        st1=st1.substring(st2.length());

        System.out.println(st1);
        System.out.println(st2);


    }
}
