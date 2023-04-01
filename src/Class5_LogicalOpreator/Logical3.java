package Class5_LogicalOpreator;

public class Logical3 {
    public static void main(String[] args) {

            System.out.println(true||true);
            System.out.println(true||false);
            System.out.println(false||false);
            System.out.println(false||true|false|false);
            boolean boughtCho=false;
            boolean boughtFlowers=false;
            if(boughtCho||boughtFlowers){
                System.out.println("I Am happy");
            }else{
                System.out.println("I am Sad");
            }
            boolean wifi=false;
            boolean fiveG=false;
            if(wifi||fiveG){
                System.out.println("You are good for browsing the internet");
            }else{
                System.out.println("Either connect to wifi or to 5G");
            }
    }
}
