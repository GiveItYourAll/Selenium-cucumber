Feature: Page with multiple iframes
  @iFrames
  Scenario: User can interact with all elements on the page
    Given user lands on expandtesting page
    When user clicks on video play button
    Then user can see "Your content goes here."
    When user enters an email
    And clicks Subscribe button
    Then user can see "You are now subscribed!"