@UserGroupCategories
Feature: User group categories feature

  Background: User is already in login page
    Given User is on the library login page
    When User enters correct librarian "librarianUsername" and "librarianPassword"
    And User clicks the sign-in button
Scenario: Verify user categories

  //Then User is on the liberian homepage
  When  User click users module
  And the user click User Group dropdown
  Then the user should see the following options
| ALL    |
| Librarian |
| Students  |



