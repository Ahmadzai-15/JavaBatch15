package SelfTestExcersice;

public class Test1 {
    public static void main(String[] args) {


        String str=("WelCome, and, Java, Test");
       String arr[]=str.split(" ");


        for (int i =str.length()-1 ; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println(" ");




    }
}
