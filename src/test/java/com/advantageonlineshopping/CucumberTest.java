package com.advantageonlineshopping;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author lucasns
 * @since #1.0
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        plugin = { "pretty", "html:target/selenium-reports"},
        tags = {"~@SmokeTest"})
public class CucumberTest {

}
