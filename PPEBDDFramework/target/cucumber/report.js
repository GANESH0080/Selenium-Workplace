$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/SeleniumWorkspace/PPEBDDFramework/src/main/java/FeatureFiles/Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "PPE Login Feature",
  "description": "",
  "id": "ppe-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "PPE Login Scenario",
  "description": "",
  "id": "ppe-login-feature;ppe-login-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Agent Is Already On Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Tittle Of The Login Page Is Login",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Agent Entering Username and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "URL Of The LoggedIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Click On GuidLines Link",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.Agent_Is_Already_On_Login_Page()"
});
formatter.result({
  "duration": 16142129564,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.Tittle_Of_The_Login_Page_Is_Login()"
});
formatter.result({
  "duration": 16465953,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.Agent_Entering_Username_and_Password()"
});
formatter.result({
  "duration": 385030052,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.click_on_Login_Button()"
});
formatter.result({
  "duration": 9672812269,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.URL_Of_The_LoggedIn_Page()"
});
formatter.result({
  "duration": 7599766,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.Click_On_GuidLines_Link()"
});
formatter.result({
  "duration": 364621465,
  "status": "passed"
});
});