@SearchOnProWeb
Feature: Ability to search for Flights

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser

  @SearchOnProWeb
  Scenario: 01 View Flights - initial load
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then The Campaigns page loads successfully
    And All Flights loads which I have access to
    And  There is a section called 'Flights'
    And LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 02 Ability to Search fights by Flight Name or Booking Code
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to
    And I can search by Flight Name or Booking Code
    And LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 03 Ability to Filter fights by Advertiser or Agency
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to
    And Filter dropdown fields exist
    And LogOut ProteusWeb from Campaigns page


  @SearchOnProWeb
  Scenario: 04 Ability to use search and filter combinations
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to
    And LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 05 Apply button is enabled after entering/selecting search and filters
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to
    When I search/filter for a particular result
    Then Apply button is enabled
    And LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 06 Clear Filters button is enabled after entering/selecting search and filters
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to
    When I search/filter for a particular result
    Then Clear Filters button is enabled
    And LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 07 Flights matching Search/Filter Combination loaded as results
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to
    When I search/filter for a particular result
    And Click on Apply button
    Then All Flights matching search/filter combination load as results
    And  There is a section called 'Flights'
    And  Each flight title includes Advertiser, Agency, Flight Names and External Booking Reference
    Then LogOut ProteusWeb from Campaigns page


  @SearchOnProWeb
  Scenario: 08 Goal Type, Goal Value, Optimisation Manager, Budget, Spend information and Flight Dates
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to
    When I search/filter for a particular result
    And Click on Apply button
    Then All Flights matching search/filter combination load as results
    And  Goal Type, Goal Value, Optimisation Manager, Budget, Spend information and Flight Dates
    Then LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 09 Goal Type, Goal Value, Optimisation Manager are editable
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to
    When I search/filter for a particular result
    And Click on Apply button
    Then All Flights matching search/filter combination load as results
    And  Goal Type, Goal Value, Optimisation Manager are editable
    Then LogOut ProteusWeb from Campaigns page


  @SearchOnProWeb
  Scenario: 10 Pagination shown when more than 20 flights displayed
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to
    When I search/filter for a particular result
    And Click on Apply button
    Then All Flights matching search/filter combination load as results
  # And Pagination shown when more than 20 flights displayed
    Then LogOut ProteusWeb from Campaigns page


  #  @SearchProWeb
   # Scenario: 11 API Search for Flights
    #  When API Search for Flights
