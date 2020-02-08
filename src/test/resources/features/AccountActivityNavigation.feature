
Feature: Navigating to specific accounts in Accounts Activity

  Scenario:   Savings account redirect
    Given the user is on the login page
    When the users enter the user information
    Then the users should be at Account Summary page
    When the user click on Savings link on the Account Summary page
    Then the users should be at Account Activity page
    And account dropdown should have "Savings" selected

  Scenario: Brokerage account redirect
    Given the user is on the Account Summary Page
    When the user clicks on Brokerage link on the Account Summary page
    Then the users should be at Account Activity page
    And account dropdown should have "Brokerage" selected

  Scenario: Checking account redirect
    Given the user is on the Account Summary Page
    When the user clicks on Checking link on the Account Summary page
    Then the users should be at Account Activity page
    And account dropdown should have "Checking" selected

  Scenario: Credit Card account redirect
    Given the user is on the Account Summary Page
    When the user clicks on Credit card link on the Account Summary page
    Then the users should be at Account Activity page
    And account dropdown should have "Credit Card" selected

  Scenario: Loan account redirect
    Given the user is on the Account Summary Page
    When the user clicks on Loan link on the Account Summary page
    Then the users should be at Account Activity page
    And account dropdown should have "Loan" selected