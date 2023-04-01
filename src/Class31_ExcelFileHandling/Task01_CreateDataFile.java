package Class31_ExcelFileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class Task01_CreateDataFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path="Files/Task01.properties";
        FileOutputStream task=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("ID","001");
        //properties.store(fileOutputStream,"A new name has been added");

    }
}
