package io.headspin.Steps;


import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import static io.headspin.implimentation.AppAccess.*;
import static io.headspin.variables.GlobalVariables.Appium_Driver;

public class TestInitializerSteps {


    private void deleteReportFiles() throws IOException {
        String filepath = "Reports";
        File file = new File(filepath);
        FileUtils.deleteDirectory(file);
        file.delete();
    }

    @Before
    public void Start() throws IOException {
        deleteReportFiles();
        System.out.println("==========================================Driver Started===============================");
        AccessApplication();
    }

    @After
    public void End() {
        teardown();
        System.out.println("==========================================Driver Terminated=============================");
    }

    @AfterStep
    public void addScreenshot(Scenario scenario)
    {
        if(scenario.isFailed())
        {
            final byte[] screenshot = ((TakesScreenshot) Appium_Driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }
    }

}
