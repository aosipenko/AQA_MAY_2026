package org.prog.session17.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Map;
import java.util.Random;

public class MySteps {

    WebDriver driver;

    @Given("I have something {string}")
    public void given(String value) {
        System.out.println("Executing step: I have something " + value);
    }

    @When("I do something {int} times")
    public void when(int i) {
        System.out.println("Executing step: I do something " + i + " times");
    }

    @Then("I click {}")
    public void then(GooglePageElements element) {
//        driver.findElement(element.getLocator()).click();
    }

    @Given("data table stuff")
    public void dataTableStuff(DataTable dataTable) {
        Map<String, String> userData = dataTable.asMap();
        for (Map.Entry<String, String> entry : userData.entrySet()) {
            System.out.println("Add to BD: " + entry.getKey() + ": " + entry.getValue());
        }
    }

    @Given("Fail {int} in {int}")
    public void failIn(int value1, int value2) {
        Random random = new Random();
        int i = random.nextInt(value2);
        Assert.assertTrue(value1 > i);
    }
}
