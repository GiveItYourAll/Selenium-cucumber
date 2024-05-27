package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HrmHomePage {
    public HrmHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="welcome")
    public WebElement welcomeMessage;

    @FindBy(css="div.menu>ul>li>a")
   public List<WebElement>tabs;

}
