@CampaignsTabProWeb
Feature: Ability to search for Campaigns

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    And Navigate to "Campaigns" Tab on Campaigns

  @CampaignsTabProWeb
  Scenario: 01 View Campaigns - initial load
    Then The Campaigns page loads successfully
    And All Campaigns loads which I have access to
    And There is a section called 'Campaigns'
    And LogOut ProteusWeb from Campaigns page

  @CampaignsTabProWeb
  Scenario: 02 Ability to Search Campaigns by Campaigns Name or Agency Name
    Then All Campaigns loads which I have access to
    And I can search by Campaigns Name or Agency Name
    And LogOut ProteusWeb from Campaigns page

  @CampaignsTabProWeb
  Scenario: 03 Ability to Filter Campaigns by Advertiser, Agency, Group advertiser and Market
    Then All Campaigns loads which I have access to
    And There is option to set the filters
    And Campaigns Tab Filter dropdown fields exist on popup
    And I can see Clear filter icon on popup
    When I have selected values in one or more filters
    When I click on clear filters
   # Then The values are cleared on popup
  #  When I have selected values in one or more filters
    #When I click on cancel on popup
   # Then Changes are discarded on the popup and popup closed
    And LogOut ProteusWeb from Campaigns page

  @CampaignsTabProWeb
  Scenario: 04 Pagination shown when more than 20 flights displayed
    Then All Campaigns loads which I have access to
    When I search/filter for a particular campaign
    And Campaigns tab click on Apply button
    Then All campaign matching search/filter combination load as results
    # And Pagination shown when more than 20 flights displayed
    Then LogOut ProteusWeb from Campaigns page

  @CampaignsTabProWeb
  Scenario: 05 No flights matching your search message shown
    Then All Campaigns loads which I have access to
    When I search/filter for a campaign "AAAAAAAAA" on Campaigns tab
    And Campaigns tab click on Apply button
    Then No campaign returned and message displayed
    Then LogOut ProteusWeb from Campaigns page

  @CampaignsTabProWeb
  Scenario: 06 Able to search flights based on Campaign Name
    Then All Campaigns loads which I have access to
    When I search/filter for a campaign "LOCAL BRANDING - GAME/COUNTRY" on Campaigns tab
    And Campaigns tab click on Apply button
    And Click on ended on campaign tab
    Then All Campaigns matching campaign "LOCAL BRANDING - GAME/COUNTRY" are filtered
    And LogOut ProteusWeb from Campaigns page

  @CampaignsTabProWeb
  Scenario: 07 Goal, Viewability, Cost Breakdown, DSP Delivery and AD Server Delivery details
    When I search/filter for a campaign "LOCAL BRANDING - GAME/COUNTRY" on Campaigns tab
    And Campaigns tab click on Apply button
    And Click on ended on campaign tab
    And Expand Campaign details
    And Cost Breakdown Details displayed when Campaign is expanded
    And MRC Viewability Details displayed when Campaign is expanded
    And DSP Delivery Details displayed when Campaign is expanded
    And DSP Delivery details show tooltip when Campaign is expanded
    And AdServer Delivery Details displayed when Campaign is expanded
    When Click on arrow Campaign details
    Then Campaign details collapsed
    When I select show decimal places on campaign tab
    Then Decimal places shown for amounts on campaign grid
    When I select hide decimal places on campaign tab
    Then Decimal places not shown for amounts on campaign grid

  @CampaignsTabProWeb
  Scenario Outline: 08 Sort columns on Campaign
    When I search/filter for a particular campaign
    And Campaigns tab click on Apply button
    #Then All Campaign matching search/filter combination load as results
    When Clicked on the Campaign header "<Header>"
    Then Campaign rows are sorted based on "<Header>"
    Examples:
      | Header       |
      |Agency      |
      |Group Advertiser |
      |Advertiser   |
      |Market|
      |Campaign|
      |Start Date|
      #|End Date|

  @CampaignsTabProWeb
  Scenario: 09 Able to open creatives tab from Campaign
    When I search/filter for a particular campaign
    And Campaigns tab click on Apply button
    Then All campaign matching search/filter combination load as results
    And Creatives option shown on the Campaigns tab
    When I click on the creatives icon on Campaign row
    Then Creatives screen opened

  @CampaignsTabProWeb
  Scenario: 10 Able to open pixels tab from Campaign
    When I search/filter for a particular campaign
    And Campaigns tab click on Apply button
    Then All campaign matching search/filter combination load as results
    And Pixels option shown on the Campaigns tab
    When I click on the pixels icon on Campaign row
    Then Pixels screen opened

  @CampaignsTabProWeb
  Scenario: 11 Flight link on campaign tab
      When I search/filter for a particular campaign
      And Campaigns tab click on Apply button
      Then All campaign matching search/filter combination load as results
      And Campaign column is shown as a link
      When Clicked on the Campaign name in the table
      Then Flights tab loaded
