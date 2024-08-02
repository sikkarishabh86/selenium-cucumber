
Feature: FreeCRM Login

  Scenario: Verify that user is able to login with valid credentials
    Given user is presnet on the login page of the application
    When user enters the valid credentials
    And user clicks on the login button
    Then user is redirected to the application dashboard page
    