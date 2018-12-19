$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/test2.feature");
formatter.feature({
  "name": "as a user I want to practice cucumber with java",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "open editor",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I open albelli website",
  "keyword": "Given "
});
formatter.match({
  "location": "test2.i_open_albelli_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on one of the buttons",
  "keyword": "When "
});
formatter.match({
  "location": "test2.i_click_on_one_of_the_buttons()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "something is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "test2.something_is_visible()"
});
formatter.result({
  "status": "passed"
});
});