package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HrmLoginPage {
    public HrmLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="txtUsername")
   public WebElement loginInput;
    @FindBy(id="txtPassword")
    public WebElement passwordInput;
    @FindBy(id="btnLogin")
    public WebElement loginButton;
}
