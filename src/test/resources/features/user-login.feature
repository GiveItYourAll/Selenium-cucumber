@regression
Feature: Login Functionality

  Background: preliminary steps
    Given user navigates to orangeHrm login page


  Scenario: User can login with valid credentials
    When user enters username "yoll-student" and password "Bootcamp5#"
    And user clicks login button
    Then user is redirected to the homepage
    * quit the driver

  Scenario: User cannot login with invalid credentials
    When user enters username "invalid" and password "invalid"
    And user clicks login button
    Then user can see an error message
    * quit the driver

  Scenario: User cannot login with empty username
    When user enters username "" and password "invalid"
    And user clicks login button
    Then user can see an error message that says Username cannot be empty
    *  quit the driver

  Scenario: User cannot login with empty password
    When user enters username "invalid" and password ""
    And user clicks login button
    Then user can see an error message that says Password cannot be empty
    * quit the driver