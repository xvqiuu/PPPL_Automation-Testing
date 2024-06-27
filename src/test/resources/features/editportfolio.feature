Feature: Edit Portfolio

  Background:
    Given user is on the login page
    When the user enters valid credentials as "annisaurohmah@mail.ugm.ac.id" and "abc123"
    Then the user is redirected to the landing page
    Given user is on the landing page
    When user click profile
    And profile page show up
    Given user is on the profil page

  Scenario: User edit portfolio
    Given user click Edit Portfolio button
    When user editing portfolio
    And user click save edit portfolio button
    Then profile page should be displayed