package test;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/scenarios/ebay.feature",
        glue = "stepdefinitions",
        plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true
)
public class EbayTest {
}
