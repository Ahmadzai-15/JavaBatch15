package Class33_Exception02;

import java.io.FileNotFoundException;

public class ExceptionDemo4_LazyException {
    public static void main(String[] args) throws FileNotFoundException {


        String name="abera";
        if(name.length()<8){
            throw new LazyException("This name is not allowed");
        }





    }
}