package Class32_Exception;

import utils.ExcelReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
public class Exrtaa {
        public static void main(String[] args) throws IOException {
            List<Map<String,String>> excelData= ExcelReader.read();
            for (Map<String,String>row:excelData){
                for (Map.Entry<String,String>entry:row.entrySet()){
                    System.out.println(entry.getKey()+" "+entry.getValue());
                }
                System.out.println("***********************");
            }
            //To Retrive the data we can use enhaced for loop and Var method as well

            /*for (Map<String,String> row:excelData){
                for(var entry: row.entrySet()){
                    System.out.println(entry);
                }
                System.out.println("***********************");
            }*/
    }
}
