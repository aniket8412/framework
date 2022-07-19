package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/parameterization.feature", glue = {
 "StepDefination" }, monochrome = true, plugin = { "pretty", "html:Reports/htmlReport/html",
 "json:Reports/JsonReport/Cucumber.json",
    "junit:Reports/JunitReport/report.xml"})

public class TestRunnerParameterization {

}