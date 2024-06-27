Feature: View portfolio details

  Scenario: User accesses portfolio details
    Given user accesses the landing page
    And user clicks the Showcase Button
    When user clicks one of the portfolios
    Then portfolio details should be displayed