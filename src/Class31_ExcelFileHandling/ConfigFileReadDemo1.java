package Class31_ExcelFileHandling;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigFileReadDemo1 {
    public static void main(String[] args) throws IOException {
        //Location or path of the file from which we want to read the data
        String path="Files/config.properties";
        // A class that helps us navigate to that folder where file is stored
        // if you face ab issues hover your mouse and click on add exception to method signature
        FileInputStream fileInputStream=new FileInputStream(path);
        //This "Properties" class will assist us to read and write data to .properties files
        Properties properties=new Properties();
        // Loads all the data from file inside the above object "properties"
        properties.load(fileInputStream);
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("browser"));
        fileInputStream.close();


    }
}
