package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/CreateContact.feature",
glue = {"stepDefinitions","hooks"},
dryRun = false,
monochrome = true,
plugin = {"pretty","html:target/HtmlReports/report.html",
		"json:target/JsonReports/report.json",
		"junit:target/JunitReports/report.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})
public class TestRunner {

}
