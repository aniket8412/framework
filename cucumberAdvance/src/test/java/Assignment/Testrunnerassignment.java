package Assignment;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/assignment.feature", glue = {
        "Assignment" }, monochrome = true, plugin = { "pretty", "html:Reports/htmlReportPara/html",
                "json:Reports/JsonReportPara/Cucumber.json", "junit:Reports/JunitReportPara/report.xml"},
                tags = "@smoke")

public class Testrunnerassignment {

}