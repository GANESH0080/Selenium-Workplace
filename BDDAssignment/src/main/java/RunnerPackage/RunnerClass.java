package RunnerPackage;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
// Different CucumberOptions are :
// dryRun,Features,Glue,Tags,monoChrome,Format,Strict
@CucumberOptions(features = "D:\\SeleniumWorkspace\\BDDAssignment\\src\\main\\java\\Features\\GetBanksDetails.feature", glue = {
		"StepDefination" }, format = { "pretty", "html:target/cucumber", "json:json_Output/cucumber.json",
				"junit:junit_XMLOutput/cucumber.xml" }, dryRun = false, monochrome = true, strict = true)
public class RunnerClass {

}

