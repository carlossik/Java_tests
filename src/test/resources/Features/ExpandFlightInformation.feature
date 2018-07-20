@FlightInformation
Feature: Proteus web Flight Information

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to

  @FlightInformation
  Scenario: 01 Goal, Viewability, DSP, Ad Server and Discrepancy Details displayed on Proteus Web
    When I search/filter for a flightName "IO-6920"
    And Click on Apply button
   # And Expand flight details
    Then Discrepancy Details displayed when flight is expanded
    Then Discrepancy Details show tooltip
    And Primary Goal Details displayed when flight is expanded
    And Actual Goal detials show tooltip
    And Viewability Details displayed when flight is expanded
    And Viewability detials show tooltip
    And DSP Data Details displayed when flight is expanded
    And DSP Data detials show tooltip
    And AdServer Data Details displayed when flight is expanded
    And AdServer detials show tooltip