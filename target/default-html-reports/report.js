$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/apiTest.feature");
formatter.feature({
  "name": "Users should be able check post codes",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "The user can check the postcodes",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@new"
    }
  ]
});
formatter.step({
  "name": "the user sets the postcode endpoint",
  "keyword": "Given "
});
formatter.step({
  "name": "should check postcodes if \"\u003cpostcode\u003e\" postcode is correct",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "postcode"
      ]
    },
    {
      "cells": [
        "RG6 5QZ"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user can check the postcodes",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@new"
    }
  ]
});
formatter.step({
  "name": "the user sets the postcode endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qdoctor.stepDefs.PostcodeApiTestStepDefs.the_user_sets_the_postcode_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should check postcodes if \"RG6 5QZ\" postcode is correct",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qdoctor.stepDefs.PostcodeApiTestStepDefs.should_check_postcodes_if_postcode_is_correct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});