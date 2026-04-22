package com.automation.steps;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("user open website")
    public void user_open_website() {
        System.out.println("Step1");
    }

    @Then("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Step2");
    }

    @When("user loging with credential")
    public void user_loging_with_credential() {
        System.out.println("Step3");
    }

    @Then("verify user is on homepage")
    public void verify_user_is_on_homepage() {
        System.out.println("Step4");
    }


}
