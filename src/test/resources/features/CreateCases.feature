Feature: Contact creation

  Background:
    Given user is present on the login page of the application
    When user enters the valid credentials
    And user clicks on the login button
    Then user is redirected to the application dashboard page


  Scenario: Verify that user is able to create a new Case
    When user hovers over the case icon
    And user clicks on the Case plus icon
    Then user is redirected to the Create New Case page
    When user fills title
    And user fills Assigned to
    And user fills Company
    And user selects Type
    And user fills Close Date
    And user fills Description
    And user selects Status
    And user selects Contact
    And user selects Deal
    And user fills Deadline date
    And user enters and select Tags
    And user selects the Priority
    And user enters the Identifier
    And Click the Save button
    Then Case should be created successfully

