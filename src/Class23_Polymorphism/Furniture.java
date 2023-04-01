package Class23_Polymorphism;

public class Furniture {

    public void assemble(){
        System.out.println("Furniture need to be assemble");
    }
    public void comfort(){  //overriden method
        System.out.println("Furniture need to be comfortable");
    }
}
class Chair extends Furniture{

    public void comfort(){
        System.out.println("Not every chair comfortable"); //over riding method
    }
    protected void loveSet(){
        System.out.println("this is the best chair");
    }
}
class Table extends Furniture{

    public void comfort(){
        System.out.println("Table can not be comfortable ");
    }
    protected void buildTable(){
        System.out.println("We can easily build a table");
    }
    void builTable(String tool){
        System.out.println("We build tabel using "+tool);
    }
}