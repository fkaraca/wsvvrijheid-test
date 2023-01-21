package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.SignInPage;
import utilities.ConfigReader;


public class SignUp {
    SignInPage signInPage = new SignInPage();

    @When("user clicks the SignIn button")
    public void user_click_the_sign_in_button() {
    signInPage.SignInButton.click();

    }

    @And("user clicks the SignUp button")
    public void userClickTheSignUpButton() {
        signInPage.SignUpButton.click();
    }


    @And("user enters the name")
    public void userEntersTheNameAs() {
        signInPage.SignUpname.sendKeys(ConfigReader.getProperty("signUpName"));
    }

    @And("user enters the userName")
    public void userEntersTheUserName() {
        signInPage.SignUpUsername.sendKeys(ConfigReader.getProperty("signUpUsername")+Keys.ENTER);
    }

    @And("user enters email")
    public void userEntersEmail() {
        signInPage.SignUpEmail.sendKeys(ConfigReader.getProperty("signUpEmail")+Keys.ENTER);
    }

    @And("user enters password")
    public void userEntersPassword() {
        signInPage.SignUpPassword.sendKeys(ConfigReader.getProperty("signUpPassword")+Keys.ENTER);
    }

    @Then("user clicks the Create Account button")
    public void userClicksTheTermCheckbox() {
        signInPage.CreateAccountButton.click();
    }
}
