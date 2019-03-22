package com.training.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Nilay\\eclipse-workspace\\cucumberdemo\\src\\main\\java\\Features\\training.feature",
glue="com.training.step",
plugin= {"pretty","html:target/htmlreports"})

public class TestRunner 
{
	
}
