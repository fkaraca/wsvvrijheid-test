package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NgoMainPage {
    public NgoMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath ="//a[text()='Activities']")
    public WebElement activitiesButton;

    @FindBy(xpath ="//h2[@class='chakra-heading css-31o478']")
    public WebElement activitiesPage;
    @FindBy(className="//a[normalize-space()='Platforms']") public WebElement email;

    @FindBy(xpath ="//a[@href=\"/platforms\"]")
    public WebElement platformsButton;

    @FindBy(xpath ="//h2[normalize-space()='Platforms']")
    public WebElement platformsPage;

    @FindBy(xpath ="//a[text()='Lotus van de Media']")
    public WebElement LotusVanDeMediaDropdownMenu;
    @FindBy(xpath = "//h1[@class=\"chakra-heading css-1h0o8f6\"]")
    public WebElement LotusVanDeMediaPage;

    @FindBy(xpath = "//a[text()='Art Station']")
    public WebElement ArtStationDropdownMenu;
    @FindBy(xpath="//h1[text()='Art Station']")
    public WebElement ArtStationPage;

    @FindBy(xpath = "//a[text()='Samenvvv']")
    public WebElement SamenvvvDropdownMenu;
    @FindBy(xpath="//h1[text()='Together for Freedom and Connection']")
    public WebElement SamenvvvPage;

    @FindBy(xpath = "//a[text()='Academy']")
    public WebElement AcademyDropdownMenu;
    @FindBy(xpath="//h1[text()='Wees Academy']")
    public WebElement AcademyPage;

//    @FindBy(xpath="//a[text()='Wsvvrijheid']")
//    public WebElement WsvvrijheidButton;

    @FindBy(xpath="//a[text()='Volunteers']")
    public WebElement VolunteersDropdownMenu;
    @FindBy(xpath ="//button[@type='button']")
    public WebElement VolunteersPage;

    @FindBy(xpath="//a[text()='About Us']")
    public WebElement AboutUsDropdownMenu;
    @FindBy(xpath="//h2[text()='About Us']")
    public WebElement AboutUsPage;

    @FindBy(xpath="//a[@href='/contact']")
    public WebElement ContactDropdownMenu;
    @FindBy(xpath="//h2[text()='Contact']")
    public WebElement ContactPage;














//



}
