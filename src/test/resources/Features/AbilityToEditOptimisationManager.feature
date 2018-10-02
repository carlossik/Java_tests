@EditOptimisationManager
Feature: Ability to add/edit Optimisation Manager

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to

  @EditOptimisationManager
  Scenario: 01 Add/Edit Optimisation Manager details to flight
    When I search/filter for a flight with no Optimisation Manager
    And Click on Apply button
    Then There is an Add icon in the box orange to inform the user action is required
    When Click on Add 'Goal Info and Target'
    And Option to edit Optimisation Manager exist
    When Select one of Optimisation Manager and Save
    Then Optimisation Manager saved
    When Edit Optimisation Manager and Save
    Then Edited Optimisation Manager saved



