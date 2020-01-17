Feature: Logout
  As a user
  I want to be able logout
  So that no one else can access the site

Scenario: Logging out
  Given I am a registered user
  And I am logged in to the site
  When I click the log out button
  And the Sign Out pop up appears
  And I click confirm
  Then I am returned to the Sign In page