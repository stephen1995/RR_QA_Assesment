$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FillForm.feature");
formatter.feature({
  "name": "TCG and GTP path",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Saved Card Success",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Testy"
    }
  ]
});
formatter.step({
  "name": "The user has navigated to Flight search page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.the_user_has_navigated_to_Flight_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill From",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});