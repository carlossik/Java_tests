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
  Scenario: 03 Tableau Reporting tab opened for Data Explorer
    When Click on "Data explorer" Tableau report
    Then Tableau report opened for "DataExplorer"

  @TableauReporting
  Scenario: 04 Tableau Reporting tab opened for Operations Breakdown
    When Click on "Operations breakdown" Tableau report
    Then Tableau report opened for "OperationsBreakdown"

  @TableauReporting
  Scenario: 05 Reporting Icon at Operation Unit
    Then  There is a Operation Unit Level reporting chart icon to the right hand side of the Flight count

  @TableauReporting
  Scenario: 06 Operation Unit Level Reporting tooltip on Icon
    Then Tooltip 'Click to go to reports at Operational Unit level' shown on mouseover at Operation Unit icon
    And There are two links in the pop up for the following Operational Unit reports:
       #Management Report
       #Performance Overview

  @TableauReporting
  Scenario: 07 Tableau Reporting tab opened for Management Report
    When Click on "Management Report" Operation Unit Tableau report
    Then Tableau report opened for "ManagementReport"

  @TableauReporting
  Scenario: 08 Tableau Reporting tab opened for Performance Overview
    When Click on "Performance Overview" Operation Unit Tableau report
    Then Tableau report opened for "PerformanceOverview"