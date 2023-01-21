package stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

import static utilities.Driver.driver;

public class Hooks {
        // TestNG'deki @BeforeMethod gibi çalışır.
        // Her senaryodan önce çalışır.
        @Before
        public void setUp(){
            System.out.println("setUp calisti.");

            Driver.getDriver().get(ConfigReader.getProperty("wsvvrijheidUrl"));
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        }
        // TestNG'deki @AfterMethod gibi çalışır.
        // Her senaryodan sonra çalışır.
        @After
        public void tearDown(Scenario scenario){
            System.out.println("tearDown calisti.");
           // driver.close();
            // ekran görüntüsü almak için bu sabit kodu kullanabiliriz.
            //final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            // eğer senaryonun sonucu FAILED ise(başarısızsa) ekran görüntüsünü rapora ekleyebilirsin.
//            if(scenario.isFailed()){
//                scenario.embed(screenshot , "image/png");
//            }
            // Driver.closeDriver();
        }
    }


