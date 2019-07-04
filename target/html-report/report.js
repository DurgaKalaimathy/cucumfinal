$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/skeleton/typematch.feature");
formatter.feature({
  "name": "Product search",
  "description": "Description: Alex wants to purchase a product and \nwhile searching, he must get products relevant to the \ncharacters he typed",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search engine",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Alex logins testme app",
  "keyword": "Given "
});
formatter.match({
  "location": "casestudy3.alex_logins_testme_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alex searches the product",
  "keyword": "When "
});
formatter.match({
  "location": "casestudy3.alex_searches_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alex selects the product",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy3.alex_selects_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alex verifies the product",
  "keyword": "Then "
});
formatter.match({
  "location": "casestudy3.alex_verifies_the_product()"
});
formatter.result({
  "status": "passed"
});
});