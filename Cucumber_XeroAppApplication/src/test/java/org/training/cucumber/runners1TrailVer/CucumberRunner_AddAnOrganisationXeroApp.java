package org.training.cucumber.runners1TrailVer;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber-report.json" },
		         features="C:\\Users\\senid\\Workspace\\Cucumber_XeroAppApplication\\src\\test\\resources\\Add another organization Trail version 1.feature", 
                 glue="com.training.cucumber.steps1TrialVer"
                 
                 )



public class CucumberRunner_AddAnOrganisationXeroApp {

}
