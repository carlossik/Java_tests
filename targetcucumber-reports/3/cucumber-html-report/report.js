$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/repoProteusWebJava/./src/test/java/Features/AbilityToEditOptimisationManager.feature");
formatter.feature({
  "line": 2,
  "name": "Ability to add/edit Optimisation Manager",
  "description": "",
  "id": "ability-to-add/edit-optimisation-manager",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@EditOptimisationManager"
    }
  ]
});
formatter.before({
  "duration": 499637974,
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
  "duration": 5242025,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 433493,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4075025461,
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
  "duration": 5036682651,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 47487980,
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
  "duration": 3113657125,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 273397643,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "01 Add/Edit Optimisation Manager details to flight",
  "description": "",
  "id": "ability-to-add/edit-optimisation-manager;01-add/edit-optimisation-manager-details-to-flight",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@EditOptimisationManager"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I search/filter for a flight with no Optimisation Manager",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "The box states \u0027Unknown User\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Option to edit Optimisation Manager exist",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Select one of Optimisation Manager and Save",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Optimisation Manager saved",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Edit Optimisation Manager and Save",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Edited Optimisation Manager saved",
  "keyword": "Then "
});
formatter.match({
  "location": "ProteusWebSteps.iSearchFilterForAFlightWithNoOptimisationManager()"
});
formatter.result({
  "duration": 3147999083,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3239912857,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.theBoxStatesUnknownUser()"
});
formatter.result({
  "duration": 61375121,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.optionToEditOptimisationManagerExist()"
});
formatter.result({
  "duration": 49000939,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.selectOneOfOptimisationManagerAndSave()"
});
formatter.result({
  "duration": 3651483882,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.optimisationManagerSaved()"
});
formatter.result({
  "duration": 7128456052,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.editOptimisationManagerAndSave()"
});
formatter.result({
  "duration": 3636299249,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.editedOptimisationManagerSaved()"
});
formatter.result({
  "duration": 7091631748,
  "status": "passed"
});
formatter.after({
  "duration": 1591017988,
  "status": "passed"
});
});