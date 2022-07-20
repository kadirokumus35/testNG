package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ConfigReader_facebook {

    @Test
    public void test01 (){
        FacebookPage facebookPage=new FacebookPage();

        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        facebookPage.eMail.sendKeys(ConfigReader.getProperty("fbWrongUsername"));

        facebookPage.sifre.sendKeys(ConfigReader.getProperty("fbWrongPassword"));

        facebookPage.giris.click();

        Assert.assertTrue(facebookPage.girilemedi.isDisplayed());

        Driver.closeDriver();
    }
}
