$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/repoProteusWebJava/./src/test/java/Features/RegressionOtherModules.feature");
formatter.feature({
  "line": 2,
  "name": "Regression on Reports,Client Reports,Administration tabs",
  "description": "",
  "id": "regression-on-reports,client-reports,administration-tabs",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ProteusWebRegression"
    }
  ]
});
formatter.before({
  "duration": 491910191,
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
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 3364692,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 27733,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4018017699,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "01 All four sections shown on the proteus home page",
  "description": "",
  "id": "regression-on-reports,client-reports,administration-tabs;01-all-four-sections-shown-on-the-proteus-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@ProteusWebRegression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "There is a box called \"Campaigns\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "There is a box called \"Reports\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "There is a box called \"Client Reports\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "There is a box called \"Administration\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "LogOut ProteusWeb from Home Page",
  "keyword": "And "
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
  "duration": 5118582136,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 42499822,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Campaigns",
      "offset": 23
    }
  ],
  "location": "ProteusWebSteps.thereIsABoxCalled(String)"
});
formatter.result({
  "duration": 40333636,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reports",
      "offset": 23
    }
  ],
  "location": "ProteusWebSteps.thereIsABoxCalled(String)"
});
formatter.result({
  "duration": 48679233,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Client Reports",
      "offset": 23
    }
  ],
  "location": "ProteusWebSteps.thereIsABoxCalled(String)"
});
formatter.result({
  "duration": 48846486,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Administration",
      "offset": 23
    }
  ],
  "location": "ProteusWebSteps.thereIsABoxCalled(String)"
});
formatter.result({
  "duration": 40547823,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogoutProteusWeb()"
});
formatter.result({
  "duration": 2444678210,
  "status": "passed"
});
formatter.after({
  "duration": 1273820043,
  "status": "passed"
});
formatter.before({
  "duration": 901722495,
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
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 793599,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 28586,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 3977617930,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "02 Check if Reports tab opened correctly",
  "description": "",
  "id": "regression-on-reports,client-reports,administration-tabs;02-check-if-reports-tab-opened-correctly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@ProteusWebRegression"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I click on \"Reports\" from home page",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Reports page shown correctly",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "LogOut ProteusWeb from Reports Page",
  "keyword": "And "
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
  "duration": 5000049066,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 45305154,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reports",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3102980223,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.reportsPageShownCorrectly()"
});
formatter.result({
  "duration": 1095816493,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.logoutProteusWebFromReportsPage()"
});
formatter.result({
  "duration": 2467646947,
  "status": "passed"
});
formatter.after({
  "duration": 1225144650,
  "status": "passed"
});
formatter.before({
  "duration": 783217586,
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
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 763306,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 31147,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4019757218,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "03 Check if Admin tab opened correctly",
  "description": "",
  "id": "regression-on-reports,client-reports,administration-tabs;03-check-if-admin-tab-opened-correctly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@ProteusWebRegression"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I click on \"Administration\" from home page",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "Administration page shown correctly",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Able to filter seats by Operation Unit TEL",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Able to navigate to Administration Jobs",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Able to navigate to Administration Master Data",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "LogOut ProteusWeb from Admin Page",
  "keyword": "And "
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
  "duration": 4965119161,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 44221848,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Administration",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3110603473,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.administrationPageShownCorrectly()"
});
formatter.result({
  "duration": 124473974,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ableToFilterSeatsByOperationUnitTEL()"
});
formatter.result({
  "duration": 2476402996,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ableToNavigateToAdministrationJobs()"
});
formatter.result({
  "duration": 3129550025,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ableToNavigateToAdministrationMasterData()"
});
formatter.result({
  "duration": 6195358210,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.logoutProteusWebFromAdminPage()"
});
formatter.result({
  "duration": 2467353401,
  "status": "passed"
});
formatter.after({
  "duration": 1232587421,
  "status": "passed"
});
formatter.before({
  "duration": 501328852,
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
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 773120,
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
  "duration": 3996988588,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "04 Check if Client Reports tab opened correctly",
  "description": "",
  "id": "regression-on-reports,client-reports,administration-tabs;04-check-if-client-reports-tab-opened-correctly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "I click on \"Client Reports\" from home page",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "Client Reports page shown correctly",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Able to navigate to Client Reports Dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Able to navigate to Client Reports Performance",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Able to navigate to Client Reports DSP",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Able to navigate to Client Reports Tactics",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "LogOut ProteusWeb from Client Reports Page",
  "keyword": "And "
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
  "duration": 4974557451,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 49956672,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Client Reports",
      "offset": 12
    }
  ],
  "location": "ProteusWebSteps.iClickOnFromHomePage(String)"
});
formatter.result({
  "duration": 3098617985,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.clientReportsPageShownCorrectly()"
});
formatter.result({
  "duration": 4543623875,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ableToNavigateToClientReportsDashboard()"
});
formatter.result({
  "duration": 2161615717,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ableToNavigateToClientReportsPerformance()"
});
formatter.result({
  "duration": 2194835544,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ableToNavigateToClientReportsDSP()"
});
formatter.result({
  "duration": 2149547030,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ableToNavigateToClientReportsTactics()"
});
formatter.result({
  "duration": 2149655830,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.logoutProteusWebFromClientReportsPage()"
});
formatter.result({
  "duration": 2523924683,
  "status": "passed"
});
formatter.after({
  "duration": 1239198618,
  "status": "passed"
});
});