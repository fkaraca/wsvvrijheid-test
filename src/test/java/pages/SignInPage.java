package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {
    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

        @FindBy(xpath = "//a[@href='/login']")
        public WebElement SignInButton;

        @FindBy(xpath = "//a[@href='/register']")
        public WebElement SignUpButton;

        @FindBy(id="name")
        public WebElement SignUpname;

        @FindBy(id="username")
        public WebElement SignUpUsername;

        @FindBy(id="email")
        public WebElement SignUpEmail;

         @FindBy(id="password")
         public WebElement SignUpPassword;

        @FindBy(xpath = "//button[@type='submit']")
         public WebElement CreateAccountButton;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement SignIntoAccountButton;

        @FindBy(id="menu-button-:rh:")
        public WebElement ConfirmSignIn;




    }


