package com.nexttech.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunnerNG {
	
@CucumberOptions(
	features= {"Features"},
	glue= {"com.nexttech.Stepdefs"}
	
		
		
		)
	
	public class TestRunner extends AbstractTestNGCucumberTests{}

	

}
