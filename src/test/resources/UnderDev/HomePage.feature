@HomePage
Feature: Proteus home page

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully

  Scenario: 01 Filter options shown on the Home page
      Then Option to filter the rows on the home page

  Scenario: 02 Data grid shown
    Then Datagrid with advertiser and their Clicks and Impressions shown
    When Filter options changed and applied
    Then Datagrid refresh with new values

  Scenario: 03 Cost and Impressions graph shown on home page
    Then option to select Cost or Impressions
    When Select the Impressions button
    Then Graph updated with Impressions
    When Select the Cost button
    Then Graph updated with Cost