package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"cucumberActivities"},
    //tags = "@SmokeTest",
    //tags = "@activity1_1"
    //tags = "@activity1_2"
    //tags = "@activity1_3"
    //tags = "@activity2_4"
    tags = "@activity2_5",
    //plugin = {"pretty"},
    plugin = {"pretty", "html:test-reports"},
    //plugin = {"json: test-reports/json-report.json"},
    monochrome = true

)

public class activitiesRunner {
    //empty
}