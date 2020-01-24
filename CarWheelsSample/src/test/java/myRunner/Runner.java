package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:/Users/sailaja.ryali/git/MyTestProject/CarWheelsSample/Resources/Features"  //the path of the feature file
 ,glue="StepDefinitions" //the path of the step definition file
  )
 
public class Runner {

}


