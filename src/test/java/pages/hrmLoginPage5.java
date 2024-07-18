package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class hrmLoginPage5 {
public hrmLoginPage5(){
    PageFactory.initElements(Driver.getDriver(), this);
}
@FindBy(id = "txtUsername")
    WebElement usernameInput;
@FindBy(id = "txtPassword")
WebElement password;




}
