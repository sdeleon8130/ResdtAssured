package com.bdd.test;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/src/test/resources/features",
		glue = {"step_definitions"},
		tags = "@tag1",
}

public class TestRunner {

}
