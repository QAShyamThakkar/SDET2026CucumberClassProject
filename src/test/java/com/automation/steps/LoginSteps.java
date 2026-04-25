package com.automation.steps;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginSteps {

    @Given("user open website")
    public void user_open_website() {
        System.out.println("Step1");
    }

    @Then("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Step2");
    }

    @When("user login with username {string} and password {string}")
    public void user_login_with_username_and_password(String userName, String password) {
        System.out.println("Step 3");
        System.out.println(userName);
        System.out.println(password);
    }

//    @When("user loging with credential")
//    public void user_loging_with_credential() {
//        System.out.println("Step3");

    /// /        Assert.assertEquals("Some error", 5, 5);
    /// /        Assert.assertTrue("Some Error", 5==25);
//    }

    @When("user enters invalid username {string} and invalid password {string}")
    public void user_enters_invalid_username_and_invalid_password(String userName, String password) {
        System.out.println("Step3 for Scenario 2");
        System.out.println(userName);
        System.out.println(password);
        }

    @Then("login is unsuccessful")
    public void login_is_unsuccessful() {
        System.out.println("Step4 for Scenario 2");
    }


    @Then("verify user is on homepage")
    public void verify_user_is_on_homepage() {
        System.out.println("Step4");
    }


}
