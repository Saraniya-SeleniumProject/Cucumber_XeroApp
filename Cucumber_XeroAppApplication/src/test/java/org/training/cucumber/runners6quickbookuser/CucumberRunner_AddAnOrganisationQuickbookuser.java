package org.training.cucumber.runners6quickbookuser;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber-report.json" },
		         features="C:\\Users\\senid\\Workspace\\Cucumber_XeroAppApplication\\src\\test\\resources\\Add another organization - Current Quickbooks user.feature", 
                 glue="com.training.cucumber.steps6quickbookuser"
                 
                 )

public class CucumberRunner_AddAnOrganisationQuickbookuser {

}
