@EditGoalData
Feature: Proteus home page

Background:
  Given I am a Proteus User
  And I have the role: Pro Web Campaigns
  And I go to the Proteus Home URL in my browser
  When Login as "ADMINISTRATOR"
  Then The main homepage loads successfully

  Scenario: 01 Campaign Flights box on the home page
    When I click on "Campaigns" from home page
    And I search/filter for a flightName "NewFlightAutomation 765"
    And Click on Apply button
    When I click on "Home" from home page
    Then Campaign Flights box shown on home page
    And Recently viewed flights are listed "NewFlightAutomation 765"

  Scenario: 02 Advertiser Accounts box on the home page
    When I click on "Organisations" from home page
    Then Organisations page shown correctly
    Then Able to navigate to Advertiser Accounts
    When Search for a Advertiser Name "PHARMA - MAINTAIN"
    Then Advertisers filtered as per search key "PHARMA - MAINTAIN"
    When I select a First Advertiser Account
    When I click on "Home" from home page
    Then Advertiser Accounts box shown on home page
    And Recently viewed Advertiser Accounts are listed "PHARMA - MAINTAIN"
    When Click on one of advertiser account
    Then Advertiser Platform details shown

  Scenario: 03 Ad Server Placements box on the home page
    When I click on "Home" from home page
    Then Ad Server Placements box shown on home page
    And Recently viewed Ad Server Placements are listed

  Scenario: 04 DSP Creatives box on the home page
    When I click on "Home" from home page
    Then DSP Creatives box shown on home page
    And Recently viewed DSP Creatives are listed

  Scenario: 05 Advertiser Accounts with missing hard pixel box on the home page
    When I click on "Home" from home page
    Then Advertiser Accounts with missing hard pixel box shown on home page
    And Recently viewed Advertiser Accounts with missing hard pixel are listed
    When Click on one of advertiser account with missing hard pixel
    Then Pixels screen opened

