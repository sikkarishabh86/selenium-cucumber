Feature: Contact creation

  Background: 
    Given user is presnet on the login page of the application
    When user enters the valid credentials
    And user clicks on the login button
    Then user is redirected to the application dashboard page

  Scenario: Verify that user is able to create a contact
  When user hovers over the contacts icon
  And user clicks on the Contacts plus icon
  Then user is redirected to the Create New Contact page
  When user fills first name
  And user fills the last name
  And user fills the middle name
  And user searches and selects a company
  And user searches and selects a tag
  And user enters the email
  And user selects the category
  And user selects the status
  And user enters the description
  And user enters the twitter handle
  And user enters the address
  And user enter the phone number
  And user enters the position
  And user enters the department
  And user searches and selects the supervisor
  And user searches and selects the assistant
  And user searches and selects the referred by
  And user selects the Source
  And user selects do not call, do not text and do not email toggle
  And user enters the birthday
  And user enters the identifier and uploads the image
  And clicks on save button
