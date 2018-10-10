@SortOnProWeb
Feature: Ability to sort Flights

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page


  @SortOnProWeb
  Scenario Outline: 01 Sort columns on flights
    When I search/filter for a particular result
    And Click on Apply button
    Then All Flights matching search/filter combination load as results
    When Clicked on the flight header "<Header>"
    Then Flight rows are sorted based on "<Header>"
  Examples:
  | Header       |
  |Agency      |
  |Group Advertiser |
  |Advertiser   |
  |Market|
  |Booking|
  |Campaign|
  |Flight|
  |Start Date|
  |End Date|
