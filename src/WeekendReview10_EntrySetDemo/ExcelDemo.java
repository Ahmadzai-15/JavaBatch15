package WeekendReview10_EntrySetDemo;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;


public class ExcelDemo {
    public static void main(String[] args) {
        String path="File_Review/Book1.xlsx";
        try {
            FileInputStream fis=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
            XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet3");
            Row row=sheet1.getRow(3);
            System.out.println(row.getCell(2));


        } catch (Exception e) {
            System.out.println("Please check the path of the file");


        }
    }
}
