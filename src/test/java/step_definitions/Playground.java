package step_definitions;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Playground {
    public static void main(String[] args) throws IOException {

Properties myPropertyFile = new Properties();
String path = "src/test/resources/configs.properties";
FileInputStream fileInput = new FileInputStream(path);
myPropertyFile.load(fileInput);
        System.out.println(ConfigReader.getProperty("hrm_url"));
        System.out.println(myPropertyFile.getProperty("hrm_url"));

}
    }














