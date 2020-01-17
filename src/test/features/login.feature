Feature: Login
  As a user
  I want to be able login
  So that I can access the site

  Scenario: Signing in with correct credentials
    Given I am a registered user
    When I click on the Sign In tab on the site
    And I type my correct username and password
    And I click the Sign In button
    Then I should be redirected to the Welcome page

  Scenario: Signing in with incorrect credentials
    Given I am a user
    When I click on the Sign In tab on the site
    And I type in the wrong username and password combo
    And I click the Sign In button
    Then I should see a Failed Login message
