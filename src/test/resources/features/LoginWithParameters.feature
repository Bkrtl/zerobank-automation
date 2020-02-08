
Feature: User should be able to login

  Scenario: Positive scenario-Login as a user
    Given the user is on the login page
    When the users enter the user information
    Then the user should be able to login

  Scenario Outline: Negative scenarios
    Given the user is on the login page
    When the user enters the wrong or empty credentials "<username>" "<password>"
    Then the user should not be login and see "Login and/or password are wrong." message

    Examples:
      |  username           |  password       |
      |                     | password        |
      |  username           |                 |
      |                     |                 |
      |  invalidusername    | password        |
      |  username           | invalidpassword |
      |  invalidusername    | invalidpassword |