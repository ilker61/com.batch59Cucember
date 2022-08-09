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
    public WebElement singIn;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;





}
