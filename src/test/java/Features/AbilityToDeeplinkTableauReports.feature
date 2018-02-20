@TableauReporting
Feature: Ability to deep-link to Tableau reports

  Background:
   Given I am a Proteus User
   And I have the role: Pro Web Campaigns
   And I go to the Proteus Home URL in my browser
   When Login as "ADMINISTRATOR"
   Then The main homepage loads successfully
   When I click on "Campaigns" from home page
   Then All Flights loads which I have access to
   When I search/filter for a particular result
   And Click on Apply button

  @TableauReporting
  Scenario: 01 Reporting Icon at Flight Level
   Then All Flights matching search/filter combination load as results
   And  There is a reporting chart icon to the right hand side of the Flight

  @TableauReporting
  Scenario: 02 Reporting tooltip on Icon
   Then Tooltip 'Click to go to reports' shown on mouseover
   And There are two links in the pop up for the following core reports:
       #Advertiser Analysis
       #Operations Breakdown

  @TableauReporting
  Scenario: 03 Tableau Reporting tab opened for Advertiser Analysis
    When Click on "Advertiser Analysis" Tableau report
    Then Tableau report opened for "Advertiser Analysis"


  @TableauReporting
  Scenario: 04 Tableau Reporting tab opened for Operations Breakdown
    When Click on "Operations Breakdown" Tableau report
    Then Tableau report opened for "Operations Breakdown"