package Class23_Polymorphism;

import Class23_Polymorphism.Chair;
import Class23_Polymorphism.Furniture;
import Class23_Polymorphism.Table;

public class FurnitureTester {

    public static void main(String[] args) {

        Furniture chair=new Chair();
        chair.assemble();
        chair.comfort(); //runTime polymorphism java decide in runtime to execute.


        Furniture table=new Table();
        table.comfort();
        table.assemble();//runTime polymorphism java decide in runtime to execute.

        Table t=new Table();
        t.assemble();
        t.comfort();
        t.buildTable();
        t.builTable("Wood");    //compile time polymorphism.
        t.buildTable();     //runTime polymorphism.
    }
}
