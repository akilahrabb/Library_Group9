@UserStory4
Feature: As a librarian I should be able to add  from users page

  Background:
    Given User is on the library login page
    When User enters correct librarian "librarianUsername" and "librarianPassword"
    And User clicks the sign-in button

  Scenario: User should able to add new user with valid info
    Then Clicks on users button
    And Clicks on Add User button
    When On add user form ,should be able to complete all boxes with valid info
    Then Clicks Save changes button
