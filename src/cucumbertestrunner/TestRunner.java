package cucumbertestrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="cucumberfeatures\\Login.feature",glue= {"cucumberstepdefinitions"}
,tags= {"@tag1"},dryRun=false,monochrome=true)

public class TestRunner 
{ 

}
