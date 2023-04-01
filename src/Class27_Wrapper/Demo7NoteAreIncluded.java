package Class27_Wrapper;

import java.util.ArrayList;

public class Demo7NoteAreIncluded {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
        name.add("Fizzy");
        name.add("Savo");
        name.add("Sam");
        name.add("Urwa");
        name.add("Tarik");
        name.add("Abeera");

        System.out.println(name.contains("Daria"));         //return boolean value
        System.out.println(name);

        name.remove("Sam");     //to remove an element object
        System.out.println(name);
        name.remove(1);     //to remove element by index
        System.out.println(name);
        name.set(3,"Javid");//this is how we replace new element in ArrayList, the 3 is index number we want to change
        System.out.println(name);
        System.out.println(name.indexOf("Urwa"));   //this is how we want to find index of element.





    }
}
