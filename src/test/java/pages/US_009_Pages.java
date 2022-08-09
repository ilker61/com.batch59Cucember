package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_009_Pages {

    public US_009_Pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(xpath = "//a[@id='login-item']/span")
    public WebElement firstSingIn;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']/span")
    public WebElement SecondSignIn;

    @FindBy(xpath = "//li[@id='entity-menu']/a/span")
    public WebElement MyPages;

    @FindBy(xpath = "//a[@class='dropdown-item']/span")
    public WebElement searchPatient;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patientSsnSearchBox;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[2]/span")
    public WebElement edit;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement birtDate;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement gender;

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement bloodGroup;

    @FindBy(xpath = "//input[@name='adress']")
    public WebElement adress;

    @FindBy(xpath = "//textarea[@id='patient-description']")
    public WebElement description;

    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement user;

    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement country;

    @FindBy(xpath = "//button[@id='save-entity']/span")
    public WebElement saveButton;


















}
