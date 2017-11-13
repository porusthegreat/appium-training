Feature: As a user I should be able to recharge from paytm

  Background:
    When user selects the language as English
    And user clicks on continue button
    Then user should be able to see Login Screen
    And user skips the login

  Scenario: Mobile Recharge - Prepaid
    When user chooses to recharge for prepaid mobile
    And user enters mobile number as 9901897419
    And user waits for mobile operator to be auto selected
    And user chooses to recharge with Rs. 30
    And user clicks on proceed button

  Scenario: Mobile Recharge - Postpaid
    When user chooses to recharge for postpaid mobile
    And user enters mobile number as 9901897419
    And user waits for mobile operator to be auto selected
    And user chooses to recharge with Rs. 30
    And user clicks on proceed button

