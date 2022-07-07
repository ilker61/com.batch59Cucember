package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {

    DataTablesPage dataTablesPage=new DataTablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
    dataTablesPage.newButtonu.click();

    }
    @Then("firstname bolumune {string} yazar")
    public void firstname_bolumune_yazar(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);

    }
    @Then("lastname bolumune {string} yazar")
    public void lastname_bolumune_yazar(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);

    }
    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        dataTablesPage.position.sendKeys(position);
    }
    @Then("office bolumune {string} yazar")
    public void office_bolumune_yazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }
    @Then("extencion bolumune {string} yazar")
    public void extencion_bolumune_yazar(String extencion) {
        dataTablesPage.extention.sendKeys(extencion);
    }
    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
    }
    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.createButton.click();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);
    }

    @Then("isim bolumunde {string} olustugunu kontrol eder")
    public void isimBolumundeOlustugunuKontrolEder(String firstname) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstname));
    }
}
