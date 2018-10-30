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
