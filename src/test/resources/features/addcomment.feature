Feature: Add Comment

  Background:
    Given user is on the login page
    When the user enters valid credentials as "annisaurohmah@mail.ugm.ac.id" and "abc123"
    Then the user is redirected to the landing page
    Given user accesses the landing page
    And user clicks the Showcase Button
    When user clicks one of the portfolios
    Then portfolio details should be displayed

  Scenario: User add comments
    Given user access portfolio details
    When user writes a comment
    Then user clicks Send button