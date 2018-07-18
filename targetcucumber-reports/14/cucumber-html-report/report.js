$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/repoProteusWebJava/./src/test/java/Features/ReportingAPIvsProteusWeb.feature");
formatter.feature({
  "line": 2,
  "name": "Reporting API Vs Proteus web",
  "description": "",
  "id": "reporting-api-vs-proteus-web",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ReportingAPIvsProteusWeb"
    }
  ]
});
formatter.scenarioOutline({
  "line": 15,
  "name": "01 ReportingAPI figures match Proteus Web",
  "description": "",
  "id": "reporting-api-vs-proteus-web;01-reportingapi-figures-match-proteus-web",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@ReportingAPIvsProteusWeb"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I search/filter for a flight \"\u003cFlightId\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I get numbers from reporting API for flight \"\u003cFlightId\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Numbers displayed match the reporting API for flight \"\u003cFlightId\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "reporting-api-vs-proteus-web;01-reportingapi-figures-match-proteus-web;",
  "rows": [
    {
      "cells": [
        "FlightId"
      ],
      "line": 22,
      "id": "reporting-api-vs-proteus-web;01-reportingapi-figures-match-proteus-web;;1"
    },
    {
      "cells": [
        "4573"
      ],
      "line": 23,
      "id": "reporting-api-vs-proteus-web;01-reportingapi-figures-match-proteus-web;;2"
    },
    {
      "cells": [
        "454"
      ],
      "line": 24,
      "id": "reporting-api-vs-proteus-web;01-reportingapi-figures-match-proteus-web;;3"
    },
    {
      "cells": [
        "808"
      ],
      "line": 25,
      "id": "reporting-api-vs-proteus-web;01-reportingapi-figures-match-proteus-web;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 487605978,
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
  "duration": 3745705,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 37120,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4008552103,
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
  "duration": 5000791039,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 48438593,
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
  "duration": 3107269074,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 198860715,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "01 ReportingAPI figures match Proteus Web",
  "description": "",
  "id": "reporting-api-vs-proteus-web;01-reportingapi-figures-match-proteus-web;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ReportingAPIvsProteusWeb"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I search/filter for a flight \"4573\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I get numbers from reporting API for flight \"4573\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Numbers displayed match the reporting API for flight \"4573\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "4573",
      "offset": 30
    }
  ],
  "location": "ProteusWebSteps.iSearchFilterForAFlight(String)"
});
formatter.result({
  "duration": 2886138502,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3214064548,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4573",
      "offset": 45
    }
  ],
  "location": "ProteusWebSteps.iGetNumbersFromReportingAPIForFlight(int)"
});
formatter.result({
  "duration": 3251471253,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4573",
      "offset": 54
    }
  ],
  "location": "ProteusWebSteps.numbersDisplayedMatchTheReportingAPIForFlight(String)"
});
formatter.result({
  "duration": 3261497488,
  "status": "passed"
});
formatter.after({
  "duration": 1320512717,
  "status": "passed"
});
formatter.before({
  "duration": 899953109,
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
  "duration": 872106,
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
  "duration": 3960753084,
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
  "duration": 5018246392,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 42850542,
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
  "duration": 3120345548,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 360214886,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "01 ReportingAPI figures match Proteus Web",
  "description": "",
  "id": "reporting-api-vs-proteus-web;01-reportingapi-figures-match-proteus-web;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ReportingAPIvsProteusWeb"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I search/filter for a flight \"454\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I get numbers from reporting API for flight \"454\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Numbers displayed match the reporting API for flight \"454\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "454",
      "offset": 30
    }
  ],
  "location": "ProteusWebSteps.iSearchFilterForAFlight(String)"
});
formatter.result({
  "duration": 2719834999,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3219871053,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "454",
      "offset": 45
    }
  ],
  "location": "ProteusWebSteps.iGetNumbersFromReportingAPIForFlight(int)"
});
formatter.result({
  "duration": 734659953,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "454",
      "offset": 54
    }
  ],
  "location": "ProteusWebSteps.numbersDisplayedMatchTheReportingAPIForFlight(String)"
});
formatter.result({
  "duration": 3242718189,
  "status": "passed"
});
formatter.after({
  "duration": 1254144318,
  "status": "passed"
});
formatter.before({
  "duration": 713541242,
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
  "duration": 747520,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 27734,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4047323287,
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
  "duration": 4981738248,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 42658542,
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
  "duration": 3115126564,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 257344743,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "01 ReportingAPI figures match Proteus Web",
  "description": "",
  "id": "reporting-api-vs-proteus-web;01-reportingapi-figures-match-proteus-web;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ReportingAPIvsProteusWeb"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I search/filter for a flight \"808\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I get numbers from reporting API for flight \"808\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Numbers displayed match the reporting API for flight \"808\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "808",
      "offset": 30
    }
  ],
  "location": "ProteusWebSteps.iSearchFilterForAFlight(String)"
});
formatter.result({
  "duration": 2731960434,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3215376548,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "808",
      "offset": 45
    }
  ],
  "location": "ProteusWebSteps.iGetNumbersFromReportingAPIForFlight(int)"
});
formatter.result({
  "duration": 284627078,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "808",
      "offset": 54
    }
  ],
  "location": "ProteusWebSteps.numbersDisplayedMatchTheReportingAPIForFlight(String)"
});
formatter.result({
  "duration": 3238812058,
  "status": "passed"
});
formatter.after({
  "duration": 1246185708,
  "status": "passed"
});
});