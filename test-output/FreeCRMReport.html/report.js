$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM HomePage Feature",
  "description": "",
  "id": "free-crm-homepage-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify user can access the home page",
  "description": "",
  "id": "free-crm-homepage-feature;verify-user-can-access-the-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user verify title of the page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user verify logo of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageTest.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageTest.user_verify_title_of_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageTest.user_verify_logo_of_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("LoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify user can login into the application",
  "description": "",
  "id": "free-crm-login-feature;verify-user-can-login-into-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launch and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of the page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user logs into the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTest.user_launch_and_enter_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageTest.title_of_the_page_is_FreeCRM()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageTest.user_logs_into_the_application()"
});
formatter.result({
  "status": "skipped"
});
});