@TabsHomework
Feature: Homework Feature
  Scenario: User can see all the tabs on homepage
    Given user navigates to hrm login page
    When user logs in with username1 "yoll-student" and password1 "Bootcamp5#"
    And user clicks hrm login button
    Then user is redirected to the hrm homepage
    And user can see following tabs:
    |Admin|
    |PIM  |
    |Leave|
    |Time |
    |Recruitment|
    |My Info|
    |Performance|
    |Dashboard  |
    |Directory  |
    |Maintenance|
* quit the driver