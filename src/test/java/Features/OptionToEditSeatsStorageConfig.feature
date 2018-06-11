@SeatStorageConfig
Feature: Ability to Edit Seat Storage Configuration
  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Advertiser_Manager_Editor
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Administration" from home page
    Then Administration page shown correctly
    When I click on "SEATS" on Administration Tab
    Then Seats page shown correctly

  @SeatStorageConfig
  Scenario: 01 Creating a new Seat Storage Config setting the Data Format
    When Search and select seat "DBM TEST ACCOUNT (LIVE)"
    Then Seat details page shown
    When Click on MANAGE CREDENTIALS
    Then Credentials page shown
    When Select the credential "DBM TEST ACCOUNT (LIVE)"
    Then Option to add Storage Location
    When I clicked on the Storage Locations Add button
    Then Default Values selected on add storage location popup
    And Mandatory options shown on the popup
    When Enter seat storage details and save
    Then New seat storage details saved