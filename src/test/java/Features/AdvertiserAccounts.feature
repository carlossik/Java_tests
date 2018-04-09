@AdvertiserAccounts
Feature: Ability to Edit Advertiser Account settings

Background:
  Given I am a Proteus User
  And I have the role: Pro Web Advertiser_Manager_Editor
  And I go to the Proteus Home URL in my browser
  When Login as "ADMINISTRATOR"
  Then The main homepage loads successfully
  When I click on "Administration" from home page
  Then Administration page shown correctly

@AdvertiserAccounts
Scenario: 01 Check if Advertiser Accounts tab opened correctly
 Then Able to navigate to Administration Advertiser Accounts
 And LogOut ProteusWeb from Reports Page

@AdvertiserAccounts
Scenario: 02 Access and View Advertiser Account Overview
  Then Able to navigate to Administration Advertiser Accounts
  When I select a First Advertiser Account
  Then Advertiser Account Overview screen shown
  And LogOut ProteusWeb from Admin Page

@AdvertiserAccounts
Scenario: 03 Able to search for Advertiser Account
  Then Able to navigate to Administration Advertiser Accounts
  When Search for a Advertiser Name "QA Advertiser 453"
  Then Advertisers filtered as per search key "QA Advertiser 453"

@AdvertiserAccounts
Scenario: 04 Able to see Advertiser Account Overview screen information
  Then Able to navigate to Administration Advertiser Accounts
  When Search for a Advertiser Name "QA Advertiser 453"
  Then Advertisers filtered as per search key "QA Advertiser 453"
  When I select a First Advertiser Account
  Then Advertiser Account details displayed on the page
  And LogOut ProteusWeb from Admin Page

@AdvertiserAccounts
Scenario: 05 Able to edit Advertiser Account details
  Then Able to navigate to Administration Advertiser Accounts
  When Search for an Advertiser to EditName
  When I select a First Advertiser Account
  When Click on edit icon to change advertiser information
  #And Update Advertiser, Agency Name and save the details
  #When Search for Advertiser before edit name
  #Then No Advertisers returned
  #When Search for Advertiser with updated name
  #Then Advertisers filtered as per search key "EditedAdvertiser"
  #And LogOut ProteusWeb from Admin Page

@AdvertiserAccounts
Scenario: 06 Option to Merge advertiser account into another
  Then Able to navigate to Administration Advertiser Accounts
  When Search for a Advertiser Name "QA Advertiser 453"
  Then Advertisers filtered as per search key "QA Advertiser 453"
  When I select a First Advertiser Account
  Then Option to Merge advertiser account into another exist
  And LogOut ProteusWeb from Admin Page

@AdvertiserAccounts
Scenario: 07 Option to Merge advertiser account into another
  Then Able to navigate to Administration Advertiser Accounts
  When Search for a Advertiser Name "QA Advertiser 453"
  Then Advertisers filtered as per search key "QA Advertiser 453"
  When I select a First Advertiser Account
  When Click on Merge Into Another Advertiser Account
  Then Option to select Advertiser and confirm merge message shown
  And LogOut ProteusWeb from Admin Page

@AdvertiserAccounts
Scenario: 08 Advertiser Platform Details shown on the Advertiser details page
  Then Able to navigate to Administration Advertiser Accounts
  When Search for a Advertiser Name "PHARMA - MAINTAIN"
  Then Advertisers filtered as per search key "PHARMA - MAINTAIN"
  When I select a First Advertiser Account
  Then Advertiser Platform details shown
  Then Tooltip with Platform Name and Platform External ID shown on mouseover on icon
  Then Advertiser Platforms tab opened on clicking Platform icon
  And LogOut ProteusWeb from Admin Page


  @AdvertiserAccounts
  Scenario: 09 Merge advertiser account into another
    Then Able to navigate to Administration Advertiser Accounts
    When Search for an Advertiser to Merge
    And I select a First Advertiser Account
    And Click on Merge Into Another Advertiser Account
    And Select the Advertiser to be merged and Save
    Then Second Advertiser details page shown
    When Search for Advertiser one merged
    Then No Advertisers returned
    When Search for Advertiser two merged
    Then Advertisers filtered as per search key "MergedAdvertiser"
    And LogOut ProteusWeb from Admin Page

  @AdvertiserAccounts
  Scenario: 10 Cancel Merge advertiser account into another
    Then Able to navigate to Administration Advertiser Accounts
    When Search for an Advertiser to Merge
    And I select a First Advertiser Account
    And Click on Merge Into Another Advertiser Account
    And Select the Advertiser to be merged and Cancel
    Then First Advertiser details page shown
    When Search for Advertiser one merged
    Then Advertisers filtered as per search key "MergedAdvertiser"
    When Search for Advertiser two merged
    Then Advertisers filtered as per search key "AdvertiserMerged"
    And LogOut ProteusWeb from Admin Page