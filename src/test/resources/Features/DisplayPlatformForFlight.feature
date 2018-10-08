@LinksToPlatforms
Feature: Display Platform for each Flight

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to
    When I search/filter for "FLIGHT 6655" a particular result
    And I Click on search for ended flights
    And Click on Apply button

  @LinksToPlatforms
  Scenario: 01 Display Platform for each Flight
    Then All Flights matching search/filter combination load as results
    And  There icons for platforms are displayed
    And  Tooltips shown on mouseover on each platform icon

   @LinksToPlatforms
  Scenario: 02 Platforms tab opened for the Advertiser in the Platform
    Then All Flights matching search/filter combination load as results
    And Platforms tab opened for the Advertiser in the Platform on click