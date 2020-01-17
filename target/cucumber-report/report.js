$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/feature1.feature");
formatter.feature({
  "name": "Login and Logout",
  "description": "  As a user\n  I want to be able login\n  So that I can access the site",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Signing in with correct credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a registered user",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.iAmARegisteredUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Sign In tab on the site",
  "keyword": "When "
});
formatter.match({
  "location": "Login.iClickOnTheSignInTabOnTheSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type my correct username and password",
  "keyword": "And "
});
formatter.match({
  "location": "Login.iTypeMyCorrectUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Sign In button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.iClickTheSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to the \"Welcome\" page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Signing in with incorrect credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a user",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.iAmAUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Sign In tab on the site",
  "keyword": "When "
});
formatter.match({
  "location": "Login.iClickOnTheSignInTabOnTheSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type in the wrong username and password combo",
  "keyword": "And "
});
formatter.match({
  "location": "Login.iTypeInTheWrongUsernameAndPasswordCombo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Sign In button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.iClickTheSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see a Failed Login message",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.iShouldSeeAFailedLoginMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Logging out",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a registered user",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.iAmARegisteredUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am logged in to the site",
  "keyword": "And "
});
formatter.match({
  "location": "Login.iAmLoggedInToTheSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the log out button",
  "keyword": "When "
});
formatter.match({
  "location": "Logout.iClickTheLogOutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Sign Out pop up appears",
  "keyword": "And "
});
formatter.match({
  "location": "Logout.theSignOutPopUpAppears()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click confirm",
  "keyword": "And "
});
formatter.match({
  "location": "Logout.iClickConfirm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am returned to the Sign In page",
  "keyword": "Then "
});
formatter.match({
  "location": "Logout.iAmReturnedToTheSignInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/features/feature2.feature");
formatter.feature({
  "name": "Register",
  "description": "  As a user\n  I want to be able to register for the service\n  So that I can access the site and its features",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Access registration page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Codeveros Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.iNavigateToTheCodeverosLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Register tab",
  "keyword": "When "
});
formatter.match({
  "location": "Register.iClickOnRegisterTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see 6 text fields",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.iSeeSixTextFields()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Register",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "Register.iAmOnTheRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in the 6 text fields",
  "keyword": "When "
});
formatter.match({
  "location": "Register.iFillInTheSixTextFields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am able to click the Registe button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I am redirected to the Welcome to Codeveros page",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.iAmRedirectedToTheWelcomeToCodeverosPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the user is registered through the menu",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a registered user",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.iAmARegisteredUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Welcome page",
  "keyword": "And "
});
formatter.match({
  "location": "Login.iAmOnTheWelcomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click User under Menu",
  "keyword": "When "
});
formatter.match({
  "location": "Register.iClickUserUnderMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see my information populated under the User List",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.iSeeMyInformationPopulatedUnderTheUserList()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the user is registered through the header icon",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a registered user",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.iAmARegisteredUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Welcome page",
  "keyword": "And "
});
formatter.match({
  "location": "Login.iAmOnTheWelcomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the User icon on the site header",
  "keyword": "When "
});
formatter.match({
  "location": "Register.iCLickTheUserIconOnTheSiteHeader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see my information populated under the User List",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.iSeeMyInformationPopulatedUnderTheUserList()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});