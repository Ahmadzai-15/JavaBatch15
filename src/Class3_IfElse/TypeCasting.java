package Class3_IfElse;

public class TypeCasting{
    public static void main(String[] args) {


        long number=125;
        byte shorterNumber=(byte) number;
        float f=10.5f;
        int num=(int)f;
        System.out.println(shorterNumber);
        System.out.println(num);
        /*
        * byte
        * short
        * int
        * long
        * floaat
        * double
        * if we try to store the contents from a smaller to larger box
        * java doesn't complain bcz the content can easily fit inside the larger box
        * but if we use the other way around we get an error
        * and we need to type cast it to store the contents.*/
        byte b= 10;
        int number2=b;
        short c=(short) number2;
        System.out.println(b);

        float eggs=12.5f;
        int wholepart=(int)eggs;
        System.out.println(wholepart);



    }}
