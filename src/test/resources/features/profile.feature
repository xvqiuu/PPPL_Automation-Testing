Feature: Profile

  Background:
    Given user is on the login page
    When the user enters valid credentials as "annisaurohmah@mail.ugm.ac.id" and "abc123"
    Then the user is redirected to the landing page

  Scenario: User edits profile
    Given user is on the landing page
    When user click profile
    And profile page show up
    Then user edits profile
    And user click save