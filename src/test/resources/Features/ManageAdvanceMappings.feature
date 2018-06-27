@AdvanceMappings
Feature: Manage Advance Mappings feature

  Background:
    Given I am a Proteus User
    And I have the role: Pro Web Campaigns
    And I go to the Proteus Home URL in my browser
    When Login as "ADMINISTRATOR"
    Then The main homepage loads successfully
    When I click on "Campaigns" from home page
    Then All Flights loads which I have access to
    When Navigate to Creatives tab

  @AdvanceMappings
  Scenario: 01 Change delivery date format on on pop up
    When Navigate to Manage Advanced Mappings
    Then Manage Advanced Mappings screen shown
    When Open "From Date" date pop up
    Then Date popup shown with the selected date
    When Open "To Date" date pop up
    Then Date popup shown with the selected date

  @AdvanceMappings
  Scenario: 02 Move DSP Creative to Ad Server Placement
    When Navigate to Manage Advanced Mappings
    Then Manage Advanced Mappings screen shown
    When I view the Unmapped DSP Creatives Table
    Then I am able to select a creative - click on text data
    And drag the single creative to the Ad server placements list
    Then I am able to drop and link the creative to a placement which does not have any Creative mappings
    And drag the single creative to the Ad server placements list
    Then I am able to drop and link the creative to a placement which already has DSP creatives mapped