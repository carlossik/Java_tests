@EditGoalData
Feature: Ability to edit flight Goal data in Campaigns

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    And Navigate to "Flights" Tab on Campaigns
    Then All Flights loads which I have access to


 Scenario: 01 No goal set in the Goal Type/Value box
   When I search/filter for a flight with No goal
   Then There is an Add icon in the box orange to inform the user action is required
   And The box states 'Goal Info and Target'


Scenario: 02 Add/Edit goal set in the Goal Type/Value box
  When I search/filter for a flight with No goal
  Then There is an Add icon in the box orange to inform the user action is required
  When Click on Add 'Goal Info and Target'
  Then Option to select Goal Type and Goal Value exist
    #Goal Type (dropdown)
    #Goal Value (depending on goal type, value could be percentage/numeric/cost)
  When Select Goal Type, Goal Value and Save
  Then Selected Goal Type and Goal Values saved
  Then There is an edit icon in the box
  When Click to edit Goal Type
  Then Option to select Goal Type and Goal Value exist
    #Goal Type (dropdown)
    #Goal Value (depending on goal type, value could be percentage/numeric/cost)
  When Edit Goal Type, Goal Value and Save
  Then Edited Goal Type and Goal Values saved