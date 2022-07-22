package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

    BrcPage brcPage=new BrcPage();

    @Test
    public void yanlisSifre(){

    // Bir test method olustur positiveLoginTest()


    //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
    //      login butonuna bas
         brcPage.ilkLogin.click();
    //  test data user email: customer@bluerentalcars.com ,
        brcPage.eMailAdress.sendKeys(ConfigReader.getProperty("brcValidEmail"));
    //  test data password : 54321
        brcPage.password.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
    //  login butonuna tiklayin
        brcPage.ikinciLogin.click();
    //  Degerleri girilemedigini sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());
        Driver.closeDriver();
    }

}
