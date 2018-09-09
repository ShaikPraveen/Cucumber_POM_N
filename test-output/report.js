$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Praveen_Automation/Cucumber_BDD/Cucumber_POM_N/src/main/java/com/features/FreeCrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM Home Page Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens  the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user logs into Applicatin",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Validate Home Page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_the_browser()"
});
formatter.result({
  "duration": 16178152453,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 893917358,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_logs_into_Applicatin()"
});
formatter.result({
  "duration": 8300645601,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_Home_Page_Title()"
});
formatter.result({
  "duration": 16819326,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.close_the_browser()"
});
formatter.result({
  "duration": 10962860,
  "status": "passed"
});
});