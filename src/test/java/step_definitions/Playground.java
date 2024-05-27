package step_definitions;

import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Playground {
    public static void main(String[] args) throws IOException {


 Properties myPropertyFile = new Properties();
 String path = "src/test/resources/configs.properties";
 FileInputStream fileInput = new FileInputStream(path);
 myPropertyFile.load(fileInput);
        System.out.println(myPropertyFile.getProperty("hrm_username"));
    }
}
