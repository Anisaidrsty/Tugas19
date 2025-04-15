package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:reports/cucumber-report.html"},
            glue = {"stepDevinitions"},
            features = {"src/test/resources/features"}
    )
public class CucumberTestRunner {

}
