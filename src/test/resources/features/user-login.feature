
Feature: Login Functionality

  Background: preliminary steps
    Given user navigates to orangeHrm login page


  Scenario: User can login with valid credentials
    When user enters username "yoll-student" and password "Bootcamp5#"
    And user clicks login button
    Then user is redirected to the homepage
    * quit the driver

#  Scenario: User cannot login with invalid credentials
#    When user enters username "invalid" and password "invalid"
#    And user clicks login button
#    Then user can see an error message "Invalid credentials"
#    * quit the driver
#
#  Scenario: User cannot login with empty username
#    When user enters username "" and password "invalid"
#    And user clicks login button
#    Then user can see an error message "Username cannot be empty"
#    *  quit the driver
#
#  Scenario: User cannot login with empty password
#    When user enters username "invalid" and password ""
#    And user clicks login button
#    Then user can see an error message "Password cannot be empty"
#    * quit the driver
#To make a Scenario data driven we call it in cucumber: Scenario Outline or Scenario Template
  #To extract a specific data from examples table will be by using <> - angle brackets
  @InvalidLogin
  Scenario Outline: User cannot login with invalid credentials <testCase>
    When user logs in with username "<username>" and password "<password>"
    And user clicks login button
    Then user can see an error message "<errorMessage>"
    * quit the driver
    Examples:
    |testCase| username | password |errorMessage       |
    |both invalid| invalid  |invalid   |Invalid credentials|
    |username empty|          |invalid   |Username cannot be empty|
    |password empty| invalid  |          |Password cannot be empty|
    |both empty|          |          |Username cannot be empty|