@bookCategories
Feature: As a student, I should be able to search books with different categories

  Background:
    Given User is on the library login page
    When User enters correct student "student1Username" and "student1Password"
    And User clicks the sign-in button

  Scenario: Student can search books by category
    Then user sees the below categories
      | ALL                     |
      | Action and Adventure    |
      | Anthology               |
      | Classic                 |
      | Comic and Graphic Novel |
      | Crime and Detective     |
      | Drama                   |
      | Fable                   |
      | Fairy Tale              |
      | Fan-Fiction             |
      | Fantasy                 |
      | Historical Fiction      |
      | Horror                  |
      | Science Fiction         |
      | Biography/Autobiography |
      | Humor                   |
      | Romance                 |
      | Short Story             |
      | Essay                   |
      | Memoir                  |
      | Poetry                  |
