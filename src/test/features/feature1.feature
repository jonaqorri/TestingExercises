Feature: Login and Logout
  As a user
  I want to be able login
  So that I can access the site

  Scenario: Signing in with correct credentials
    Given I am a registered user
    When I click on the Sign In tab on the site
    And I type my correct username and password
    And I click the Sign In button
    Then I should be redirected to the "Welcome" page

  Scenario: Signing in with incorrect credentials
    Given I am a user
    When I click on the Sign In tab on the site
    And I type in the wrong username and password combo
    And I click the Sign In button
    Then I should see a Failed Login message

  Scenario: Logging out
    Given I am a registered user
    And I am logged in to the site
    When I click the log out button
    And the Sign Out pop up appears
    And I click confirm
    Then I am returned to the Sign In page