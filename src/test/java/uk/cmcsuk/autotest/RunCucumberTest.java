package uk.cmcsuk.autotest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    dryRun      = true,
    plugin      = {"pretty"}/*,
    features    = "src/test/resources/uk/cmcsuk/autotest/authenticate.feature"*/
)
public class RunCucumberTest {
}
