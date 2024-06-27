Feature: Add Portfolio

  Background:
    Given user is on the login page
    When the user enters valid credentials as "annisaurohmah@mail.ugm.ac.id" and "abc123"
    Then the user is redirected to the landing page
    Given user is on the landing page
    When user click profile
    And profile page show up

  Scenario: User add portfolio
    Given user click add portfolio button
    When user completes the required data
    Then user click
