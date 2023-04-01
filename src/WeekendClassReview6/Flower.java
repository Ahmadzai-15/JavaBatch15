package WeekendClassReview6;

public class Flower {
    //Attributes, prperties

    String color ,type,name;
    int price;


    //behaivor

    void smell(){
        System.out.println("Flower blooms ");
    }
    void grow(){
        System.out.println("Flower");
    }
    void model(){
        System.out.println("Red rose");
    }


    public static void main(String[] args) {


        Flower flower1=new Flower();
        //accessingg variables of flower calss
        flower1.name="Gulab";
        flower1.type="NIce";

        //accessing method of flower class
        flower1.smell();
        flower1.grow();
        flower1.model();
        Flower flower2=new Flower();
        Flower flower3=new Flower();


    }
}
