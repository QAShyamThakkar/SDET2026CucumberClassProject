package com.automation.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Set up");
    }

    @After
    public void cleanUp() {
        System.out.println("Clean up");
    }


}
