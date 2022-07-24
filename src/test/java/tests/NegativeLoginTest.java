package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

    BrcPage brcPage=new BrcPage();

    @Test
    public void yanlisSifre() throws InterruptedException {
    //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
    //      login butonuna bas
         brcPage.ilkLogin.click();
    //  test data valid email
        brcPage.eMailAdress.sendKeys(ConfigReader.getProperty("brcValidEmail"));
    //  test data wrong password
        brcPage.password.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
    //  login butonuna tiklayin
        brcPage.ikinciLogin.click();
    //  Degerleri girilemedigini sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());

        Driver.closeDriver();
    }
    @Test
    public void yanlisKullanici() throws InterruptedException {

        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage.ilkLogin.click();
        //  test data wrong email
        brcPage.eMailAdress.sendKeys(ConfigReader.getProperty("brcWrongdEmail"));
        //  test data wrong password
        brcPage.password.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        //  login butonuna tiklayin
        brcPage.ikinciLogin.click();
        //  Degerleri girilemedigini sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());
        Driver.closeDriver();

    }
    @Test
    public void yanlisSifreVeKullanici(){
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage.ilkLogin.click();
        //  test data wrong email
        brcPage.eMailAdress.sendKeys(ConfigReader.getProperty("brcWrongdEmail"));
        //  test data wrong password
        brcPage.password.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        //  login butonuna tiklayin
        brcPage.ikinciLogin.click();
        //  Degerleri girilemedigini sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());
        Driver.closeDriver();
    }

}
