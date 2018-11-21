@ProteusWebRegression
Feature: Regression on Reports,Client Reports,Administration tabs

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser

  @ProteusWebRegression
  Scenario: 01 All four sections shown on the proteus home page
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    And There is a box called "Campaigns"
    And There is a box called "Reports"
    And There is a box called "Vendors"
    And There is a box called "Organisations"
    And There is a box called "Users"
    And LogOut ProteusWeb from Home Page


  @ProteusWebRegression
  Scenario: 03 Check if Admin tab opened correctly
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Vendors" from home page
    Then Administration page shown correctly
    And Able to filter seats by Operation Unit TEL
    And Able to navigate to Administration Jobs
    And Able to navigate to Administration Master Data
    And LogOut ProteusWeb from Admin Page

  Scenario: 04 Check if Client Reports tab opened correctly
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Client Reports" from home page
    Then Client Reports page shown correctly
    And Able to navigate to Client Reports Dashboard
    And Able to navigate to Client Reports Performance
    And Able to navigate to Client Reports DSP
    And Able to navigate to Client Reports Tactics
    And LogOut ProteusWeb from Client Reports Page