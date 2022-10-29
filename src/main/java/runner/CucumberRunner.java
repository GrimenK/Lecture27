package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/features/"},glue = {"definitions"},
        plugin = {"json:target/cucumber.json", "pretty", "html:target/cucumber-reports.html"})
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
