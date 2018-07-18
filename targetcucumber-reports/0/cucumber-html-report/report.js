$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/repoProteusWebJava/./src/test/java/Features/AbilityLogInProWeb.feature");
formatter.feature({
  "line": 2,
  "name": "Ability to log into Pro Web",
  "description": "",
  "id": "ability-to-log-into-pro-web",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginProWeb"
    }
  ]
});
formatter.before({
  "duration": 515288100,
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
  "duration": 360286993,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 62294,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 5357404435,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "01 Entering Pro Web",
  "description": "",
  "id": "ability-to-log-into-pro-web;01-entering-pro-web",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@LoginProWeb"
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
  "name": "Log Out button exist",
  "keyword": "And "
});
formatter.step({
  "line": 15,
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
  "duration": 5104132222,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 54838590,
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
  "duration": 51564351,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutButtonExist()"
});
formatter.result({
  "duration": 2257069544,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogoutProteusWeb()"
});
formatter.result({
  "duration": 3220945826,
  "status": "passed"
});
formatter.after({
  "duration": 1593925719,
  "status": "passed"
});
formatter.before({
  "duration": 680980190,
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
  "duration": 2600959,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 71254,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4129908851,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "02 Entering Pro Web with incorrect details",
  "description": "",
  "id": "ability-to-log-into-pro-web;02-entering-pro-web-with-incorrect-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@LoginProWeb"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Login as \"INVALID\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "An error message displayed advising to try again",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "INVALID",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 4872968160,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAnErrorMessageDisplayedAdvisingToTryAgain()"
});
formatter.result({
  "duration": 2077110153,
  "status": "passed"
});
formatter.after({
  "duration": 1230384968,
  "status": "passed"
});
formatter.before({
  "duration": 528106442,
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
  "duration": 2285225,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 63574,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4906972200,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "03 Campaigns page loaded",
  "description": "",
  "id": "ability-to-log-into-pro-web;03-campaigns-page-loaded",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@LoginProWeb"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "The Campaigns page loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
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
  "duration": 5002844586,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 43375342,
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
  "duration": 3108135634,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheCampaignsPageLoadsSuccessfully()"
});
formatter.result({
  "duration": 59804135,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogoutProteusWeb()"
});
formatter.result({
  "duration": 2868861069,
  "status": "passed"
});
formatter.after({
  "duration": 1256668050,
  "status": "passed"
});
formatter.before({
  "duration": 541101849,
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
  "duration": 2096639,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 74240,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4142487833,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "04 Campaigns page loaded with different options",
  "description": "",
  "id": "ability-to-log-into-pro-web;04-campaigns-page-loaded-with-different-options",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@LoginProWeb"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Log out, Back to Home, Flights icon shown on Campaign page",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Creatives option shown on the Campaigns tab",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Pixels option shown on the Campaigns tab",
  "keyword": "And "
});
formatter.step({
  "line": 38,
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
  "duration": 5062243814,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 45076034,
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
  "duration": 3119434616,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutBackToHomeFlightsIconShownOnCampaignPage()"
});
formatter.result({
  "duration": 2604954195,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.creativesOptionShownOnTheCampaignsTab()"
});
formatter.result({
  "duration": 91924441,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.pixelsOptionShownOnTheCampaignsTab()"
});
formatter.result({
  "duration": 60433467,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogoutProteusWeb()"
});
formatter.result({
  "duration": 2459658471,
  "status": "passed"
});
formatter.after({
  "duration": 1236274672,
  "status": "passed"
});
formatter.before({
  "duration": 528820254,
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
  "duration": 1576106,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 98560,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 3995934295,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "05 Navigated to Campaigns when logged in with only Campaign Web role",
  "description": "",
  "id": "ability-to-log-into-pro-web;05-navigated-to-campaigns-when-logged-in-with-only-campaign-web-role",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@LoginProWeb"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "Login as \"CAMPAIGN MANAGEMENT WEB\"",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "Log out, Back to Home, Flights icon shown on Campaign page",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Creatives option not shown on the Campaigns tab",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Pixels option not shown on the Campaigns tab",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "LogOut ProteusWeb from Home Page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "CAMPAIGN MANAGEMENT WEB",
      "offset": 10
    }
  ],
  "location": "ProteusWebSteps.loginAs(String)"
});
formatter.result({
  "duration": 5091236654,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogOutBackToHomeFlightsIconShownOnCampaignPage()"
});
formatter.result({
  "duration": 2981352541,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.creativesOptionNotShownOnTheCampaignsTab()"
});
formatter.result({
  "duration": 20640844,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.pixelsOptionNotShownOnTheCampaignsTab()"
});
formatter.result({
  "duration": 12168528,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenLogoutProteusWeb()"
});
formatter.result({
  "duration": 2574668981,
  "status": "passed"
});
formatter.after({
  "duration": 1245578135,
  "status": "passed"
});
});