
Feature: Account Summary

  Scenario: Account Summary page
    Given the user is on the login page
    When the users enter the user information
    Then the users should be at Account Summary page

  Scenario: Account Summary page content
    Given the user is on the Account Summary Page
    Then the users see following account types :
      | Cash Accounts | Investment Accounts | Credit Accounts | Loan Accounts|

  Scenario: Account Summary - Credit Accounts
    Given the user is on the Account Summary Page
    Then the users see following columns of Credit Accounts :
      | Account | Credit Card | Balance |