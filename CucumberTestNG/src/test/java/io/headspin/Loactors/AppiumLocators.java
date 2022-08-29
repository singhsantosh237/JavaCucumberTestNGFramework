package io.headspin.Loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppiumLocators {

    protected static By form_auth_link = By.linkText("Form Authentication");
    protected static By username = By.cssSelector("#username");
    protected static By password = By.cssSelector("#password");

    protected static By submitButton = By.cssSelector("button[type=submit]");

    protected static By logOut = By.linkText("Logout");

    protected static By flash = By.cssSelector("#flash");

}
