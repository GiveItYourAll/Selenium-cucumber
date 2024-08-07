package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IFramesPage {
    public IFramesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "button[title='Play']")
    public WebElement playButton;
    @FindBy(css = "#tinymce>p")
    public WebElement field;
    @FindBy(css = "input#email")
    public WebElement field2;
    @FindBy(css = "#btn-subscribe")
    public WebElement subscribeButton;
    @FindBy(xpath = "//p[contains(text(), 'Your content goes here.')]")
    public WebElement content;
    @FindBy(id = "success-message")
    public WebElement successMessage;
    public String getRandomEmail(){
        return new Faker().internet().emailAddress();
    }
}
