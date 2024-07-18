package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuAppPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuAppSteps {
    private HerokuAppPage herokuAppPage = new HerokuAppPage();
    @Given("user is on heroku dynamic loading page")
    public void user_is_on_heroku_dynamic_loading_page() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading");
    }
    @When("user clicks on example one link")
    public void user_clicks_on_example_one_link() {
        Wait<WebDriver>explicitWait1 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        explicitWait1.until(ExpectedConditions.elementToBeClickable(herokuAppPage.exampleOneLink));

        herokuAppPage.exampleOneLink.click();

    }
    @When("user clicks on start button")
    public void user_clicks_on_start_button() {
        Wait<WebDriver>explicitWait2 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        explicitWait2.until(ExpectedConditions.elementToBeClickable(herokuAppPage.startButton));
herokuAppPage.startButton.click();
    }
    @Then("user can see a {string} message")
    public void user_can_see_a_message(String expectedMessage) {
Wait<WebDriver>fluentWait = new FluentWait<>(Driver.getDriver())
        .withTimeout(Duration.ofSeconds(10))
        .pollingEvery(Duration.ofMillis(250))
        .ignoring(NoSuchElementException.class)
        .withMessage("The element failed to locate within 10 seconds with polling time of 250 millis");

        String actualMessage = herokuAppPage.message.getText();
        Assert.assertEquals("Message verification failed", expectedMessage, actualMessage);

    }

}
