$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/SeleniumWorkspace/BDDAssignment/src/main/java/Features/GetBanksDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Get bank Details from Web Page",
  "description": "",
  "id": "get-bank-details-from-web-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User on Malaysia Page",
  "description": "",
  "id": "get-bank-details-from-web-page;user-on-malaysia-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on Malaysia page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Verify Title of Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Scroll the page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User will get the Malasiya Bank Names",
  "keyword": "And "
});
formatter.match({
  "location": "MalaysiaPageDefinations.User_is_already_on_Malaysia_page()"
});
formatter.result({
  "duration": 8244382982,
  "status": "passed"
});
formatter.match({
  "location": "MalaysiaPageDefinations.Verify_Title_of_Page()"
});
formatter.result({
  "duration": 31924234,
  "status": "passed"
});
formatter.match({
  "location": "MalaysiaPageDefinations.Scroll_the_page()"
});
formatter.result({
  "duration": 14546414,
  "status": "passed"
});
formatter.match({
  "location": "MalaysiaPageDefinations.User_will_get_the_Malasiya_Bank_Names()"
});
formatter.result({
  "duration": 9288014759,
  "status": "passed"
});
});