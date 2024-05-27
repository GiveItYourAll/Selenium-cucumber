package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HrmAddEmployeePage;
import pages.HrmHomePage;
import pages.HrmLoginPage;
import pages.HrmPimPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HomeworkHrmUserStory3 {
HrmLoginPage hrmLoginPage = new HrmLoginPage();
HrmHomePage hrmHomePage = new HrmHomePage();
HrmPimPage hrmPimPage = new HrmPimPage();
HrmAddEmployeePage hrmAddEmployeePage = new HrmAddEmployeePage();
    @Given("user logged in to hrm with admin account {string} and password {string}")
    public void user_logged_in_to_hrm_with_admin_account_and_password(String username, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("hrm_url"));

        hrmLoginPage.loginInput.sendKeys(username);
        hrmLoginPage.passwordInput.sendKeys(password);
        hrmLoginPage.loginButton.click();
    }
    @When("user clicks on pim and add employee")
    public void user_clicks_on_pim_and_add_employee() {
hrmHomePage.pimButton.click();
hrmPimPage.addEmployeeButton.click();
    }
    @When("user fills out first name {string}, middle name {string}, last name {string}")
    public void user_fills_out_first_name_middle_name_last_name(String firstName, String middleName, String lastName) {
        hrmAddEmployeePage.firstName.sendKeys(firstName);
        hrmAddEmployeePage.middleName.sendKeys(middleName);
        hrmAddEmployeePage.lastName.sendKeys(lastName);
    }
    @When("user clicks on the checkbox “Create Login Details”")
    public void user_clicks_on_the_checkbox_create_login_details() {
hrmAddEmployeePage.checkbox.click();
    }
    @Then("user sees additional fields displayed as {string}, {string}, {string}, {string}")
    public void user_sees_additional_fields_displayed_as(String expectedUsernameField, String expectedPasswordField, String expectedConfirmPasswordField, String expectedStatusField) {

String actualUsernameField = hrmAddEmployeePage.userNameField.getText();
String actualPasswordField =hrmAddEmployeePage.passwordField.getText();
                String actualConfirmPasswordField =hrmAddEmployeePage.confirmPasswordField.getText();
            String actualStatusField = hrmAddEmployeePage.statusField.getText();
            Assert.assertTrue(hrmAddEmployeePage.userNameField.isDisplayed());
            Assert.assertTrue(hrmAddEmployeePage.passwordField.isDisplayed());
            Assert.assertTrue(hrmAddEmployeePage.confirmPasswordField.isDisplayed());
            Assert.assertTrue(hrmAddEmployeePage.statusField.isDisplayed());
        Assert.assertEquals(expectedUsernameField, actualUsernameField);
        Assert.assertEquals(expectedPasswordField, actualPasswordField);
        Assert.assertEquals(expectedConfirmPasswordField, actualConfirmPasswordField);
        Assert.assertEquals(expectedStatusField, actualStatusField);
    }
    @Then("user can see a message: {string}")
    public void user_can_see_a_message(String expectedSuggestionMessage) {

String actualSuggestionMessage = hrmAddEmployeePage.suggestionMessage.getText();
Assert.assertTrue(hrmAddEmployeePage.suggestionMessage.isDisplayed());

Assert.assertEquals(expectedSuggestionMessage, actualSuggestionMessage);
    }
    @When("user clicks on the checkbox again")
    public void user_clicks_on_the_checkbox_again() {
hrmAddEmployeePage.checkbox.click();
    }
    @Then("the fields are no longer displayed")
    public void the_fields_are_no_longer_displayed() {
        Assert.assertFalse(hrmAddEmployeePage.userNameField.isDisplayed());
        Assert.assertFalse(hrmAddEmployeePage.passwordField.isDisplayed());
        Assert.assertFalse(hrmAddEmployeePage.confirmPasswordField.isDisplayed());
        Assert.assertFalse(hrmAddEmployeePage.statusField.isDisplayed());
    }
}
