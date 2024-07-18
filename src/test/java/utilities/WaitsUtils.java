package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsUtils {
   public static void waitForVisibilityOfElement(WebElement element, int secs) {
       Wait<WebDriver>wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(secs));
       wait.until(ExpectedConditions.visibilityOf(element));

    }
    public static void waitForElementToBeClickable(WebElement element, int secs) {
       Wait<WebDriver>wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(secs));
       wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitForNumberOfWindows(int numberOfWindows, int secs){
       Wait<WebDriver>wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(secs));
       wait.until(ExpectedConditions.numberOfWindowsToBe(numberOfWindows));
    }
}
