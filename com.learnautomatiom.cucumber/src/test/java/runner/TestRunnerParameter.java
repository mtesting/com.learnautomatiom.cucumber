package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featuresparameters",
glue={"stepdefinitionparaameters"},
plugin={"html:target/cucumber-html-report"})


public class TestRunnerParameter {

}
