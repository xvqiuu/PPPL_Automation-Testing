Feature: Logout

  Background:
    Given user is on the login page
    When the user enters valid credentials as "annisaurohmah@mail.ugm.ac.id" and "abc123"
    Then the user is redirected to the landing page
    Given user is on the landing page
    When user click profile
    And profile page show up

  Scenario: User logout
    Given user is on the profil page
    When user click Logout button
    Then landing page show up