@Pixels
Feature: Pixels for flights and Advertisers

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

  @Pixels
  Scenario: 01 View Pixels via toolbar icon
    Then There is a Pixels Icon on the left hand tool bar
    When Click on Pixels icon
    Then Pixels screen opened
    And Pixels are listed
    And Advertiser Account is labelled as the title of the Page
    And Change button shown on the pixel page


  @Pixels
  Scenario: 02 Able to change the Advertiser Account on Pixels screen
    When Click on Pixels icon
    Then Pixels screen opened
    When Click on Pixel Change button
    Then Option to change pixel advertiser account exist
    When I change the pixel advertiser and save
    Then New advertiser details shown on the pixel page
    When Click on Pixel Change button
    And I don't change the pixel advertiser and save
    Then Advertiser details shown on the pixel page


  @Pixels
  Scenario: 03 Add new icons on left hand tool bar, icon on each flight and tooltip
    Then All Flights matching search/filter combination load as results
    And Pixels option shown on the Campaigns tab
    And  There is an icons for Pixels
    And  Tooltips shown on mouseover on each Pixels icon

  @Pixels
  Scenario: 04 Able to open pixels tab from flights
    Then All Flights matching search/filter combination load as results
    And Pixels option shown on the Campaigns tab
    When I click on the pixels icon on flight row
    Then Pixels screen opened
    And Pixels are listed for the Advertiser Account of the Flight selected
    And Flights Advertiser Account is automatically applied on the Advertiser Account
    And Change button shown on the pixel page


  @Pixels
  Scenario: 05 Able to change the Advertiser Account on Pixel screen
    When I click on the pixels icon on flight row
    Then Pixels screen opened
    When Click on Pixel Change button
    Then Option to change pixel advertiser account exist
    When I change the pixel advertiser and save
    Then New advertiser details shown on the pixel page
    When Click on Pixel Change button
    And I don't change the pixel advertiser and save
    Then Advertiser details shown on the pixel page


  @Pixels
  Scenario: 06 Pixel screen columns for advertiser
    When I click on the pixels icon on flight row
    Then Pixels screen opened
    When I change the pixel advertiser to "QAAutomationAdvertiser 1 GB" and save
    And  The following column shown in pixel grid
      #Platform/Seat Name (text i..e AppNexus-PBU-UK)
      #Pixel Name (text)
      #External ID (text)
      #Category (text)
      #Type (text)

  @Pixels
  Scenario: 07 Missing values for pixels
    When I click on the pixels icon on flight row
    Then Pixels screen opened
    When I change the pixel advertiser to "QAAutomationAdvertiser 1 GB" and save
    And There is an action icon on the screen indicating the missing values
    #And Tooltips shown on mouseover on each missing icon


  @Pixels
  Scenario Outline: 08  Sort columns

    When I click on the pixels icon on flight row
    Then Pixels screen opened
    When Clicked on the header "<Header>"
    Then Rows are sorted based on "<Header>"
    Examples:
      | Header    |
      |Platform   |
      |Pixel Name |
      |External ID|
      |Category   |
      |Type       |

  @Pixels
  Scenario: 09 Pagination on screen when pixels list loads
    When I click on the pixels icon on flight row
    Then the Pixels list of results is defaulted to 'Missing Classification'
    And Dropdown to filter based on Platforms exist and defaulted to ALL
    And Pixels screen opened
    And Pagination shown at the bottom of the page
    And Option to enter search key exist
    When I entered search key
    Then Clear Filters button enabled

  @Pixels
  Scenario Outline: 10 Search for the pixels
    When I click on the pixels icon on flight row
    Then Pixels screen opened
    When Enter a search key "<SearchKey>"and click on Apply
    Then Pixels filtered based on the "<SearchKey>"
    Examples:
      | SearchKey |
      |Autogen    |
      |837828     |
      |g4zbkad    |

  @Pixels
  Scenario: 11 Bulk Edit - read only and editable columns
    When I click on the pixels icon on flight row
    Then Pixels screen opened
    And  Pixel bulk edit button shown on pixel tab
    And  Tooltips shown on mouseover on Bulk edit button
    When Click on pixel bulk edit
    Then Pixel grid changed to editable state
    And Save button shown and is disabled
    And Cancel button shown and is enabled
    And Editable columns shown on pixel grid
    And ReadOnly columns shown on pixel grid

  @Pixels
  Scenario: 12 Ability to edit and save pixel classification
    When I click on the pixels icon on flight row
    Then Pixels screen opened
    When Click on pixel bulk edit
    Then Dropdown list with categories, Hard and Soft
    And Dropdown list with Types: Homepage, Confirmation Page, Landing Page
    When Bulk edit Category and Type
    Then Save button Enabled
    When Click on Save
    Then Pixel details saved

  @Pixels
  Scenario: 13 Missing values for pixels
    When I click on the pixels icon on flight row
    And I change the pixel advertiser to "QAAutomationAdvertiser 1 GB" and save
    Then Pixels screen opened
    When I click on the add icon
    Then Dropdown list with categories, Hard and Soft
    And Dropdown list with Types: Homepage, Confirmation Page, Landing Page


  @Pixels
  Scenario: 14 Deeplink Pixel Name
    When I click on the pixels icon on flight row
    And I change the pixel advertiser to "TestBrand GB" and save
    Then Pixels screen opened
    And The Pixels Name is a deeplink
    When Click on the Pixel Name
    Then DSP tab opened in the browser for the Advertiser