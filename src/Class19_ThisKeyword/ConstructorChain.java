package Class19_ThisKeyword;

public class ConstructorChain {

    ConstructorChain(){
        System.out.println("i am non argument constructor");
    }
    ConstructorChain(String str){
        this();
        System.out.println(str);
    }
    ConstructorChain(int number){
        this("Hello");
        System.out.println("This is constructor with int parameter ");
    }

    public static void main(String[] args) {
        ConstructorChain cns=new ConstructorChain(10);
        System.out.println("End of code ---------------");
    }

}
