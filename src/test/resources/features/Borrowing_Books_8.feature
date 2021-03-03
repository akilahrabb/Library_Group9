@borrowing
Feature: As a user, I should be able to see my borrowed books in the Borrowing Books module

  #Loggin in in the background, so these scenarios are only about this user story
  Background:
    Given User is on the library login page
    When User enters correct student "student1Username" and "student1Password"
    And User clicks the sign-in button

  Scenario Outline: User should see column names in table of borrowed books
    Given User selects Borrowing Books from the menu
    When User sees the following column names "<columnName>"

    Examples:
      |columnName|
      |Action|
      |Book Name|
      |Borrowed Date|
      |Planned Return Date|
      |Return Date|
      |Is Returned ?|