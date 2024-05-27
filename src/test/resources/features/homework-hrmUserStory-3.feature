Feature: Homework2
@homework2
  Scenario: user should be able to see login details when checkbox is selected
    Given  user logged in to hrm with admin account "yoll-student" and password "Bootcamp5#"
    When user clicks on pim and add employee
    And user fills out first name "Sean", middle name "Badass", last name "Strickland"
    And user clicks on the checkbox “Create Login Details”
    Then user sees additional fields displayed as "User Name *", "Password *", "Confirm Password *", "Status *"
    And user can see a message: "For a strong password, please use a hard to guess combination of text with upper and lower case characters, symbols and numbers"
    When user clicks on the checkbox again
    Then the fields are no longer displayed
