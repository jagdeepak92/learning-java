package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"stepDefinition/login_stepDefinition"},monochrome=true)



public class Runner {
 
}
