@login
Feature: Login
  Lib-1000 As a student user, I should be able to see the student landing page
  Lib-1003 As a librarian user, I should be able to see the librarian landing page

  #Acceptance criteria Lib=1000
  #Student will login with valid username and password
  #Librarian negative test
  Scenario Outline: User will login as student
    Given User is on the library login page
    When User enters correct student "<Username>" and "<Password>"
    And User clicks the sign-in button
    Then User sees the library homepage

    Examples:
      | Username         | Password         |
      | student1Username | student1Password |
      | student2Username | student2Password |
      | student3Username | student3Password |


  #Student negative test
  Scenario Outline: User will login as librarian
    Given User is on the library login page
    When User enters correct librarian "<Username>" and "<Password>"
    And User clicks the sign-in button
    Then User sees the library homepage

    Examples:
      | Username          | Password          |
      | librarianUsername | librarianPassword |
















