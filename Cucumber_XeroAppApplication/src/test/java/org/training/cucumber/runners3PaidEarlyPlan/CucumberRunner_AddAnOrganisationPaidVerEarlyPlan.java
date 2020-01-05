package org.training.cucumber.runners3PaidEarlyPlan;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber-report.json" },
		         features="C:\\Users\\senid\\Workspace\\Cucumber_XeroAppApplication\\src\\test\\resources\\Add another organization - Early Plan Type.feature", 
                 glue="com.training.cucumber.steps3PaidEarlyPlan"
                 
                 )



public class CucumberRunner_AddAnOrganisationPaidVerEarlyPlan {

}
