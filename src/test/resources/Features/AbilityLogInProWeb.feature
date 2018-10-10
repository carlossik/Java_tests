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
    And Pixels option shown on the Campaigns tab
    And LogOut ProteusWeb from Home Page

  @LoginProWeb
  Scenario: 05 Navigated to Campaigns when logged in with only Campaign Web role
    When Login as "CAMPAIGN MANAGEMENT WEB"
    And There is a box called "Campaigns"
    And All other tabs apart from "Campaigns" are hidden
    When I click on "Campaigns" from home page
    Then The Campaigns page loads successfully
    Then Log out, Back to Home, Flights icon shown on Campaign page
    And Creatives option shown on the Campaigns tab
    And Pixels option shown on the Campaigns tab
    And LogOut ProteusWeb from Home Page

  @LoginProWeb
  Scenario: 06 Login with a user that has access to advertiser management editor
    When Login as "ADVERTISERMANAGEREDITOR"
    And There is a box called "Organisations"
    And All other tabs apart from "Organisations" are hidden
    When I click on "Organisations" from home page
    Then Organisations page shown correctly
    Then Log out, Back to Home, Flights icon shown on Campaign page
    Then Able to navigate to Advertiser Accounts

  @LoginProWeb
  Scenario: 07 Login with a user that has access to vendor management role
    When Login as "VENDORMANAGERROLE"
    And There is a box called "Vendors"
    And All other tabs apart from "Vendors" are hidden
    When I click on "Vendors" from home page
    Then Administration page shown correctly
    And Able to filter seats by Operation Unit TEL
    And Able to navigate to Administration Jobs
    And Able to navigate to Administration Master Data

  @LoginProWeb
  Scenario: 08 Login with a user that has access to Proteus home dashboard role
    When Login as "DASHBOARDROLE"
    And There is a box called "Home"
    And All other tabs apart from "Home" are hidden
    When I click on "Home" from home page
    Then Campaign Flights box shown on home page
    Then Advertiser Accounts with missing hard pixel box shown on home page
    Then DSP Creatives box shown on home page
