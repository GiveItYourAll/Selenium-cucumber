package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HrmHomePage {
    public HrmHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="welcome")
    public WebElement welcomeMessage;

    @FindBy(css="div.menu>ul>li>a")
   public List<WebElement>tabs;

}
