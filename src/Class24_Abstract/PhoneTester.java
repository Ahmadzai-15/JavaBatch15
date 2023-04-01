package Class24_Abstract;

public class PhoneTester {

    public static void main(String[] args) {

        Phone [] phones={new Samsung(),new Iphone()};

        for (Phone po:phones){
            po.unlockPhone();
            po.SendText();
            po.displayPictures();
        }
    }
}
