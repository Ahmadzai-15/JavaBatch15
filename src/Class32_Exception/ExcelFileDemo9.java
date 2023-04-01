package Class32_Exception;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;
public class ExcelFileDemo9 {
    public static void main(String[] args) throws IOException {

        List<Map<String,String>> excelData= ExcelReader.read();
        System.out.println(excelData);

        //we can achives data by var as line15 same like line11
        //var excelData=ExcelReader.read();
    }
}
