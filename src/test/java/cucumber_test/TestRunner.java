package cucumber_test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//below annotations are coming from cucumber junit dependency
@RunWith(Cucumber.class)
@CucumberOptions(
		// it is taking features, glue and tags as a parameter
	features=".//resources",
	glue= {"stepdefinition"},
	tags= "@test",
	plugin = {"pretty"}
		
		)

public class TestRunner {

	
}
