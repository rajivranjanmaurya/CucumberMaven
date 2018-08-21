package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//import stepDefinitions.BrowserInitialization;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/One.feature",glue={"stepDefinitions"},
plugin = {"pretty","json:target/Flipkart.json"}, monochrome=true)


public class FlipkartTestRunner {

}
