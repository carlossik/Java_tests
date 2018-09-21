@AdvertiserAccounts
Feature: New menu options on proteus web

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Advertiser_Manager_Editor
    And I go to the Proteus Home URL in my browser
    When Login as "ADVERTISERMANAGEREDITOR"
    Then The main homepage loads successfully

  Scenario: 01 Able to view Advertiser accounts for  AdvertiserManagerEditor user
     Then There is a box called "Organisations"
     When I click on "Organisations" from home page
     Then Able to navigate to Advertiser Accounts
     When I select a First Advertiser Account
     Then Advertiser Account Overview screen shown

  Scenario: 02 Able to view Security groups for AdvertiserManagerEditor user
    Then There is a box called "Users"
    When I click on "Users" from home page
    And I click on Security Groups tab
    Then Able to navigate to Administration Security Groups
    And All security groups are listed

  Scenario: 03 Able to view Security groups for AdvertiserManagerEditor user
    Then There is a box called "Vendors"
    When I click on "Vendors" from home page
    Then Option to select Seats tab
    And All the existing seats shown
    Then Option to select Jobs tab
    And All the jobs are listed
    Then Option to select Master Data tab
    And All the job schedule templates shown



