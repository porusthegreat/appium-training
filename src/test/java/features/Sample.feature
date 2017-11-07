Feature: Registration Flow
  Scenario: As a User I should be able to signup with my google account
    Given user opens the app
    When user chooses to logIn using Google
    Then user should see account picker popup