$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/repoProteusWebJava/./src/test/java/Features/AbilityToDeeplinkTableauReports.feature");
formatter.feature({
  "line": 2,
  "name": "Ability to deep-link to Tableau reports",
  "description": "",
  "id": "ability-to-deep-link-to-tableau-reports",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TableauReporting"
    }
  ]
});
formatter.before({
  "duration": 616991737,
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
formatter.step({
  "line": 11,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 5108051,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 71680,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4600874411,
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
  "duration": 5039872410,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 42198169,
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
  "duration": 3113086245,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 291794222,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2849839851,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3220005453,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "01 Reporting Icon at Flight Level",
  "description": "",
  "id": "ability-to-deep-link-to-tableau-reports;01-reporting-icon-at-flight-level",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@TableauReporting"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "All Flights matching search/filter combination load as results",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "There is a reporting chart icon to the right hand side of the Flight",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsMatchingSearchFilterCombinationLoadAsResults()"
});
formatter.result({
  "duration": 15229434,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.thereIsAReportingChartIconToTheRightHandSideOfTheFlight()"
});
formatter.result({
  "duration": 25890123,
  "status": "passed"
});
formatter.after({
  "duration": 1522750497,
  "status": "passed"
});
formatter.before({
  "duration": 811029413,
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
formatter.step({
  "line": 11,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 1550079,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 145493,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4558849042,
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
  "duration": 4999918080,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 52398058,
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
  "duration": 3102850943,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 339956335,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2708604711,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3215394468,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "02 Reporting tooltip on Icon",
  "description": "",
  "id": "ability-to-deep-link-to-tableau-reports;02-reporting-tooltip-on-icon",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@TableauReporting"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Tooltip \u0027Click to go to reports\u0027 shown on mouseover",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "There are two links in the pop up for the following core reports:",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.tooltipClickToGoToReportsShownOnMouseover()"
});
formatter.result({
  "duration": 2122094454,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.thereAreTwoLinksInThePopUpForTheFollowingCoreReports()"
});
formatter.result({
  "duration": 1204651432,
  "status": "passed"
});
formatter.after({
  "duration": 1229871689,
  "status": "passed"
});
formatter.before({
  "duration": 633626183,
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
formatter.step({
  "line": 11,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 1810346,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 55894,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4493120216,
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
  "duration": 5053682751,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 50703339,
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
  "duration": 3114546297,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 322841889,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2784428039,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3261105809,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 24,
      "value": "#Advertiser Analysis"
    },
    {
      "line": 25,
      "value": "#Operations Breakdown"
    }
  ],
  "line": 28,
  "name": "03 Tableau Reporting tab opened for Data Explorer",
  "description": "",
  "id": "ability-to-deep-link-to-tableau-reports;03-tableau-reporting-tab-opened-for-data-explorer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@TableauReporting"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "Click on \"Data Explorer\" Tableau report",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Tableau report opened for \"DataExplorer\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Data Explorer",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.clickOnTableauReport(String)"
});
formatter.result({
  "duration": 4264764474,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DataExplorer",
      "offset": 27
    }
  ],
  "location": "ProteusWebSteps.tableauReportOpenedFor(String)"
});
formatter.result({
  "duration": 1263642341,
  "status": "passed"
});
formatter.after({
  "duration": 1256553277,
  "status": "passed"
});
formatter.before({
  "duration": 615779151,
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
formatter.step({
  "line": 11,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 2435413,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 59307,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4113767632,
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
  "duration": 5015040420,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 46852673,
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
  "duration": 3125146827,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 209350738,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2769512631,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3212261883,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "04 Tableau Reporting tab opened for Operations Breakdown",
  "description": "",
  "id": "ability-to-deep-link-to-tableau-reports;04-tableau-reporting-tab-opened-for-operations-breakdown",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@TableauReporting"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "Click on \"Operations Breakdown\" Tableau report",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Tableau report opened for \"OperationsBreakdown\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Operations Breakdown",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.clickOnTableauReport(String)"
});
formatter.result({
  "duration": 4269983031,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "OperationsBreakdown",
      "offset": 27
    }
  ],
  "location": "ProteusWebSteps.tableauReportOpenedFor(String)"
});
formatter.result({
  "duration": 1309939068,
  "status": "passed"
});
formatter.after({
  "duration": 1271644471,
  "status": "passed"
});
formatter.before({
  "duration": 512547621,
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
formatter.step({
  "line": 11,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 1467306,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 46933,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4078270687,
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
  "duration": 5017154553,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 51386431,
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
  "duration": 3111557072,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 341622467,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2778567775,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3254635411,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "05 Reporting Icon at Operation Unit",
  "description": "",
  "id": "ability-to-deep-link-to-tableau-reports;05-reporting-icon-at-operation-unit",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@TableauReporting"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "There is a Operation Unit Level reporting chart icon to the right hand side of the Flight count",
  "keyword": "Then "
});
formatter.match({
  "location": "ProteusWebSteps.thereIsAOperationUnitLevelReportingChartIconToTheRightHandSideOfTheFlight()"
});
formatter.result({
  "duration": 36127558,
  "status": "passed"
});
formatter.after({
  "duration": 1244669762,
  "status": "passed"
});
formatter.before({
  "duration": 701213994,
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
formatter.step({
  "line": 11,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 1373439,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 55466,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4050105152,
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
  "duration": 4976351583,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 41914862,
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
  "duration": 3116462457,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 217808974,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2719462093,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3212368549,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "06 Operation Unit Level Reporting tooltip on Icon",
  "description": "",
  "id": "ability-to-deep-link-to-tableau-reports;06-operation-unit-level-reporting-tooltip-on-icon",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@TableauReporting"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "Tooltip \u0027Click to go to reports Operational Unit level\u0027 shown on mouseover at Operation Unit icon",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "There are two links in the pop up for the following Operational Unit reports:",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.tooltipClickToGoToReportsOperationalUnitLevelShownOnMouseoverAtOperationUnitIcon()"
});
formatter.result({
  "duration": 2111875366,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.thereAreTwoLinksInThePopUpForTheFollowingOperationalUnitReports()"
});
formatter.result({
  "duration": 1182482269,
  "status": "passed"
});
formatter.after({
  "duration": 1215662415,
  "status": "passed"
});
formatter.before({
  "duration": 517514873,
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
formatter.step({
  "line": 11,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 1423360,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 99413,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4170341474,
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
  "duration": 4998693121,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 42173849,
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
  "duration": 3125182240,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 244117229,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2877446452,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3209434790,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 45,
      "value": "#Management Report"
    },
    {
      "line": 46,
      "value": "#Performance Overview"
    }
  ],
  "line": 49,
  "name": "07 Tableau Reporting tab opened for Management Report",
  "description": "",
  "id": "ability-to-deep-link-to-tableau-reports;07-tableau-reporting-tab-opened-for-management-report",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@TableauReporting"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "Click on \"Management Report\" Operation Unit Tableau report",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "Tableau report opened for \"ManagementReport\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Management Report",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.clickOnOperationUnitTableauReport(String)"
});
formatter.result({
  "duration": 4244218776,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ManagementReport",
      "offset": 27
    }
  ],
  "location": "ProteusWebSteps.tableauReportOpenedFor(String)"
});
formatter.result({
  "duration": 1324999542,
  "status": "passed"
});
formatter.after({
  "duration": 1291890648,
  "status": "passed"
});
formatter.before({
  "duration": 530275614,
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
formatter.step({
  "line": 11,
  "name": "All Flights loads which I have access to",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I search/filter for a particular result",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 1472426,
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
  "duration": 4071301090,
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
  "duration": 5008733436,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 43164569,
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
  "duration": 3108075474,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 227334730,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenISearchFilterForAParticularResult()"
});
formatter.result({
  "duration": 2694161624,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3210099964,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "08 Tableau Reporting tab opened for Performance Overview",
  "description": "",
  "id": "ability-to-deep-link-to-tableau-reports;08-tableau-reporting-tab-opened-for-performance-overview",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 53,
      "name": "@TableauReporting"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "Click on \"Performance Overview\" Operation Unit Tableau report",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "Tableau report opened for \"PerformanceOverview\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Performance Overview",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.clickOnOperationUnitTableauReport(String)"
});
formatter.result({
  "duration": 4256144530,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PerformanceOverview",
      "offset": 27
    }
  ],
  "location": "ProteusWebSteps.tableauReportOpenedFor(String)"
});
formatter.result({
  "duration": 1087400496,
  "status": "passed"
});
formatter.after({
  "duration": 1251283946,
  "status": "passed"
});
});