package Class20_SuperKeyword_Inhertance;

public class BaseClass {

    String name="John";

    void hello(){
        System.out.println("Hello method from BaseClass");
    }
}

class Child extends BaseClass {

    String name="Jane";

    void callMe(){
        System.out.println(this.name); //Jane
        System.out.println(super.name); //John
    }

    void hello(){
        System.out.println("Hello methods from Child class");
    }

    void callingParentMethod(){
        hello();
        super.hello();
    }
}
