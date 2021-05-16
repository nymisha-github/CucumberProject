package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/CucumberProject/RegisterUser.feature"},
glue = {"StepsDefinition"},
dryRun = false,
monochrome = true,
plugin = {"html:testoutput/NunnaCSS.html","junit:testoutput/report.xml","json:testoutput/jsonreport.json"}
)
public class TestRunner {

}
