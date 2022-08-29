
Feature: Web Login

  @FirstTest
  Scenario: User should be able to login with valid credentials
    Given User is on the login page
    When User enters valid credentials
    And hits submit
    Then the user should be login successfully


  @SecondTest
  Scenario Outline: User should be able to login with valid credentials
    Given User is on the login page
    When User enters valid "<id>" and "<password>"
    And hits submit
    Then the user should be login successfully
    Examples:
      | id |  | password |
      | u1 |  | pw1      |
      | u2 |  | pw2      |
      | u3 |  | pw3      |