package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//import stepDefinitions.BrowserInitialization;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/Two.feature",glue={"stepDefinitions"},
plugin = {"pretty","json:target/Amazon.json"}, monochrome=true)

public class AmazonTestRunner {

}
