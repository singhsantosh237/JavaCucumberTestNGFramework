package io.headspin.implimentation;


import java.net.MalformedURLException;
import static io.headspin.utils.BaseInitialize.*;
import static io.headspin.variables.GlobalVariables.*;

public class AppAccess {

    public static void AccessApplication() throws MalformedURLException
    {
        if(Appium_Driver == null || Appium_Driver.toString().contains("null"))
        {
            Appium_Driver = getDriver();
        }
    }

    public static void teardown()
    {
        if (null != Appium_Driver)
        {
            Appium_Driver.quit();
        }
    }
}
