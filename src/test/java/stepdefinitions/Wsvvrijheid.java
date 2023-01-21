package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.NgoMainPage;

import static utilities.Driver.driver;

public class Wsvvrijheid {
NgoMainPage mainPage=new NgoMainPage();

    @And("Open the wsvvrijheid Dropdown menu")
    public void openTheWsvvrijheidDropdownMenu() {
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//a[text()='Wsvvrijheid']"));
        actions.moveToElement(menuOption).perform();
    }
    @And("Click the Volunteers menu")
    public void clickTheVolunteersMenu() {
        mainPage.VolunteersDropdownMenu.click();

    }
    @And("Testing Volunteers page")
    public void testingLwsvvrijheidPage() {
        Assert.assertTrue(mainPage.VolunteersPage.isDisplayed());

    }

    @And("Click the About Us menu")
    public void clickTheAboutUsMenu() {
        mainPage.AboutUsDropdownMenu.click();

    }

    @And("Testing About Us page")
    public void testingAboutUsPage() {
        Assert.assertTrue(mainPage.AboutUsPage.isDisplayed());
    }

    @And("Click the Contact menu")
    public void clickTheContactMenu() {
        mainPage.ContactDropdownMenu.click();
    }

    @And("Testing Contact page")
    public void testingContactPage() {
        Assert.assertTrue(mainPage.ContactPage.isDisplayed());
    }


}
