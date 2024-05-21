package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverFactory;

public class LoginSteps {
    private WebDriver driver = DriverFactory.getDriver(("chrome"));
    private LoginPage loginPage = new LoginPage(driver);

    @Given("user navigates to orangeHrm login page")
    public void user_navigates_to_orange_hrm_login_page() {
        driver.get("http://dev-hrm.yoll.io/");
    }

    @When("user logs in with valid username and password")
    public void user_logs_in_with_valid_username_and_password() {

        loginPage.usernameInputBox.sendKeys("yoll-student");
        loginPage.passwordInputBox.sendKeys("Bootcamp5#");

    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();

    }

    @Then("user is redirected to the homepage")
    public void user_is_redirected_to_the_homepage() {

        String actualWelcomeMessage = loginPage.welcomeElement.getText();
        String expectedWelcomeMessage = "Welcome Yoll";
        Assert.assertEquals("User redirect failed!", expectedWelcomeMessage, actualWelcomeMessage);
    }

    @Then("quit the driver")
    public void quit_the_driver() {
        driver.quit();
    }



    @Then("user can see an error message")
    public void user_can_see_an_error_message() {
        String expectedErrorMessage ="Invalid credentials";
        String actualErrorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals("Error message verification failed", expectedErrorMessage, actualErrorMessage);


    }




    @Then("user can see an error message that says Username cannot be empty")
    public void user_can_see_an_error_message_that_says_username_cannot_be_empty() {
String expectedErrorMessage = "Username cannot be empty";
String actualErrorMessage = loginPage.errorMessage.getText();
Assert.assertEquals("Error message verification failed", expectedErrorMessage, actualErrorMessage);
    }


    @Then("user can see an error message that says Password cannot be empty")
    public void user_can_see_an_error_message_that_says_password_cannot_be_empty() {
        String expectedErrorMessage = "Password cannot be empty";
        String actualErrorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals("Error message verification failed", expectedErrorMessage, actualErrorMessage);
    }
    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.usernameInputBox.sendKeys(username);
        loginPage.passwordInputBox.sendKeys(password);
    }

}

