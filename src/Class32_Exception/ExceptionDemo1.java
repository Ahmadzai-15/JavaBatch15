package Class32_Exception;
public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("line1");
        System.out.println("line2");
        System.out.println("line3");
        System.out.println("line4");
        System.out.println("line5");
        System.out.println("line6");
        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("line7");
        System.out.println("line8");
        System.out.println("line9");
        System.out.println("line10");
    }
}
