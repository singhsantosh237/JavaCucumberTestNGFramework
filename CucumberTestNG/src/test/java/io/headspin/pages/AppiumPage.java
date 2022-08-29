package io.headspin.pages;


import org.testng.Assert;
import java.net.MalformedURLException;

import static io.headspin.BasicFunctionalities.WaitFunction.*;
import static io.headspin.BasicFunctionalities.propertiesFileReader.*;
import static io.headspin.variables.GlobalVariables.*;
import io.headspin.Loactors.AppiumLocators;

public class AppiumPage extends AppiumLocators{


    public void userOpenBrowser() throws MalformedURLException {
        Appium_Driver.get(getConfigProperty("URL"));
    }

    public void userEnterCredentials() {
        waitForElementAndClick(form_auth_link);
        waitForElementAndSendKeys(username,getConfigProperty("username"));
        waitForElementAndSendKeys(password,getConfigProperty("password"));
        waitForElementAndClick(submitButton);
    }

    public void userValidateOutput() {
        waitForElementAndClick(logOut);
        waitForElementPresentAndConfirmURL(getConfigProperty("CONFIRM_URL"));
        String text = waitForElementAndGetText(flash);
        Assert.assertTrue(text.contains("logged out"));
    }


}
