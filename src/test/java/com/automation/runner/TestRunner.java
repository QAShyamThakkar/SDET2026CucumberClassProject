package com.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/FeatureFile/login.feature", //Path to feature
        glue = "com.automation.steps",  //Path to step definition
//        dryRun = false,   //to check feature file steps implemented in step definition
//        tags = "@Regression",
        plugin = {"html:target/cucumber.html", "json:target/cucumber.json"}

)

public class TestRunner {

    //Empty class

}
