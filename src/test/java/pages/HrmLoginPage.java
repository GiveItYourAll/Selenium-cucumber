package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrmLoginPage {
    public HrmLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="txtUsername")
   public WebElement loginInput;
    @FindBy(id="txtPassword")
    public WebElement passwordInput;
    @FindBy(id="btnLogin")
    public WebElement loginButton;
}
