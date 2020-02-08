
Feature: Pay Bills

  Scenario: Pay Bills page
    Given the user is on the login page
    When the users enter the user information
    Then the users should be at Pay Bills page

  Scenario Outline: Positive test scenario
    Given the user is on Pay Bills  page
    And the user enters "<Amount>" and "<Date>"
    When the user click "Pay" button
    Then the positive message is displayed "The payment was successfully submitted."

    Examples:
      |Amount     | Date        |
      |   100     |  2020-01-01 |

  Scenario Outline: Negative test scenario without amount
    Given the user is on Pay Bills  page
    Given the user enters wrong information into the fields "<Amount>" and "<Date>" as follows
    When the user click "Pay" button
    Then the negative message is displayed "Please fill in this field." due to lack of amount

    Examples:
      |Amount     | Date        |
      |           |             |
      |           | 2020-03-04  |

  Scenario Outline: Negative test scenario without date
    Given the user is on Pay Bills  page
    Given the user enters wrong information into the fields "<Amount>" and "<Date>" as follows
    When the user click "Pay" button
    Then the negative message is displayed "Please fill in this field." due to lack of date

    Examples:
      |Amount     | Date        |
      |   45      |             |

