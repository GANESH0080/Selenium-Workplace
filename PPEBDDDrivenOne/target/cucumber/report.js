$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/SeleniumWorkspace/Selenium-Workplace/PPEBDDDrivenOne/src/main/java/Features/Login.feature");
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
  "duration": 11665993300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.Tittle_Of_The_Login_Page_Is_Login()"
});
formatter.result({
  "duration": 17311200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.Agent_Entering_Username_and_Password()"
});
formatter.result({
  "duration": 322291800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.click_on_Login_Button()"
});
formatter.result({
  "duration": 1468008300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.URL_Of_The_LoggedIn_Page()"
});
formatter.result({
  "duration": 8872900,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ogitate.us/PPE.Test/[?Message\u003dInvalid%20Username%20or%20Password%20entered!]\u003e but was:\u003c...ogitate.us/PPE.Test/[Home]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat StepsDefinations.LoginStepDef.URL_Of_The_LoggedIn_Page(LoginStepDef.java:51)\r\n\tat ✽.When URL Of The LoggedIn Page(D:/SeleniumWorkspace/Selenium-Workplace/PPEBDDDrivenOne/src/main/java/Features/Login.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDef.Click_On_GuidLines_Link()"
});
formatter.result({
  "status": "skipped"
});
});