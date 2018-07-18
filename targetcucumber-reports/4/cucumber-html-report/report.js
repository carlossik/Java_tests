$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/repoProteusWebJava/./src/test/java/Features/AbilityToSearchForFlights.feature");
formatter.feature({
  "line": 2,
  "name": "Ability to search for Flights",
  "description": "",
  "id": "ability-to-search-for-flights",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.before({
  "duration": 528641481,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 4757758,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 52480,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4129176691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATOR",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 5048488513,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 48420246,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3104621609,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "01 View Flights - initial load",
  "description": "",
  "id": "ability-to-search-for-flights;01-view-flights---initial-load",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "The Campaigns page loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "All Flights loads which I have access to",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "There is a section called \u0027Flights\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "LogOut ProteusWeb from Campaigns page",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheCampaignsPageLoadsSuccessfully()"
});
formatter.result({
  "duration": 476248117,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 20196258,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.thereIsASectionCalledFlights()"
});
formatter.result({
  "duration": 40212463,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutProteusWebFromCampaignsPage()"
});
formatter.result({
  "duration": 2554372031,
  "status": "passed"
});
formatter.after({
  "duration": 1244765335,
  "status": "passed"
});
formatter.before({
  "duration": 760570129,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 1064533,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 41813,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4104389502,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATOR",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 5032591773,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 48665579,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3103399209,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "02 Ability to Search fights by Flight Name or Booking Code",
  "description": "",
  "id": "ability-to-search-for-flights;02-ability-to-search-fights-by-flight-name-or-booking-code",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I can search by Flight Name or Booking Code",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "LogOut ProteusWeb from Campaigns page",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 277421961,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenICanSearchByFlightNameOrBookingCode()"
});
formatter.result({
  "duration": 1434416028,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutProteusWebFromCampaignsPage()"
});
formatter.result({
  "duration": 2860536806,
  "status": "passed"
});
formatter.after({
  "duration": 1233191154,
  "status": "passed"
});
formatter.before({
  "duration": 529482867,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 1041919,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 51627,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4136661702,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATOR",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 5035172251,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 43601901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3108078461,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "03 Ability to Filter fights by Advertiser or Agency",
  "description": "",
  "id": "ability-to-search-for-flights;03-ability-to-filter-fights-by-advertiser-or-agency",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Filter dropdown fields exist",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "LogOut ProteusWeb from Campaigns page",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 235162353,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenFilterDropdownFieldsExist()"
});
formatter.result({
  "duration": 110810406,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutProteusWebFromCampaignsPage()"
});
formatter.result({
  "duration": 2505661224,
  "status": "passed"
});
formatter.after({
  "duration": 1234398193,
  "status": "passed"
});
formatter.before({
  "duration": 768892259,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 1136639,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 47360,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4051629631,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATOR",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 5139971354,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 45966487,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3106654674,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "04 Ability to use search and filter combinations",
  "description": "",
  "id": "ability-to-search-for-flights;04-ability-to-use-search-and-filter-combinations",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "LogOut ProteusWeb from Campaigns page",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 204283646,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutProteusWebFromCampaignsPage()"
});
formatter.result({
  "duration": 2580972552,
  "status": "passed"
});
formatter.after({
  "duration": 1242370030,
  "status": "passed"
});
formatter.before({
  "duration": 513017808,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 1330773,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 45226,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4059809681,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATOR",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 4963106576,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 44010648,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3104986835,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "05 Apply button is enabled after entering/selecting search and filters",
  "description": "",
  "id": "ability-to-search-for-flights;05-apply-button-is-enabled-after-entering/selecting-search-and-filters",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Apply button is enabled",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "LogOut ProteusWeb from Campaigns page",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 236630939,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2960999270,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenApplyButtonIsEnabled()"
});
formatter.result({
  "duration": 44748781,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutProteusWebFromCampaignsPage()"
});
formatter.result({
  "duration": 2790566490,
  "status": "passed"
});
formatter.after({
  "duration": 1244795202,
  "status": "passed"
});
formatter.before({
  "duration": 510549116,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 928853,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 43947,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4138771140,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATOR",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 4968223160,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 43157314,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3106699474,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "06 Clear Filters button is enabled after entering/selecting search and filters",
  "description": "",
  "id": "ability-to-search-for-flights;06-clear-filters-button-is-enabled-after-entering/selecting-search-and-filters",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "Clear Filters button is enabled",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "LogOut ProteusWeb from Campaigns page",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 244567789,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2705351379,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenClearFiltersButtonIsEnabled()"
});
formatter.result({
  "duration": 39944943,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutProteusWebFromCampaignsPage()"
});
formatter.result({
  "duration": 2794169688,
  "status": "passed"
});
formatter.after({
  "duration": 1227269876,
  "status": "passed"
});
formatter.before({
  "duration": 513444048,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 930133,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 32000,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4040574703,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATOR",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 5027284468,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 42594969,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3106719101,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "07 Flights matching Search/Filter Combination loaded as results",
  "description": "",
  "id": "ability-to-search-for-flights;07-flights-matching-search/filter-combination-loaded-as-results",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "All Flights matching search/filter combination load as results",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "There is a section called \u0027Flights\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Each flight title includes Advertiser, Agency, Flight Names and External Booking Reference",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "LogOut ProteusWeb from Campaigns page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 226392650,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2701409407,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3210539430,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsMatchingSearchFilterCombinationLoadAsResults()"
});
formatter.result({
  "duration": 19760631,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.thereIsASectionCalledFlights()"
});
formatter.result({
  "duration": 48928406,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.CheckFlightDetailsShown()"
});
formatter.result({
  "duration": 753553172,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutProteusWebFromCampaignsPage()"
});
formatter.result({
  "duration": 2494216749,
  "status": "passed"
});
formatter.after({
  "duration": 1213308069,
  "status": "passed"
});
formatter.before({
  "duration": 515513380,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 919466,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 46934,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4076017035,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATOR",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 5001072639,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 44513687,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3107603580,
  "status": "passed"
});
formatter.scenario({
  "line": 63,
  "name": "08 Goal Type, Goal Value, Optimisation Manager, Budget, Spend information and Flight Dates",
  "description": "",
  "id": "ability-to-search-for-flights;08-goal-type,-goal-value,-optimisation-manager,-budget,-spend-information-and-flight-dates",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 62,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.step({
  "line": 64,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "All Flights matching search/filter combination load as results",
  "keyword": "Then "
});
formatter.step({
  "line": 68,
  "name": "Goal Type, Goal Value, Optimisation Manager, Budget, Spend information and Flight Dates",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 69,
      "value": "#And  The Currency code for the Flight is displayed next to the Budget"
    }
  ],
  "line": 70,
  "name": "LogOut ProteusWeb from Campaigns page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 244522989,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2872582455,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3210243323,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsMatchingSearchFilterCombinationLoadAsResults()"
});
formatter.result({
  "duration": 20154018,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.goalTypeGoalValueOptimisationManagerBudgetSpendInformationAndFlightDates()"
});
formatter.result({
  "duration": 1291823236,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutProteusWebFromCampaignsPage()"
});
formatter.result({
  "duration": 2502444159,
  "status": "passed"
});
formatter.after({
  "duration": 1227949556,
  "status": "passed"
});
formatter.before({
  "duration": 500641493,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 976213,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 39253,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4092735961,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATOR",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 4997112747,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 43332675,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3106742141,
  "status": "passed"
});
formatter.scenario({
  "line": 73,
  "name": "09 Goal Type, Goal Value, Optimisation Manager are editable",
  "description": "",
  "id": "ability-to-search-for-flights;09-goal-type,-goal-value,-optimisation-manager-are-editable",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 72,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.step({
  "line": 74,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 76,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "All Flights matching search/filter combination load as results",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "Goal Type, Goal Value, Optimisation Manager are editable",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "LogOut ProteusWeb from Campaigns page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 205566205,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2730077982,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3217371214,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsMatchingSearchFilterCombinationLoadAsResults()"
});
formatter.result({
  "duration": 14183247,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.goalTypeGoalValueOptimisationManagerAreEditable()"
});
formatter.result({
  "duration": 30424734,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutProteusWebFromCampaignsPage()"
});
formatter.result({
  "duration": 2475962250,
  "status": "passed"
});
formatter.after({
  "duration": 1237742832,
  "status": "passed"
});
formatter.before({
  "duration": 523252257,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 925439,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 44373,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4006711464,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATOR",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 5067964558,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 42510062,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3105609341,
  "status": "passed"
});
formatter.scenario({
  "line": 83,
  "name": "10 Pagination shown when more than 20 flights displayed",
  "description": "",
  "id": "ability-to-search-for-flights;10-pagination-shown-when-more-than-20-flights-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 82,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.step({
  "line": 84,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 86,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "All Flights matching search/filter combination load as results",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 88,
      "value": "# And Pagination shown when more than 20 flights displayed"
    }
  ],
  "line": 89,
  "name": "LogOut ProteusWeb from Campaigns page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 202759167,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2727026889,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3222912758,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsMatchingSearchFilterCombinationLoadAsResults()"
});
formatter.result({
  "duration": 19066018,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutProteusWebFromCampaignsPage()"
});
formatter.result({
  "duration": 2520653858,
  "status": "passed"
});
formatter.after({
  "duration": 1234476273,
  "status": "passed"
});
formatter.before({
  "duration": 517081379,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 877653,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 41386,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4010768635,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATOR",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 5013306447,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 41288516,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3103205076,
  "status": "passed"
});
formatter.scenario({
  "line": 93,
  "name": "11 No flights matching your search message shown",
  "description": "",
  "id": "ability-to-search-for-flights;11-no-flights-matching-your-search-message-shown",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 92,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.step({
  "line": 94,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 95,
  "name": "I search/filter for a flightName \"AAAAAAAAA\"",
  "keyword": "When "
});
formatter.step({
  "line": 96,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "No flights returned and message displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "LogOut ProteusWeb from Campaigns page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 233242354,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAAAAAAAA",
      "offset": 34
    }
  ],
  "location": "ProteusWebSteps.iSearchFilterForAFlightName(String)"
});
formatter.result({
  "duration": 2698686422,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3228811849,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebAdvertiserSteps.noFlightsReturnedAndMessageDisplayed()"
});
formatter.result({
  "duration": 64245733,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutProteusWebFromCampaignsPage()"
});
formatter.result({
  "duration": 2487227099,
  "status": "passed"
});
formatter.after({
  "duration": 1254059838,
  "status": "passed"
});
formatter.before({
  "duration": 610143739,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 930133,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 66560,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4070934583,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATOR",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 5071316877,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 46478486,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3103333076,
  "status": "passed"
});
formatter.scenario({
  "line": 101,
  "name": "12 Able to search flights based on Campaign Name",
  "description": "",
  "id": "ability-to-search-for-flights;12-able-to-search-flights-based-on-campaign-name",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 100,
      "name": "@SearchOnProWeb"
    }
  ]
});
formatter.step({
  "line": 102,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 103,
  "name": "I search/filter for a Campaign \"LOCAL BRANDING - GAME/COUNTRY\"",
  "keyword": "When "
});
formatter.step({
  "line": 104,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "Campaign details shown for each flight row",
  "keyword": "Then "
});
formatter.step({
  "line": 106,
  "name": "All Flights matching campaign \"LOCAL BRANDING - GAME/COUNTRY\" are filtered",
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "LogOut ProteusWeb from Campaigns page",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 205197139,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LOCAL BRANDING - GAME/COUNTRY",
      "offset": 32
    }
  ],
  "location": "ProteusWebSteps.iSearchFilterForACampaign(String)"
});
formatter.result({
  "duration": 3427111072,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3216069028,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.campaignDetailsShownForEachFlightRow()"
});
formatter.result({
  "duration": 54365844,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LOCAL BRANDING - GAME/COUNTRY",
      "offset": 31
    }
  ],
  "location": "ProteusWebSteps.allFlightsMatchingCampaignAreFiltered(String)"
});
formatter.result({
  "duration": 56769256,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutProteusWebFromCampaignsPage()"
});
formatter.result({
  "duration": 2455492499,
  "status": "passed"
});
formatter.after({
  "duration": 1230130248,
  "status": "passed"
});
});