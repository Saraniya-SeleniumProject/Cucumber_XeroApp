package org.training.cucumber.runners4PaidGrowingPlan;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber-report.json" },
		         features="C:\\Users\\senid\\Workspace\\Cucumber_XeroAppApplication\\src\\test\\resources\\Add another organization - Growing Plan Type.feature", 
                 glue="com.training.cucumber.steps4PaidGrowingPlan"
                 
                 )



public class CucumberRunner_AddAnOrganisationPaidVerGrowingPlan {

}
