package io.headspin.utils;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

import static io.headspin.BasicFunctionalities.propertiesFileReader.getConfigProperty;

public class BaseInitialize {

    public static AppiumDriver driver;

    public static AppiumDriver getDriver() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.5");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");

        URL url = new URL(Objects.requireNonNull(getConfigProperty("AppiumURL")));
        driver = new AppiumDriver(url, cap);
        return driver;
    }






}
