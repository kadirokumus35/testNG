package tests.pagages1;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {

    BrcPage brcPage;

    @Test
    public void positiveLogin() throws InterruptedException {
        brcPage = new BrcPage();
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        Thread.sleep(3000);
        brcPage.ilkLogin.click();
        //  test data valid user email
        brcPage.eMailAdress.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        //  test data valid password
        brcPage.password.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        //  login butonuna tiklayin
        brcPage.ikinciLogin.click();

        String actualUserName = brcPage.kullaniciProfil.getText();
        String expectedUserName = ConfigReader.getProperty("brcValidUserName");
        Assert.assertEquals(actualUserName,expectedUserName);

        Driver.closeDriver();

    }
}
