$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/parameterizing.feature");
formatter.feature({
  "name": "login feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FHCloginParameters"
    }
  ]
});
formatter.scenario({
  "name": "TC01_user should login with manager credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FHCloginParameters"
    }
  ]
});
formatter.step({
  "name": "user is on the fhctriplogin page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid manger username \"manager2\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters valid manager password \"Man1ager2!\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the manager login is successful",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});