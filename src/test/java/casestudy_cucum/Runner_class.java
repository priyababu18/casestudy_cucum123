package casestudy_cucum;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="TestMe",glue="casestudy_cucum",tags= {"@Sanity"},plugin={"html:target/cucumber-htmlreport.html","json:target/cucmber.json"})

public class Runner_class {
	

}
