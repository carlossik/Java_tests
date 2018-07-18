$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/repoProteusWebJava/./src/test/java/Features/AbilityToEditGoalData.feature");
formatter.feature({
  "line": 2,
  "name": "Ability to edit flight Goal data in Campaigns",
  "description": "",
  "id": "ability-to-edit-flight-goal-data-in-campaigns",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@EditGoalData"
    }
  ]
});
formatter.before({
  "duration": 491413550,
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
  "duration": 7567783,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIHaveTheRoleProWebCampaigns()"
});
formatter.result({
  "duration": 63146,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.GivenIGoToTheProteusHomeURLInMyBrowser()"
});
formatter.result({
  "duration": 4103600169,
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
  "duration": 5023635190,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 49538966,
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
  "duration": 3134277489,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 233421554,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "01 No goal set in the Goal Type/Value box",
  "description": "",
  "id": "ability-to-edit-flight-goal-data-in-campaigns;01-no-goal-set-in-the-goal-type/value-box",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I search/filter for a flight with No goal",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "There is an Add icon in the box orange to inform the user action is required",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "The box states \u0027Goal Info and Target\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "ProteusWebSteps.iSearchFilterForAFlightWithNoGoal()"
});
formatter.result({
  "duration": 4296039554,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3224014411,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.thereIsAnAddIconInTheBoxOrangeToInformTheUserActionIsRequired()"
});
formatter.result({
  "duration": 51155604,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.theBoxStatesGoalInfoAndTarget()"
});
formatter.result({
  "duration": 53509524,
  "status": "passed"
});
formatter.after({
  "duration": 1536961051,
  "status": "passed"
});
formatter.before({
  "duration": 585444017,
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
  "duration": 1568853,
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
  "duration": 4048508140,
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
  "duration": 5334300444,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenTheMainHomepageLoadsSuccessfully()"
});
formatter.result({
  "duration": 41914009,
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
  "duration": 3104475688,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.ThenAllFlightsLoadsWhichIHaveAccessTo()"
});
formatter.result({
  "duration": 192390318,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "02 Add/Edit goal set in the Goal Type/Value box",
  "description": "",
  "id": "ability-to-edit-flight-goal-data-in-campaigns;02-add/edit-goal-set-in-the-goal-type/value-box",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I search/filter for a flight with No goal",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Click on Apply button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "There is an Add icon in the box orange to inform the user action is required",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Click on Add \u0027Goal Info and Target\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Option to select Goal Type and Goal Value exist",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Goal Type (dropdown)"
    },
    {
      "line": 28,
      "value": "#Goal Value (depending on goal type, value could be percentage/numeric/cost)"
    }
  ],
  "line": 29,
  "name": "Select Goal Type, Goal Value and Save",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Selected Goal Type and Goal Values saved",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "There is an edit icon in the box",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Click to edit Goal Type",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Option to select Goal Type and Goal Value exist",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 34,
      "value": "#Goal Type (dropdown)"
    },
    {
      "line": 35,
      "value": "#Goal Value (depending on goal type, value could be percentage/numeric/cost)"
    }
  ],
  "line": 36,
  "name": "Edit Goal Type, Goal Value and Save",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Edited Goal Type and Goal Values saved",
  "keyword": "Then "
});
formatter.match({
  "location": "ProteusWebSteps.iSearchFilterForAFlightWithNoGoal()"
});
formatter.result({
  "duration": 3188574213,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.WhenClickOnApplyButton()"
});
formatter.result({
  "duration": 3212060923,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.thereIsAnAddIconInTheBoxOrangeToInformTheUserActionIsRequired()"
});
formatter.result({
  "duration": 42515608,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.clickOnAddGoalInfoAndTarget()"
});
formatter.result({
  "duration": 1154769000,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.optionToSelectGoalTypeAndGoalValueExist()"
});
formatter.result({
  "duration": 110300540,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.selectGoalTypeGoalValueAndSave()"
});
formatter.result({
  "duration": 3807576402,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.selectedGoalTypeAndGoalValuesSaved()"
});
formatter.result({
  "duration": 7401902762,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.thereIsAnEditIconInTheBox()"
});
formatter.result({
  "duration": 23302390,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.clickOnEditGoalInfoAndTarget()"
});
formatter.result({
  "duration": 1128581918,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.optionToSelectGoalTypeAndGoalValueExist()"
});
formatter.result({
  "duration": 92965507,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.editGoalTypeGoalValueAndSave()"
});
formatter.result({
  "duration": 3758259730,
  "status": "passed"
});
formatter.match({
  "location": "ProteusWebSteps.editedGoalTypeAndGoalValuesSaved()"
});
formatter.result({
  "duration": 7326640500,
  "status": "passed"
});
formatter.after({
  "duration": 1229235956,
  "status": "passed"
});
});