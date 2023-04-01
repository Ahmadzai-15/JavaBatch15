package Class25_InterFace;
public interface Washable{
    void wash();
}
class SmartWatch implements Washable{
    @Override
    public void wash() {
        System.out.println("You can Wash this smartwatch with out any issues");
    }
}
class Phone implements Washable{

    @Override
    public void wash() {
        System.out.println("You can Wash this smartwatch with out any issues");
    }
}
class inverter implements Washable{

    @Override
    public void wash() {
        System.out.println("You can Wash this smartwatch with out any issues");
    }
}