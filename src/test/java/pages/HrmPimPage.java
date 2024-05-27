package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HrmPimPage {

    public HrmPimPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmployeeButton;

}
