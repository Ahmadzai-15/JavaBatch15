package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties read() throws IOException {

        String path="Files/config.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        return properties;
    }
}
