package io.headspin.Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/feature",
        glue = {"io.headspin.Steps"},
        monochrome = true,
        dryRun = false,
        tags = "@Appium",
        publish= true
)

public class Runner extends AbstractTestNGCucumberTests {
    TestNGCucumberRunner testngcucumber = new TestNGCucumberRunner(this.getClass());
}
