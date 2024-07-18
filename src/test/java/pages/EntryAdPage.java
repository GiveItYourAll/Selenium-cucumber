package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class EntryAdPage {
    public EntryAdPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='modal']")
    public WebElement popup;
    @FindBy(css = "div.modal-title>h3")
    public WebElement popupHeader;

    @FindBy(xpath="//*[contains(text(), 'Close')]")
    public WebElement closeButton;
}