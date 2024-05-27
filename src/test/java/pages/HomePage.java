package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    // you dont have the Singleton implemented yet so multiple objects created in same step definition will fail.
    // move this locator to LoginPage for now
    @FindBy(id = "welcome")
    public WebElement welcomeElement;
}
