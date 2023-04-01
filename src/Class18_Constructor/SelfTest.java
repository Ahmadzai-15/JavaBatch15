package Class18_Constructor;

public class SelfTest {
    //Creat a class for Computer shop.


    String name;
    int Price;
    double weight;


    SelfTest(String name1, int Price1,double weight1){
        name=name1;
        Price=Price1;
        weight=weight1;
    }
    void print(){
        System.out.println("Name: "+name+ "Price: "+Price+"$"+" Weight: "+weight);
    }

    public static void main(String[] args) {
        SelfTest st=new SelfTest("Java for Dummies ", 112, 180.5);
        st.print();
    }

}
