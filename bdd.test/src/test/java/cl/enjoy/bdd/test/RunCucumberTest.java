package cl.enjoy.bdd.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},features = { "target/generated-test-sources/" })
public class RunCucumberTest{
	
}
