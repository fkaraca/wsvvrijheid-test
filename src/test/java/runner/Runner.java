package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",
                "pretty","html:target/default-cucumber-report",
                "rerun:target/failed.txt",
                "pretty","junit:target/cucumber-reports/Cucumber.xml"},


        features = "src/test/resources/UI_Features" ,
        glue = "src/test/java/stepdefinitions",
        //tags = "@Activities",
        dryRun = false

)

public class Runner {


}
