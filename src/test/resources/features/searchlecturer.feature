Feature: Search Lecturer

  Background:
    Given user accesses the landing page

  Scenario: User search lecturer by name
    Given user clicks the Read More Button
    When user input lecturer by name
    Then lecturer should be displayed