@UserStory2

Feature: User should be able to log out of library app.

  Scenario Outline: User should be able to log out of app by using log out button
    Given : User is logged into homepage in library app.
    When :User moves cursor to user name and select to see drop menu
    And :User should be able to log out by clicking on <arg0> button
    Then :User should be logged out , and returned back to log in page

    Examples:
      | arg0      |
      | "log out" |