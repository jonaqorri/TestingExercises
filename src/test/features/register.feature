Feature: Register
  As a user
  I want to be able to register for the service
  So that I can access the site and its features

  Scenario: Access registration page
    Given I navigate to the Codeveros Login page
    When I click on Register tab
    Then I see 6 text fields

  Scenario: Register
    Given I am on the Registration page
    When I fill in the 6 text fields
    And I am able to click the Register button
    Then I am redirected to the Welcome to Codeveros page

  Scenario: Check the user is registered through the menu
    Given I am a registered user
    And I am on the Welcome page
    When I click User under Menu
    Then I see my information populated under the User List

  Scenario: Check the user is registered through the header icon
    Given I am a registered user
    And I am on the Welcome page
    When I click the User icon on the site header
    Then I see my information populated under the User List