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
  Scenario: 01 Requires action tick box shown
    Then There is an option to filter by 'Requires action'
    And Default 'Requires action' is unselected
    When Click on 'Requires action'
    Then 'Requires action' is selected
    And Click on Apply button

  @SortOnProWeb
  Scenario: 02 Option to sort result
    Then Option to sort result by Flight Created and Updated
    When Select sort by Flight created
    Then Sort by Flight created selected
    When Select sort by Flight Updated
    Then Sort by Flight updated selected


  @SortOnProWeb
  Scenario: 03 Flights sorted by Created date
    When I search/filter for a particular result
    When Select sort by Flight created
    And Click on Apply button
    Then All Flights matching search/filter combination load as results
    And  All flights sorted based on created date


  @SortOnProWeb
  Scenario: 04 Flights sorted by Updated date
    When I search/filter for a particular result
    When Select sort by Flight Updated
    And Click on Apply button
    Then All Flights matching search/filter combination load as results
    And  All flights sorted based on updated date