@wip
Feature:  As a librarian, I should be able to see book records on user page

  Background:
    Given User is on the library login page
    When User enters correct librarian "<Username>" and "<Password>"
    And User clicks the sign-in button
    Then User sees the library homepage

  Scenario: Verify that the default record is 10
    Given User is on the library login page
    When User clicks on the Books tab
    Then User should see default showing "10" records

  Scenario: Verify showings records for count option
   #count: 5,10,15,50,100
    Given User is on the library login page
    When User clicks on the Books tab
    Then User clicks to see all record count options and should see displayed
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |
      | 200   |
      | 500   |


