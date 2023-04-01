package Class31_ExcelFileHandling;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo1 {
    public static void main(String[] args) throws IOException {

        //path where we want to create the new file and the name of the file with its extension
        //if we use same name in files/test/properties so the file well override automatically.if you want to change the
        //must chang the name in line 12 File/Change-name.properties.
        String path="Files/Task1.properties";
        //we use FileOutPutStream when we have to write the data to a file
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        //we use setProperty method to store data inside a properties file.
        Properties properties=new Properties();
        //properties.put("Name","Ajmal Ahmadzai"); both are same line17 but line 17 prefer to use it more.
        properties.setProperty("Name","Ajmal Ahmadzai");
        properties.setProperty("Age","8");
        properties.setProperty("Class","4th Grade");
        //A method to write the data to the disk
        properties.store(fileOutputStream,"A new name has been added");

    }
}
