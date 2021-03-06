@SearchOnProWeb
Feature: Ability to search for Flights

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    And Navigate to "Flights" Tab on Campaigns

  @SearchOnProWeb
  Scenario: 01 View Flights - initial load
    Then The Campaigns page loads successfully
    And All Flights loads which I have access to
    And  There is a section called 'Flights'
    And LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 02 Ability to Search fights by Flight Name or Booking Code
    Then All Flights loads which I have access to
    And I can search by Flight Name or Booking Code
    And LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 03 Ability to Filter fights by Advertiser or Agency
    Then All Flights loads which I have access to
    And Filter dropdown fields exist
    And LogOut ProteusWeb from Campaigns page

  @CampaignsTabProWeb
  Scenario: 04 Ability to Filter fights by Advertiser, Agency, Group advertiser and Market
    Then All Campaigns loads which I have access to
    And There is option to set the filters on flights tab
    And Fights Tab Filter dropdown fields exist on popup
    And I can see Clear filter icon on flights filter popup
    When I have selected values in one or more on flights filter popup
    When I click on clear filters on flights filter popup
    #Then The values are cleared on popup on flights filter popup
    #When I have selected values in one or more on flights filter popup
    #When I click on cancel on popup on flights filter popup
    #Then Changes are discarded on the fligts popup and popup closed
    And LogOut ProteusWeb from Campaigns page


  @SearchOnProWeb
  Scenario: 05 Ability to use search and filter combinations
    Then All Flights loads which I have access to
    And LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 06 Apply button is enabled after entering/selecting search and filters
    Then All Flights loads which I have access to
    When I search/filter for a particular result
    #Then Apply button is enabled
    And LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 07 Clear Filters button is enabled after entering/selecting search and filters
    Then All Flights loads which I have access to
    When I search/filter for a particular result
   # Then Clear Filters button is enabled
    And LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 08 Flights matching Search/Filter Combination loaded as results
    Then All Flights loads which I have access to
    When I search/filter for a particular result
    And Click on Apply button
    Then All Flights matching search/filter combination load as results
    And  There is a section called 'Flights'
    And  Each flight title includes Advertiser, Agency, Flight Names and External Booking Reference
    Then LogOut ProteusWeb from Campaigns page


  @SearchOnProWeb
  Scenario: 09 Budget, Spend information and Flight Dates
    Then All Flights loads which I have access to
    When I search/filter for a particular result
    And Click on Apply button
    Then All Flights matching search/filter combination load as results
    And  Budget, Spend information and Flight Dates
    #And  The Currency code for the Flight is displayed next to the Budget
    Then LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 10 Goal Type, Goal Value, Optimisation Manager are editable
    Then All Flights loads which I have access to
    When I search/filter for a particular result
    And Click on Apply button
    Then All Flights matching search/filter combination load as results
    And  Goal Type, Goal Value, Optimisation Manager are editable
    Then LogOut ProteusWeb from Campaigns page


  @SearchOnProWeb
  Scenario: 11 Pagination shown when more than 20 flights displayed
    Then All Flights loads which I have access to
    When I search/filter for a particular result
    And Click on Apply button
    Then All Flights matching search/filter combination load as results
    # And Pagination shown when more than 20 flights displayed
    Then LogOut ProteusWeb from Campaigns page


  @SearchOnProWeb
  Scenario: 12 No flights matching your search message shown
    Then All Flights loads which I have access to
    When I search/filter for a flightName "AAAAAAAAA"
    And Click on Apply button
    Then No flights returned and message displayed
    Then LogOut ProteusWeb from Campaigns page

  @SearchOnProWeb
  Scenario: 13 Able to search flights based on Campaign Name
    Then All Flights loads which I have access to
    When I search/filter for a Campaign "LOCAL BRANDING - GAME/COUNTRY"
    And Click on Apply button
    Then All Flights matching campaign "LOCAL BRANDING - GAME/COUNTRY" are filtered
    And LogOut ProteusWeb from Campaigns page