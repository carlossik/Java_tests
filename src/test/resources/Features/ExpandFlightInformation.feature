@FlightInformation
Feature: Proteus web Flight Information

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    And Navigate to "Flights" Tab on Campaigns
    Then All Flights loads which I have access to

  @FlightInformation
  Scenario: 01 Goal, Viewability, DSP, Ad Server and Discrepancy Details displayed on Proteus Web
    When I search/filter for a flightName "IO-6920"
    And I Click on search for ended flights
    And Click on Apply button
    And Expand flight details
    Then Performance Details displayed when flight is expanded
    Then Performance Details show tooltip
    And Cost Breakdown Details displayed when flight is expanded
    And MRC Viewability Details displayed when flight is expanded
    And DSP Delivery Details displayed when flight is expanded
    And DSP Delivery details show tooltip
    And AdServer Delivery Details displayed when flight is expanded
    When Click on arrow flight details
    Then Flight details collapsed
    When I select show decimal places
    Then Decimal places shown for amounts
    When I select hide decimal places
    Then Decimal places not shown for amounts
