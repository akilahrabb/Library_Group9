@VerifyStatus
Feature: As a librarian, I should be able to verify user status

Background:
Given User is on the library login page
When User enters correct librarian "librarianUsername" and "librarianPassword"
And User clicks the sign-in button

  Scenario: User should see User status dropdown
  Given User clicks User module
  When User clicks the status dropdown button
  Then User should see the following options
    |ACTIVE|
    |INACTIVE|


