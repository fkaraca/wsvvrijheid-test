package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SignInPage;

public class SignInToAccount {
    SignInPage signInPage = new SignInPage();

    @Then("user clicks the SignIn button for enter to account")
    public void user_clicks_the_sign_in_button_for_create_an_account() {
        signInPage.SignIntoAccountButton.click();


    }

    @And("Tests that the application is logged in")
    public void testsThatTheApplicationIsLoggedIn() {
        Assert.assertTrue(signInPage.ConfirmSignIn.isDisplayed());
    }
}
