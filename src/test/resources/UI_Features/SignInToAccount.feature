Feature: Sign in to account

  Scenario: Login to your account
    Given user clicks the SignIn button
    And user enters email
    And user enters password
    Then user clicks the SignIn button for enter to account
    And Tests that the application is logged in