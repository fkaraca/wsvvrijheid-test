package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.NgoMainPage;

import static utilities.Driver.driver;

public class Platforms {
    NgoMainPage mainPage=new NgoMainPage();

    @And("Click the Platforms button")
    public void click_the_platforms_button() {
        mainPage.platformsButton.click();
    }

    @And("Testing Platforms page")
    public void testingPlatformsPage() {
        Assert.assertTrue(mainPage.platformsPage.isDisplayed());
    }

    @And("Open the Platforms Dropdown menu")
    public void openTheLotusVanDaMediaDropdownMenu() {

        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//a[@href=\"/platforms\"]"));
        actions.moveToElement(menuOption).perform();
    }


    @And("Click the Lotus van da media menu")
    public void clickTheLotusVanDaMediaMenu() {
        mainPage.LotusVanDeMediaDropdownMenu.click();
    }

    @And("Testing Lotus van da media page")
    public void testingLotusVanDaMediaPage() {
        Assert.assertTrue(mainPage.LotusVanDeMediaPage.isDisplayed());
    }


    @And("Click the Art station menu")
    public void clickTheArtStationMenu() {
        mainPage.ArtStationDropdownMenu.click();
    }

    @And("Testing Art station page")
    public void testingArtStationPage() {
        Assert.assertTrue(mainPage.ArtStationPage.isDisplayed());
    }

    @And("Click the Samenvvv menu")
    public void clickTheSamenvvvMenu() {
        mainPage.SamenvvvDropdownMenu.click();

    }

    @And("Testing Samenvvv page")
    public void testingSamenvvvPage() {
        Assert.assertTrue(mainPage.SamenvvvPage.isDisplayed());
    }

    @And("Click the Academy menu")
    public void clickTheAcademyMenu() {
        mainPage.AcademyDropdownMenu.click();
    }

    @And("Testing Academy page")
    public void testingAcademyPage() {
        Assert.assertTrue(mainPage.AcademyPage.isDisplayed());
    }
}
