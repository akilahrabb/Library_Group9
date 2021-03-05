@UserStory4Prt2
Feature: As a librarian I should be able to edit user .

  Background:
    Given User is on the library login page
    When User enters correct librarian "librarianUsername" and "librarianPassword"
    And User clicks the sign-in button


  Scenario:User should be able to edit user and close out of user window
    Then Clicks on users button
    Then Clicks Edit User button
    And Clicks close button
