Feature: Login

  Scenario: Login with valid credentials
    Given user is on the login page
    When the user enters valid credentials as "admin@mail.com" and "11111111"
    Then the user is redirected to the "admin" dashboard page