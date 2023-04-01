package Class32_Exception;

import utils.ExcelReader;

import java.io.IOException;

public class ExceptionDemo2 {
    public static void main(String[] args) throws IOException {
        test();

    }
    static void test()throws IOException{
       try{
            ExcelReader.read();
        }catch (Exception e){
            try {
                System.out.println(e);
            }catch (Exception exception){

            }
        }
        //ExcelReader.read();
    }
}
