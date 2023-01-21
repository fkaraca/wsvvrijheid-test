package stepdefinitions;
import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.NgoMainPage;

public class Activities {
    NgoMainPage mainPage = new NgoMainPage();

    @And("Click the Activities button")
    public void clickTheReadMoreButton() {
        mainPage.activitiesButton.click();
    }

    @And("Testing activities page")
    public void testingActivitiesPage() {
        Assert.assertTrue(mainPage.activitiesPage.isDisplayed());
    }
}
