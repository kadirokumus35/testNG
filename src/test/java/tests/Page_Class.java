package tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class Page_Class {

    @Test
    public void test01(){
        FacebookPage facebookPage=new FacebookPage();

        Driver.getDriver().get("https://www.facebook.com");

        Faker faker=new Faker();
        facebookPage.eMail.sendKeys(faker.internet().emailAddress());

        facebookPage.sifre.sendKeys(faker.internet().password());

        facebookPage.giris.click();

        Assert.assertTrue(facebookPage.girilemedi.isDisplayed());

        Driver.closeDriver();
    }
}
