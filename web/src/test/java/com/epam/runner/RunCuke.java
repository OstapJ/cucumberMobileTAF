package com.epam.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = { "pretty", "json:target/cucumber.json",
				"com.epam.reportportal.cucumber.ScenarioReporter" },
		glue = { "com.epam.rest.step" },
		features = { "src/test/resources/com/epam/feature" }
)
public class RunCuke
{
}