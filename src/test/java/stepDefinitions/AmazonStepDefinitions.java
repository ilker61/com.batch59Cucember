package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici ana sayfasinda")
    public void kullanici_ana_sayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("sonuclarin Nutella icerdigini kontrol eder")
    public void sonuclarin_nutella_icerdigini_kontrol_eder() {
        String arananKelime="Nutella";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @Then("sonuc sayisinin {int} den fazla oldugunu teste eder")
    public void sonucSayisininDenFazlaOldugunuTesteEder(int sonucSayisi) {

        String str=amazonPage.aramaSonucElementi.getText();
        int ilkSpace= str.indexOf(" ");
        int ikinciSpace= str.indexOf(" ", ilkSpace+1);
        int ucuncuSpace= str.indexOf(" ", ikinciSpace+1);

        String sonuc=str.substring(ikinciSpace+1, ucuncuSpace);
        int sonucInt= Integer.valueOf(sonuc);
        Assert.assertTrue(sonucInt>sonucSayisi);
    }

    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }
    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String arananKelime1="Java";
        String actualAramaSonucStr1=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr1.contains(arananKelime1));
    }

    @When("kullanici iphone icin arama yapar")
    public void kullanici_iphone_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }

    @When("sonuclarin iphone icerdigini test eder")
    public void sonuclarin_iphone_icerdigini_test_eder() {
        String arananKelime1="iphone";
        String actualAramaSonucStr1=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr1.contains(arananKelime1));
    }

    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);
    }

    @Given("sonuclarin {string} icerdigini kontrol eder")

    public void sonuclarin_icerdigini_kontrol_eder(String istenenKelime) {
        String arananKelime=istenenKelime;
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));
    }

    @And("url'nin {string} icerdigini test eder")
    public void urlNinIcerdiginiTestEder(String istenenKelime) {
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(istenenKelime));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
