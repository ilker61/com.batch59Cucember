package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HMGPage;
import utilities.ConfigReader;

public class HMCStepDefinitions {

    HMGPage hmgPage=new HMGPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        hmgPage.loginButonu.click();
    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        hmgPage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        hmgPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmgPage.loginButonu2.click();

    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hmgPage.hotelManagement.isDisplayed());

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmgPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(hmgPage.loginButonu2.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmgPage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }


    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        hmgPage.usernameKutusu.sendKeys(username);
    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        hmgPage.passwordKutusu.sendKeys(password);
    }
}
