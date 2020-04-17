$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/resources/java/com/datamatics/meritor/features/meritor.feature");
formatter.feature({
  "line": 1,
  "name": "Verifying Page Title",
  "description": "",
  "id": "verifying-page-title",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify Login Page Title",
  "description": "",
  "id": "verifying-page-title;verify-login-page-title",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    },
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "processor user is login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "processor user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "verifying-page-title;verify-login-page-title;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "verifying-page-title;verify-login-page-title;;1"
    },
    {
      "cells": [
        "puser2",
        "Sysadmin@123"
      ],
      "line": 11,
      "id": "verifying-page-title;verify-login-page-title;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Verify Login Page Title",
  "description": "",
  "id": "verifying-page-title;verify-login-page-title;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    },
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "processor user is login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "processor user enters \"puser2\" and \"Sysadmin@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTest.processor_user_is_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "puser2",
      "offset": 23
    },
    {
      "val": "Sysadmin@123",
      "offset": 36
    }
  ],
  "location": "LoginPageTest.processor_user_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Verify Home Page Title",
  "description": "",
  "id": "verifying-page-title;verify-home-page-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@SanityTest"
    },
    {
      "line": 13,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "processor user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageTest.processor_user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
});