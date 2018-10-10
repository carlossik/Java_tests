@ReportingAPIvsProteusWeb
Feature: Reporting API Vs Proteus web

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    And Navigate to "Flights" Tab on Campaigns
    Then All Flights loads which I have access to


  @ReportingAPIvsProteusWeb
  Scenario Outline: 01 ReportingAPI figures match Proteus Web

    When I search/filter for a flight "<FlightId>"
    And Click on Apply button
    And Expand flight details
    And I get numbers from reporting API for flight "<FlightId>"
    Then Numbers displayed match the reporting API for flight "<FlightId>"
    Examples:
      | FlightId |
      | 4573     |
      | 454     |
      | 808     |




