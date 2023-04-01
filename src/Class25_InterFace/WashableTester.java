package Class25_InterFace;

public class WashableTester {

    public static void main(String[] args) {

        Washable [] washables={new Phone(),new SmartWatch(),new inverter()};
         for (Washable w: washables){
             w.wash();
         }
    }
}
