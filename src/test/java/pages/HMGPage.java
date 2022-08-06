package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMGPage {
    public HMGPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[@id=\"UserName\"]")
    public WebElement usernameKutusu;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@id=\"btnSubmit\"]")
    public WebElement loginButonu2;

    @FindBy(id = "menuHotels")
    public WebElement hotelManagement;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelList;

    @FindBy(xpath = "(//span[@class='hidden-480']")
    public WebElement addHotel;

    @FindBy(xpath = "(//input[@name='code']")
    public WebElement codeKutusu;

    @FindBy(xpath = "(//button[@id='btnSubmit']")
    public WebElement saveButonu;

    @FindBy(xpath = "(//select[@class='form-control input-lg required']")
    public WebElement ddm;


}
