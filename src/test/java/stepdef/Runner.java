package stepdef;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Case",glue="stepdef",plugin="json:target\\json report.json")
public class Runner {
	

}
