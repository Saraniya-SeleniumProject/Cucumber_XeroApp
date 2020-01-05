$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/senid/Workspace/Cucumber_XeroAppApplication/src/test/resources/Add another organization - Current Quickbooks user.feature");
formatter.feature({
  "name": "Add another organisation to Paid Version of Xero App and Check the",
  "description": "currentlyusingquickbooks checkbox and then click on buy now button",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Organization added should be with the \"Paid\" Subscription and Established Plan Chosen",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User logs into the application with correct username and pwd",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs_AddAnOrganisationquickbookuser.user_logs_into_the_application_with_correct_username_and_pwd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on myXero link from the top left menu",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_AddAnOrganisationquickbookuser.click_on_myXero_link_from_the_top_left_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add one more organisation with paid version",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs_AddAnOrganisationquickbookuser.add_one_more_organisation_with_paid_version()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the currentlyusingquickbooks checkbox and click buynow button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_AddAnOrganisationquickbookuser.check_the_currentlyusingquickbooks_checkbox_and_click_buynow_button()"
});
formatter.result({
  "status": "passed"
});
});