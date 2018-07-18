$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/repoProteusWebJava/./src/test/java/Features/ExpandFlightInformation.feature");
formatter.feature({
  "line": 2,
  "name": "Proteus web Flight Information",
  "description": "",
  "id": "proteus-web-flight-information",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FlightInformation"
    }
  ]
});
formatter.before({
  "duration": 497813974,
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
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 3653972,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 33707,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4108276860,
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
  "duration": 5338002630,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 42613315,
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
  "duration": 3107016914,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 235640219,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "01 Goal, Viewability, DSP, Ad Server and Discrepancy Details displayed on Proteus Web",
  "description": "",
  "id": "proteus-web-flight-information;01-goal,-viewability,-dsp,-ad-server-and-discrepancy-details-displayed-on-proteus-web",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@FlightInformation"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I search/filter for a flightName \"IO-6920\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Expand flight details",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Discrepancy Details displayed when flight is expanded",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Discrepancy Details show tooltip",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Primary Goal Details displayed when flight is expanded",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Actual Goal detials show tooltip",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Viewability Details displayed when flight is expanded",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Viewability detials show tooltip",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "DSP Data Details displayed when flight is expanded",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "DSP Data detials show tooltip",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "AdServer Data Details displayed when flight is expanded",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "AdServer detials show tooltip",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "IO-6920",
      "offset": 34
    }
  ],
  "location": "ProteusWebSteps.iSearchFilterForAFlightName(String)"
});
formatter.result({
  "duration": 2595079853,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3214145189,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.expandFlightDetails()"
});
formatter.result({
  "duration": 3156758973,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.discrepancyDetailsDisplayedWhenFlightIsExpanded()"
});
formatter.result({
  "duration": 106642728,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.discrepancyDetailsShowTooltip()"
});
formatter.result({
  "duration": 2107958994,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.primaryGoalDetailsDisplayedWhenFlightIsExpanded()"
});
formatter.result({
  "duration": 114460538,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.actualGoalDetialsShowTooltip()"
});
formatter.result({
  "duration": 2103713662,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.viewabilityDetailsDisplayedWhenFlightIsExpanded()"
});
formatter.result({
  "duration": 138456688,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.viewabilityDetialsShowTooltip()"
});
formatter.result({
  "duration": 2121413068,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.dspDataDetailsDisplayedWhenFlightIsExpanded()"
});
formatter.result({
  "duration": 156740199,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.dspDataDetialsShowTooltip()"
});
formatter.result({
  "duration": 2108570834,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.adserverDataDetailsDisplayedWhenFlightIsExpanded()"
});
formatter.result({
  "duration": 141644740,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.adserverDetialsShowTooltip()"
});
formatter.result({
  "duration": 2095378306,
  "status": "passed"
});
formatter.after({
  "duration": 1895098499,
  "status": "passed"
});
});