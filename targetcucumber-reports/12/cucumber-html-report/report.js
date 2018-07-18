$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/repoProteusWebJava/./src/test/java/Features/ReadOnlyFlightDates.feature");
formatter.feature({
  "line": 2,
  "name": "Flight Start and End Dates shown",
  "description": "",
  "id": "flight-start-and-end-dates-shown",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FlightDates"
    }
  ]
});
formatter.before({
  "duration": 711443750,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 3615998,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 25173,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4129878132,
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
  "duration": 5007507623,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 42472089,
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
  "duration": 3102072703,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "01 There is a box/area to show Start Date and End Date",
  "description": "",
  "id": "flight-start-and-end-dates-shown;01-there-is-a-box/area-to-show-start-date-and-end-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@FlightDates"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I search/filter for result with end date",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Box shown with Start Date and End Date",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "A progress bar shown",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.iSearchResultWithEndDate()"
});
formatter.result({
  "duration": 2061067920,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3184271708,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.boxShownWithStartDateAndEndDate()"
});
formatter.result({
  "duration": 53234324,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.aProgressBarShown()"
});
formatter.result({
  "duration": 26695242,
  "status": "passed"
});
formatter.after({
  "duration": 1682508935,
  "status": "passed"
});
formatter.before({
  "duration": 625153013,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am a Proteus User",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I have the role: Pro Web Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I go to the Proteus Home URL in my browser",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Login as \"ADMINISTRATOR\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The main homepage loads successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on \"Campaigns\" from home page",
  "keyword": "When "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 735146,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 26027,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4099517825,
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
  "duration": 5581859165,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 52034964,
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
  "duration": 3103586089,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "02 There is a box/area to show Start Date Indefinite",
  "description": "",
  "id": "flight-start-and-end-dates-shown;02-there-is-a-box/area-to-show-start-date-indefinite",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@FlightDates"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I search/filter for result without end date",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Box shown with Start Date",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "End date shown as an icon and Tooltip shown",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "A progress bar shown",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.iSearchResultWithOutEndDate()"
});
formatter.result({
  "duration": 990600110,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3243620590,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.boxShownWithStartDate()"
});
formatter.result({
  "duration": 18666659,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.endDateShownAsAnIcon()"
});
formatter.result({
  "duration": 2156094654,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.aProgressBarShown()"
});
formatter.result({
  "duration": 19258018,
  "status": "passed"
});
formatter.after({
  "duration": 1446930583,
  "status": "passed"
});
});