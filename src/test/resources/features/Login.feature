@login
Feature: User should be able to login

  Background:
    Given the user is on the login page

  Scenario: Login as a user
    When the users enter the user information
    Then the user should be able to login

  Scenario: Login with invalid username
    When the users enter the invalid username
    Then the users should not be login

  Scenario: Login with blank username
    When the users leave the username box blank
    Then the users should not be login

  Scenario: Login with invalid password
    When the users enter the invalid password
    Then the users should not be login

  Scenario: Login with blank password
    When the users leave the password box blank
    Then the users should not be login