Feature: Login

  Scenario: Login with valid credentials
    Given user is on the login page
    When the user enters valid credentials as "annisaurohmah@mail.ugm.ac.id" and "abc123"
    Then the user is redirected to the landing page



