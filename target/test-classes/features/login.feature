Feature: As a user, I should be able to login to the library app

  Scenario Outline: User will login
    Given User is on the library login page
    When User enters correct "<Username>" and "<Password>"
    And User clicks the sign-in button
    Then User sees the library homepage

    Examples:
      | Username            | Password |
      | student42@library   | zCm83mcJ |
      | student43@library   | 7F1rV4W8 |
      | student44@library   | BIXPElK5 |
      | librarian54@library | 1HFI6LjC |


















