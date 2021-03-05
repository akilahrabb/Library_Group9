Feature: User should be able to log out of library app.

  Background: User will login as student
    Given User is on the library login page
    When User enters correct student "student1Username" and "student1Password"
    And User clicks the sign-in button

  @UserStory2
  Scenario: User should be able to log out of app by using log out button
    Given : User is logged into homepage in library app.
    When :User moves cursor to user name and select to see drop menu
    And :User should be able to log out by clicking on "Log Out" button
    Then :User should be logged out , and returned back to log in page