package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    // you dont have the Singleton implemented yet so multiple objects created in same step definition will fail.
    // move this locator to LoginPage for now
    @FindBy(id = "welcome")
    public WebElement welcomeElement;
}
