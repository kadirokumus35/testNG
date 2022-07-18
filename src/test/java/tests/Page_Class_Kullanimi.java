package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class Page_Class_Kullanimi {

    @Test
    public  void test01(){
        AmazonPage amazonPage=new AmazonPage();

        // nutella arayalim
        Driver.getDriver().get("https://www.amazon.com");
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        String actualResult=amazonPage.aramaKutusu.getText();
        String expectedResult="nutella";

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
