package com.automation.steps;

import io.cucumber.java.en.*;

import java.util.List;

public class UserRegFormSteps {

    @Given("user is on Reg Page")
    public void user_is_on_reg_page() {
        System.out.println("Step1");
    }

    @When("user enters valid data")
    public void user_enters_valid_data(List<String> listOfData) {
        System.out.println("Step2");
        for (String eachData : listOfData) {
            System.out.println(eachData);
        }
    }

    @Then("user registration is successful")
    public void user_registration_is_successful() {
        System.out.println("Step3");
    }


}
