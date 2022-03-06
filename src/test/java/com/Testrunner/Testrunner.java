package com.Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit= "--step-notifications",
		plugin= {"json:target/cucumber.jason"},
		features="Feature",
		glue= {"Step_defination"}
				,tags= {"@Login"}
		)


public class Testrunner {

}
