package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; // <-- CRITICAL: Must be io.cucumber.junit, NOT io.cucumber.testng

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepdefinitions", "hooks"},
//    tags = "@CompleteBooking",
    plugin = {
        "pretty",
        "html:target/htmlreports/ninja_report.html"
    }
)
public class TestNG_Runner {

}