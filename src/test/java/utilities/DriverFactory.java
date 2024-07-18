package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public static WebDriver getDriver(String browserType) {
    return switch(browserType.toLowerCase()) {
        case "firefox" -> new FirefoxDriver();
        case "edge" -> new EdgeDriver();
        case "explorer" -> new InternetExplorerDriver();
        case "safari" -> new SafariDriver();
        default -> new ChromeDriver();
    };

    }
}





