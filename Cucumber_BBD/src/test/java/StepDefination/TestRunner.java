package StepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import com.sun.tools.javac.tree.Pretty;

import io.cucumber.junit.CucumberOptions;

//@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", 
		glue = {"StepDefination"},
		tags = "@NinjaEndToEndOnly",
		plugin = {
				"pretty", 
				"html:target/htmlreports/ninja_report.html"
				}
		)

public class TestRunner {

}
