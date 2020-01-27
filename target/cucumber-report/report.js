$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/registration.feature");
formatter.feature({
  "name": "Registration",
  "description": "  As a user\n  I should be able to register\n  So that I can access the application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can navigate to the login page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "When "
});
formatter.match({
  "location": "Register.navigateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.iSeeTheSignInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});