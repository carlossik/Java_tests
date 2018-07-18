$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/repoProteusWebJava/./src/test/java/Features/OptionToEditSeatsStorageConfig.feature");
formatter.feature({
  "line": 2,
  "name": "Ability to Edit Advertiser Account settings",
  "description": "",
  "id": "ability-to-edit-advertiser-account-settings",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SeatStorageConfig"
    }
  ]
});
formatter.before({
  "duration": 510751782,
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
  "name": "I have the role: Pro Web Advertiser_Manager_Editor",
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
  "name": "I click on \"Administration\" from home page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Administration page shown correctly",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click on \"SEATS\" on Administration Tab",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Seats page shown correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "ProteusWebSteps.GivenIAmAProteusUser()"
});
formatter.result({
  "duration": 4231679,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebAdvertiserManagerEditor()"
});
formatter.result({
  "duration": 57600,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 3990255365,
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
  "duration": 4983567367,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 41361049,
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
  "duration": 3100453504,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.administrationPageShownCorrectly()"
});
formatter.result({
  "duration": 128733385,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "01 Creating a new Seat Storage Config setting the Data Format",
  "description": "",
  "id": "ability-to-edit-advertiser-account-settings;01-creating-a-new-seat-storage-config-setting-the-data-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@SeatStorageConfig"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Search and select seat \"DBM TEST ACCOUNT (LIVE)\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Seat details page shown",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click on \"MANAGE CREDENTIALS\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Credentials page shown",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Select the credential \"DBM TEST ACCOUNT (LIVE)\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Option to add Storage Location",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I clicked on the Storage Locations \"add\" button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Default Values selected on add storage location popup",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Mandatory options shown on the popup",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 1924660512,
  "status": "passed"
});
});