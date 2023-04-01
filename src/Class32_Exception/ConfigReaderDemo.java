package Class32_Exception;

import utils.ConfigReader;

import java.io.IOException;
import java.util.Properties;

public class ConfigReaderDemo {
    public static void main(String[] args) throws IOException {

        Properties properties=ConfigReader.read();
        System.out.println(properties.getProperty("user"));

    }
}
