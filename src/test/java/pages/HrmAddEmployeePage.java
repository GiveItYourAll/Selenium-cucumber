package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HrmAddEmployeePage {

    public HrmAddEmployeePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "firstName")
   public WebElement firstName;
    @FindBy(id = "middleName")
    public WebElement middleName;

    @FindBy(id = "lastName")
    public WebElement lastName;
@FindBy(id = "chkLogin")
    public WebElement checkbox;

@FindBy(xpath = "//label[@for='user_name']")
    public WebElement userNameField;
@FindBy(xpath = "//label[@for='user_password']")
    public WebElement passwordField;
@FindBy(xpath = "//label[@for='re_password']")
  public WebElement  confirmPasswordField;

@FindBy(xpath = "//label[@for='status']")
    public WebElement statusField;
@FindBy(xpath = "//*[contains(text(), 'For a strong password')]")
    public WebElement suggestionMessage;




}
