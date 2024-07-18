package step_definitions;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.WaitsUtils;

import java.time.Duration;

public class alerts {
    @Test
    public void alerts() throws InterruptedException {
        Driver.getDriver().get("https://demoqa.com/alerts");
        WebElement button = Driver.getDriver().findElement(By.xpath("//button[@id='alertButton']"));
        Thread.sleep(2000);
        button.click();
        Thread.sleep(2000);
        Wait<WebDriver> wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert myAlert = Driver.getDriver().switchTo().alert();
        myAlert.accept();

Driver.getDriver().quit();
    }
}
