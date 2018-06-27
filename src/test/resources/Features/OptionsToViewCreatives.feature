@Creatives
Feature: Creatives for flights and Advertisers

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

 @Creatives
 Scenario: 01 Add new icons on left hand tool bar, icon on each flight and tooltip
    Then All Flights matching search/filter combination load as results
    And Creatives option shown on the Campaigns tab
    And  There is an icons for Creatives
    And  Tooltips shown on mouseover on each Creatives icon

 @Creatives
 Scenario: 02 Able to open creatives tab from flights
    Then All Flights matching search/filter combination load as results
    And Creatives option shown on the Campaigns tab
    When I click on the creatives icon on flight row
    Then Creatives screen opened
    And Creatives are listed for the Advertiser Account of the Flight selected
    And Flights Advertiser Account is automatically applied on the Advertiser Account Name
    And Change button shown on the creative page

 @Creatives
 Scenario: 03 Able to change the Advertiser Account on Creatives screen
      When I click on the creatives icon on flight row
      Then Creatives screen opened
      When Click on Change button
      Then Option to change advertiser account exist
      When I change the advertiser and save
      Then New advertiser details shown on the creatives page

 @Creatives
 Scenario: 04 Tag icon on creatives screen
      When I click on the creatives icon on flight row
      Then Creatives screen opened
      And There is a tag icon on the right hand side of the creative row
      And Tooltips shown on mouseover on tag icon 'View creative tag and image'
      When Click on the tag icon
      Then Pop up shown with the creative name and options
      And Able to copy the creative tag script
      And Unable to edit the creative tag script

  @Creatives
  Scenario: 05 Creatives screen columns for advertiser with ad server mapped
    When I click on the creatives icon on flight row
    Then Creatives screen opened
    And  The following column for advertiser with ad server mapped

  @Creatives
  Scenario: 06 Creatives screen columns for advertiser without ad server mapped
    When I click on the creatives icon on flight row
    Then Creatives screen opened
    When I change the advertiser "TestBrand GB" and save
    Then  The following column for advertiser without ad server mapped

  @Creatives
  Scenario: 07 Bulk Edit - read only and editable columns
    When I click on the creatives icon on flight row
    Then Creatives screen opened
    And  Creatives bulk edit button shown on Creatives tab
    And  Tooltips shown on mouseover on Creative Bulk edit button
    When Click on Creatives bulk edit
    Then Creatives grid changed to editable state
    And Save button shown and is disabled
    And Cancel button shown and is enabled
    And Editable columns shown on Creatives grid
    And ReadOnly columns shown on Creatives grid

  @Creatives
  Scenario: 08 Missing values for Creatives
    When I click on the creatives icon on flight row
    And I change the advertiser "TRAVEL - LUXURY" and save
    Then Creatives screen opened
    When I click on the creatives add icon
    Then Dropdown list with AD Server Placements for each Creative
    And Dropdown lists for Classification and Classification Type exist for each Creative

  @Creatives
  Scenario: 09 Ability to edit and save Creatives classification
    When I click on the creatives icon on flight row
    Then Creatives screen opened
    When Click on Creatives bulk edit
    Then Dropdown list with AD Server Placements for each Creative
    And Dropdown lists for Classification and Classification Type exist for each Creative
    When Bulk edit AD Server Placements and Classification
    Then Save button Enabled on Creatives tab
    When Click on Save
    Then Creatives details saved

  @Creatives
  Scenario: 10 Deeplink Creatives Name
    When I click on the creatives icon on flight row
    And I change the advertiser "TestBrand GB" and save
    Then Creatives screen opened
    And The Creative Name is a deeplink
    When Click on the Creative Name
    Then DSP tab opened in the browser for the Advertiser