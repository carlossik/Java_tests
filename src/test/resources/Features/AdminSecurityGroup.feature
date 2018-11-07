@SecurityGroup
Feature: Ability to Edit Security Groups

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Advertiser_Manager_Editor
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Users" from home page
    Then Users page shown correctly

  @SecurityGroup
  Scenario: 01  Viewing Advertiser Accounts on the Left table of Security
    When I click on Security Groups tab
    Then Able to navigate to Administration Security Groups
    When Search for a Secuity group
    Then Users column shown in the grid and it is numeric
    When Clicked on the Users number
    Then Popup shown with Users who have access to group
    When Search for a key "man" on the Users list
    Then Users list filtered based on Search Key "man"
    And LogOut ProteusWeb from Reports Page

  @SecurityGroup
  Scenario: 02 Add Assigned Advertiser Account counter
    When I click on Security Groups tab
    Then Able to navigate to Administration Security Groups
    When Search for a Secuity group
    When Open Edit Security Group screen for one of the groups
    Then Unassigned Advertiser Accounts table shown
    And Assigned Advertiser Accounts table shown
    And Count to identify how many Advertiser Accounts are currently assigned is shown
    And Advertiser,Agency and Operational Unit columns displayed on the table
    And Option search advertiser exist on unassigned account table
    When Search for a assigned advertiser "art"
    Then Assigned advertiser list filtered based on search key "art"
    Then I am able to clear this filter
    And the table will go back to listing all Advertiser Accounts assigned

  @SecurityGroup
  Scenario: 03 Assign Advertiser Account to a Security Group
    When I click on Security Groups tab
    Then Able to navigate to Administration Security Groups
    When Open Add Security Group screen
    And Enter the Security Group name
    And Search in the Advertiser search field  "auto"
    Then There is a add button next to the Advertiser Account row
    When I select add button next to the Advertiser Account row
    And I select add button next to the Advertiser Account row
    Then the Advertiser Account moves to the right side table 'Assigned Advertiser Accounts'
    And there is a minus button next to the advertiser account row
    When I select the minus button
    Then the advertiser account is removed
    When I click on save button after editing advertiser account details
    Then Changes to Advertiser account details are saved


  @SecurityGroup
  Scenario: 04 Pagination and scroll on tables
    When I click on Security Groups tab
    Then Able to navigate to Administration Security Groups
    And  Pagination shown at the bottom of the page


