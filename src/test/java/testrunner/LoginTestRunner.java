package testrunner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "feature",
		glue = {"stepdefinition", "utility"},
		tags = {"@chrome"}
		)

@Test
public class LoginTestRunner extends AbstractTestNGCucumberTests {}
