package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HrmHomePage;
import pages.HrmLoginPage;
import utilities.DriverFactory;

import java.util.List;

public class OrangeHrmTabsHomework {
    private WebDriver driver = DriverFactory.getDriver("Chrome");
    private HrmLoginPage hrmLoginPage = new HrmLoginPage(driver);
    private HrmHomePage hrmHomePage = new HrmHomePage(driver);

    @Given("user navigates to hrm login page")
    public void user_navigates_to_hrm_login_page() {
        driver.get("http://dev-hrm.yoll.io");
    }

    @When("user logs in with username1 {string} and password1 {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        hrmLoginPage.loginInput.sendKeys(username);
        hrmLoginPage.passwordInput.sendKeys(password);
    }

    @And("user clicks hrm login button")
    public void user_clicks_hrm_login_button() {
        hrmLoginPage.loginButton.click();

    }

    @Then("user is redirected to the hrm homepage")
    public void user_is_redirected_to_the_hrm_homepage() {
        System.out.println(hrmHomePage.welcomeMessage.getText());
    }

    @And("user can see following tabs:")
    public void user_can_see_following_tabs(List<String> expectedTabs) {
        List<WebElement> actualTabs = hrmHomePage.tabs;


        Assert.assertEquals("Tab sizes verification failed!", expectedTabs.size(), actualTabs.size());

//String actualTabList=null;
//String expectedTabList=null;
        for(int i = 0; i < expectedTabs.size(); i++) {
          String  actualTabList = actualTabs.get(i).getText();
           String  expectedTabList = expectedTabs.get(i);

        System.out.println(actualTabList);
       System.out.println(expectedTabList);


            Assert.assertEquals("Tab list verification failed!", expectedTabList, actualTabList);
        }
        }
    }










