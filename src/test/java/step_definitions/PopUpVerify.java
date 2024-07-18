package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EntryAdPage;
import pages.HerokuAppFirstPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitsUtils;

import java.time.Duration;

public class PopUpVerify {
    private  HerokuAppFirstPage herokuAppFirstPage = new HerokuAppFirstPage();

    private EntryAdPage entryAdPage = new EntryAdPage();

    @Given("user lands on Entry Ad Page")
    public void user_lands_on_entry_ad_page() {
Driver.getDriver().get(ConfigReader.getProperty("herokuUrl"));

    }
    @When("a pop-up appears")
    public void a_pop_up_appears() {

    }
    @Then("user is able to see {string}")
    public void user_is_able_to_see(String expectedPopup) {

        WaitsUtils.waitForVisibilityOfElement(entryAdPage.popupHeader, 10);
        expectedPopup = "THIS IS A MODAL WINDOW";
        String actualPopup = entryAdPage.popupHeader.getText();
        System.out.println("Actual popup is "+actualPopup);
        Assert.assertTrue("Popup verification failed", expectedPopup.equalsIgnoreCase(actualPopup) );

    }
    @Then("user can close the pop up")
    public void user_can_close_the_pop_up() {
entryAdPage.closeButton.click();
    }

}
