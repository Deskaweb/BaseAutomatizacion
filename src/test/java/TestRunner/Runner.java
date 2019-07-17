package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\resources\\feature",glue={"Steps"}, plugin = { "pretty", "html:target/cucumber-reports" })
public class Runner
{

}