package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

import static utilities.Driver.driver;

public class OpenWebsite {

    @Given("Opening wsvvrijheid web site")
    public void opening_samen_web_site(){
        Driver.getDriver().get(ConfigReader.getProperty("wsvvrijheidUrl"));
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

    }

}
