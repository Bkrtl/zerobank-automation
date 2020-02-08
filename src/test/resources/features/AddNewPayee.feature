
Feature: Add new payee under pay bills

  Scenario: Add a new payee
    Given the user accesses the Add New Payee tab
    And creates new payee using following information
      |Payee Name       |The Law Offices of Hyde, Price & Scharks|
      |Payee Address    | 100 Samest, Anytown, USA, 10001        |
      |Account          | Checking                               |
      |Payee Details    | XYZ account                            |
    Then message "The new payee The Law Offices of Hyde, Price & Scharks was successfully created." should be displayed