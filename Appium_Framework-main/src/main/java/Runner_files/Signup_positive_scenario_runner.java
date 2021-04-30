package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	features = "src\\main\\java\\Signup_positive_scenario\\signup_positive_scenario.feature",
	glue= {"Signup_positive_scenario"},
	monochrome = true,publish = true)
public class Signup_positive_scenario_runner extends AbstractTestNGCucumberTests {

}
