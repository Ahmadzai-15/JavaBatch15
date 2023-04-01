package WeekendReview10_EntrySetDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args) {

        String path="File_Review/Config.properties";
        //Navigate to the file, when ever we read the data from a file we use FileInputStream.

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            //properties class is used to read and write file data, from file.
            Properties properties=new Properties();
            properties.load((fileInputStream));
            System.out.println(properties.getProperty("UserName"));
        } catch (FileNotFoundException e) {
            System.out.println("Nothing gone wrong");
        }catch (NullPointerException e){
            System.out.println("You are trying to call a method on Null object ");
        } catch (IOException e) {
            throw new RuntimeException("Io Exception occurred");
        }
    }
}
