package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = ".\\src\\test\\java\\featureFiles\\LoginToApp.feature",
		glue = "stepDefinitions",
		dryRun = false //true - browser will not launch but step are generated
						//false - browser will launch the execution happens
		)


public class RunnerIO extends AbstractTestNGCucumberTests{

}
