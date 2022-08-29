package io.headspin.Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

import static io.headspin.implimentation.AppAccess.AccessApplication;
import static io.headspin.implimentation.AppAccess.teardown;

public class FirstStep {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("The user is on login page");
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("The user enter valid date");
    }

    @And("hits submit")
    public void hits_submit() {
        System.out.println("The user hits submit");
    }

    @Then("the user should be login successfully")
    public void the_user_should_be_login_successfully() {
        System.out.println("The user login successfully");
    }

    @When("User enters valid {string} and {string}")
    public void userEntersValidAnd(String arg0, String arg1) {
        System.out.println("The user login with credentials" + " " + arg0 + " " + arg1);
    }

}
