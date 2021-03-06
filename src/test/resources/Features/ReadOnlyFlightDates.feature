@FlightDates
Feature: Flight Start and End Dates shown
  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    And Navigate to "Flights" Tab on Campaigns

  @FlightDates
  Scenario: 01 There is a box/area to show Start Date and End Date
    When I search/filter for result with end date
    And I Click on search for ended flights
    Then Box shown with Start Date and End Date
    #And A progress bar shown

  @FlightDates
  Scenario: 02 There is a box/area to show Start Date Indefinite
    When I search/filter for result without end date
    Then Box shown with Start Date
    Then End date shown as an icon and Tooltip shown
   # And A progress bar shown