package io.headspin.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.headspin.pages.AppiumPage;
import java.net.MalformedURLException;


public class AppiumSteps {

    AppiumPage ap1 = new AppiumPage();

    @Given("User open web browser and go to URL")
    public void userOpenWebBrowserAndGoToURL() throws MalformedURLException {
        ap1.userOpenBrowser();
    }

    @When("User enters correct credentials")
    public void user_enters_correct_credentials() {
        ap1.userEnterCredentials();
    }

    @Then("User should be able to validate the output")
    public void user_should_be_able_to_validate_the_output() {
        ap1.userValidateOutput();
    }

}
