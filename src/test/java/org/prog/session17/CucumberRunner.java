package org.prog.session17;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.prog.session14.pages.GooglePage;
import org.prog.session17.steps.DBSteps;
import org.prog.session17.steps.WebSteps;
import org.prog.session17.util.DBConnectionFactory;
import org.prog.session17.util.WebDriverFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.SQLException;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "org.prog.session17.steps",
        plugin = {
                "pretty",
                "html:target/report.html",
                "json:target/Cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    private WebDriver driver;

    @SneakyThrows
    @BeforeSuite
    public void beforeSuite() {
        driver = WebDriverFactory.getDriver();
        WebSteps.googlePage = new GooglePage(driver);
        DBSteps.connection = DBConnectionFactory.getConnection();
    }

    @AfterSuite
    public void afterSuite1() {
        driver.quit();
    }

    @AfterSuite
    public void afterSuite2() throws SQLException {
        DBSteps.connection.close();
    }
}
