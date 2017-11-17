Feature: As a user I should be able to select a Language after installing the app

  @16Nov
  Scenario: As a User I should be able to select English as my preferred language
    When user selects the language as English
    And user clicks on continue button
    Then user should be able to see Login Screen
    And user skips the login
    And user swipes to see broadband
    And clicks on broadband