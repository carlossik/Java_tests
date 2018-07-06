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
    And Dates are defaults the last two weeks
    And Tooltips shown on mouseover on Delivery Data Range
    When Click on Delivery Data Range - creatives and placements icon
    Then a pop is displayed showing the delivery dates in the correct format
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

  @AdvanceMappings
  Scenario: 03 Save - Completed Mappings
    When Navigate to Manage Advanced Mappings
    Then Manage Advanced Mappings screen shown
    When I view the Unmapped DSP Creatives Table
    Then I am able to select a creative - click on text data
    And drag the single creative to the Ad server placements list
    Then I am able to drop and link the creative to a placement which does not have any Creative mappings
    And  Advance Mapping Save button and Cancel button displayed
    When Click on Advance Mapping Save button
    Then the Ad server is removed for the 'Missing Mapping' list

  @AdvanceMappings
  Scenario: 04 Cancel - Completed Mappings
    When Navigate to Manage Advanced Mappings
    Then Manage Advanced Mappings screen shown
    When I view the Unmapped DSP Creatives Table
    Then I am able to select a creative - click on text data
    And drag the single creative to the Ad server placements list
    Then I am able to drop and link the creative to a placement which does not have any Creative mappings
    And  Advance Mapping Save button and Cancel button displayed
    When Click on Advance Mapping Cancel button
    Then the Ad server is not removed for the 'Missing Mapping' list

  @AdvanceMappings
  Scenario: 05 DSP Creative Table list name
    When Navigate to Manage Advanced Mappings
    Then Manage Advanced Mappings screen shown
    When I view the Unmapped DSP Creatives Table
    Then Unmapped DSP Creatives table shown on the left hand side
    And there is a counter - number of creatives in the list
    And the following column data is displayed in Unmapped DSP Creatives table
        # Platform (DSP platform name)
        # Creative Name + External ID
        # Impressions (i.e 1,002,987)
        # Clicks (i.e 1,251)
        # Conversions (i.e 20)

  @AdvanceMappings
  Scenario: 06 Ad Server Placement section expansion
    When Navigate to Manage Advanced Mappings
    Then Manage Advanced Mappings screen shown
    When I view the Unmapped DSP Creatives Table
    And there is an Ad Server Placement listed
    And there is an option to expand next to the Ad Server Placement Name
    When I select the expand option next to the Ad Server Placement Name
    Then a section loads to display any DSP creatives which are mapped to the Ad Server Placement
    And i can see the following data next to each Creative and is in line for the Ad server Placement data
      #Impressions
      #Clicks
      #Conversions

  Scenario: 07 Ability to filter by Platform on the Advanced Mapping Screen
    When Navigate to Manage Advanced Mappings
    Then Manage Advanced Mappings screen shown
    When I view the Unmapped DSP Creatives Table
    Then there is an option to filter mappings based on platforms
    And platforms dropdown default to ALL platforms
    And Able to select a platform from the dropdown