
Feature: Account Activity

  Scenario: Account Activity page
    Given the user is on the login page
    When the users enter the user information
    Then the users should be at Account Activity page

  Scenario: Account Activity page content
    Given the user is on Account Activity page
    Then the users see that Savings option is selected

  Scenario: Account Activity -Account dropdown
    Given the user is on Account Activity page
    When the users clicks dropdown
    Then the users see following options:
      | Savings | Checking | Savings |Loan |Credit Card|Brokerage|

  Scenario: Account Activiy - Transactions Table
    Given the user is on Account Activity page
    Then the users see following columns of transaction table :
      | Date | Description | Deposit |Withdrawal|