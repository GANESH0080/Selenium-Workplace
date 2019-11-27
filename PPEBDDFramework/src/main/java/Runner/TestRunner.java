package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
// Different CucumberOptions are : dryRun,Features,Glue,Tags,monoChrome,Format,Strict
@CucumberOptions(features="D:\\SeleniumWorkspace\\PPEBDDFramework\\src\\main\\java\\FeatureFiles\\Login.feature",glue={"Steps"},
format = {"pretty", "html:target/cucumber","json:json_Output/cucumber.json","junit:junit_XMLOutput/cucumber.xml"},dryRun=false,monochrome = true,strict = true)

public class TestRunner {

}