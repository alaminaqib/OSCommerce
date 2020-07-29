package com.apple.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

	@CucumberOptions(
	features = "Features",
	glue = "com.apple.stepdef"
	
	)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
