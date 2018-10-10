@SearchOnProWeb
Feature: Ability to filter

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page

  @SearchOnProWeb
  Scenario: 01 View Flights - initial load
    Then The Campaigns page loads successfully
    And All Flights loads which I have access to
    And  There are options to filter flights based on date
    And LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 02 Ability to filter fights on current date
    Then All Flights loads which I have access to
    When I search/filter for a flightName "automation"
    When I filter flight on "Current" Date
    Then All the current flights are listed
    And LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 03 Ability to filter fights on Ended date
    Then All Flights loads which I have access to
    When I search/filter for a flightName "automation"
    When I filter flight on "Ended" Date
    Then All the Ended flights are listed
    And LogOut ProteusWeb from Campaigns page


  @SearchOnProWeb
  Scenario: 04 Ability to filter fights on Future date
    Then All Flights loads which I have access to
    When I search/filter for a flightName "automation"
    When I filter flight on "Future" Date
    Then All the Future flights are listed
    And LogOut ProteusWeb from Campaigns page