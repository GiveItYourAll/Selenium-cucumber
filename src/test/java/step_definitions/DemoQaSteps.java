package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitsUtils;

import java.time.Duration;
import java.util.Set;

public class DemoQaSteps {
    private DemoQaPage demoQaPage = new DemoQaPage();
    private String mainWindowHandle =null;

    @Given("I land on Demo QA Browser Windows Page")
    public void i_land_on_demo_qa_browser_windows_page() {
Driver.getDriver().get(ConfigReader.getProperty("demo_qa_windows_url"));
    }
    @Then("I can retrieve the unique identifier of the main window")
    public void i_can_retrieve_the_unique_identifier_of_the_main_window() {
      mainWindowHandle =  Driver.getDriver().getWindowHandle();
        System.out.println("Main window ID: " + mainWindowHandle);

    }
    @When("I click on {string} button")
    public void i_click_on_new_tab_button(String buttonName) throws InterruptedException {
       switch(buttonName.toUpperCase()) {
           case "NEW TAB": WaitsUtils.waitForElementToBeClickable(demoQaPage.newTabButton, 10);
           demoQaPage.newTabButton.click();
           break;
           case "NEW WINDOW":
               WaitsUtils.waitForElementToBeClickable(demoQaPage.newWindowButton, 10);
               demoQaPage.newWindowButton.click();
           default: Assert.fail("There is no such button on page -> " + buttonName);
       }
       Thread.sleep(5000);
    }
    @Then("a new window is created")
    public void a_new_window_is_created() {
       Set<String> allWindowsIds= Driver.getDriver().getWindowHandles();
        System.out.println( "All windows Ids: " + allWindowsIds);
        System.out.println( "URL before switching: " + Driver.getDriver().getCurrentUrl());
int expectedWindowsCount = 2;
int actualWindowsCount = allWindowsIds.size();
        Assert.assertEquals("Count of windows failed!", expectedWindowsCount, actualWindowsCount);


    for(String currentWindowId: allWindowsIds){
        if(!currentWindowId.equals(mainWindowHandle)) {
            Driver.getDriver().switchTo().window(currentWindowId);
            break;
        }

    }
        System.out.println("URL after switching: " + Driver.getDriver().getCurrentUrl());}
    @Then("I can see the content of new tab is {string}")
    public void i_can_see_the_content_of_new_tab_is(String expectedContent) {
String actualContent = demoQaPage.newTabContent.getText();
Assert.assertEquals("content verification failed", expectedContent, actualContent);
    }
    @When("I close the new tab or window")
    public void i_close_the_new_tab_or_window() throws InterruptedException {
Driver.getDriver().close();
    }
    @Then("I switch to main window")
    public void i_switch_to_main_window() {
        Driver.getDriver().switchTo().window(mainWindowHandle);

    }
    @Then("I can see the url of the window is endpoint with {string}")
    public void i_can_see_the_url_of_the_window_is_endpoint_with(String endpoint) throws InterruptedException {
        String currentUrlValue = Driver.getDriver().getCurrentUrl();
        System.out.println("After we switched back to main window: " + currentUrlValue);
        System.out.println("The title of the page is " + Driver.getDriver().getTitle());
        Assert.assertTrue("URL verification failed", currentUrlValue.contains(endpoint));
    }



}
