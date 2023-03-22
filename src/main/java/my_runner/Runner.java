package my_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\features",
					glue = "step_definitions",
					monochrome = true,
					dryRun = false,
					plugin = {"pretty","html:target/POC"},
					tags = "@Test"
					//strict = true					
					)

public class Runner {

}
