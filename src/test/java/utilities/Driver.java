package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Driver {

private static WebDriver driver;

private Driver(){}

    public static WebDriver getDriver(){
    if(driver==null){
        driver = DriverFactory.getDriver(ConfigReader.getProperty("browserType"));

    }
return driver;
    }
    public void setDriver(WebDriver driverType){
    driver = driverType;

    }
public static void quitDriver(){
    if(driver!=null) {
        driver.quit();
        driver=null;
    }
}

    }
