Feature: Create an account
  Background:
    Given Open the Platforms Dropdown menu

  Scenario: Create a new account
    When user clicks the SignIn button
    And user clicks the SignUp button
    And user enters the name
    And user enters the userName
    And user enters email
    And user enters password
    Then user clicks the Create Account button






