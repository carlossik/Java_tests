@LoginProWeb
Feature: Ability to log into Pro Web

  Background:
   Given I am a Proteus User
   And I have the role: Pro Web Campaigns
   And I go to the Proteus Home URL in my browser

  @LoginProWeb
  Scenario: 01 Entering Pro Web
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    And There is a box called "Campaigns"
    And Log Out button exist
    And LogOut ProteusWeb from Home Page

  @LoginProWeb
  Scenario: 02 Entering Pro Web with incorrect details
    When Login as "INVALID"
    Then An error message displayed advising to try again

  @LoginProWeb
  Scenario: 03 Campaigns page loaded
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then The Campaigns page loads successfully
    And LogOut ProteusWeb from Home Page

  @LoginProWeb
  Scenario: 04 Campaigns page loaded with different options
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When  I click on "Campaigns" from home page
    Then Log out, Back to Home, Flights icon shown on Campaign page
    And Creatives option shown on the Campaigns tab
    And LogOut ProteusWeb from Home Page

  @LoginProWeb
  Scenario: 05 Navigated to Campaigns when logged in with only Campaign Web role
    When Login as "CAMPAIGN MANAGEMENT WEB"
    Then Log out, Back to Home, Flights icon shown on Campaign page
    And Creatives option not shown on the Campaigns tab
    And LogOut ProteusWeb from Home Page