package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",tags= {"@britishTest"},glue= {"stepDefinitions"},
		plugin = {"pretty", "html:target/cucumber-reports"},
		monochrome = true)


public class TestRunner 
{
	

}
