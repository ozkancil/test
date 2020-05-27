$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FE1200_US2500_google%20search%20data%20tables.feature");
formatter.feature({
  "name": "Single data table",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@datatable"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC01_google search table",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on google page",
  "keyword": "Given "
});
formatter.step({
  "name": "user searches for \"\u003cvalue\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify the result has \"\u003cvalue\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test Data",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "value"
      ]
    },
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "Istanbul"
      ]
    },
    {
      "cells": [
        "apple"
      ]
    },
    {
      "cells": [
        "orange"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC01_google search table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatable"
    }
  ]
});
formatter.step({
  "name": "user is on google page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user searches for \"iphone\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the result has \"iphone\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "TC01_google search table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatable"
    }
  ]
});
formatter.step({
  "name": "user is on google page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user searches for \"Istanbul\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the result has \"Istanbul\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "TC01_google search table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatable"
    }
  ]
});
formatter.step({
  "name": "user is on google page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user searches for \"apple\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the result has \"apple\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "TC01_google search table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatable"
    }
  ]
});
formatter.step({
  "name": "user is on google page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user searches for \"orange\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the result has \"orange\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});