Feature: Create an API demo with basic functions

  Scenario: Get user existing boards
    Given the application is running
    When the user submits get boards request
    Then the boards are visible