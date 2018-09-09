package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features="E:\\Praveen_Automation\\Cucumber_BDD\\Cucumber_POM_N\\src\\main\\java\\com\\features\\FreeCrm.feature",
		 glue={"com.stepdefinations"},
		 format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_output/cucumber.xml"},
		 monochrome=true,
		 strict=true,
		 dryRun=false
		// tags={""}
		 )
public class RunCuke
{
	

}
