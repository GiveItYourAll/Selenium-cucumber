@popup
Feature: Modal pop up visibility
  Scenario: Verify user can see a modal pop up once landed the page
    Given user lands on Entry Ad Page
    When a pop-up appears
    Then user is able to see "THIS IS A MODAL WINDOW"
    And user can close the pop up