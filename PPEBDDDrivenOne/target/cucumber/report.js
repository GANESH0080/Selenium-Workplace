$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/SeleniumWorkspace/PPEDataDrivenOne/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "PPE Login Feature",
  "description": "",
  "id": "ppe-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "PPE Login Scenario",
  "description": "",
  "id": "ppe-login-feature;ppe-login-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Agent Is Already On Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Tittle Of The Login Page Is Login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Agent Entering Username and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "URL Of The LoggedIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Click On GuidLines Link",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.Agent_Is_Already_On_Login_Page()"
});
formatter.result({
  "duration": 9048413522,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.Tittle_Of_The_Login_Page_Is_Login()"
});
formatter.result({
  "duration": 14622926,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.Agent_Entering_Username_and_Password()"
});
formatter.result({
  "duration": 346508107,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.click_on_Login_Button()"
});
formatter.result({
  "duration": 4368916471,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.URL_Of_The_LoggedIn_Page()"
});
formatter.result({
  "duration": 10310503,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.Click_On_GuidLines_Link()"
});
formatter.result({
  "duration": 96137542,
  "status": "passed"
});
});