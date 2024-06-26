Feature: Login

  Scenario: Login with valid credentials
    Given user is on the login page
    When the user enters valid credentials as "annisaurohmah@mail.ugm.ac.id" and "abc123"
    Then the user is redirected to the dashboard page

  Scenario: User melakukan edit atau perubahan informasi profil
    Given user is on the dashboard page
    When user click profile
    Then profile page show up

