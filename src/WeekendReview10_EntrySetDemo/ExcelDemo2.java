package WeekendReview10_EntrySetDemo;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class ExcelDemo2 {
    public static void main(String[] args) {
        String path="File_Review/Book1.xlsx";
        try {
            FileInputStream fis=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
            XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet3");
            int noOfRows=sheet1.getPhysicalNumberOfRows();
            //var excelData=new ArrayList<Map<String,String>>();
            List<Map<String,String>> excelData=new ArrayList<>();
            Row row0=sheet1.getRow(0);
            for (int i = 0; i <noOfRows ; i++) {
                LinkedHashMap<String, String> rowMap=new LinkedHashMap<>();
                Row row=sheet1.getRow(i);
                int noOfCells=row.getPhysicalNumberOfCells();
                for (int j = 0; j <noOfCells ; j++) {
                    String key=row0.getCell(j).toString();
                    String values=row.getCell(i).toString();
                    rowMap.put(key,values);
                }
                excelData.add(rowMap);
                System.out.println(excelData);
            }
        } catch (Exception e) {
            System.out.println("Please check the path of the file");
        }
    }
}
