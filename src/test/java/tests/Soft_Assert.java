package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class Soft_Assert extends TestBase {

    @Test
    public void softAssert(){

        SoftAssert softAssert = new SoftAssert();

        //1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //2-title in Amazon içerdigini test edin
        String expectedTitle="Amazon";
        String actualTitle=driver.getTitle();
        softAssert.assertTrue(actualTitle.contains(expectedTitle));

        //3-arama kutusunun erişilebilir oldugunu tets edin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(),"arama kutusuna erisilemiyor");

        //4-arama kutusuna Nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //5-arama yapıldıgını test edin
        WebElement aramaYapılır=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(aramaYapılır.isEnabled(),"arama yapilamadi");

        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(aramaYapılır.getText().contains("Nutella"));
        softAssert.assertAll();

        softAssert.assertAll();

        /*
        Softassert un hata bulsa bile calısmaya devam etme ozelligi assertAll a kadardır.
        eger assertAll da failed rapor edilirse calısma durur ve claassın kalan kısmı calıstırılmaz
        Yani assertAll HardAssert deki herbir assert gibidir.
        Hatayi yakalarsa calısma durur.
        */

        System.out.println("assertionlardan fail olan olursa burasi calismaz");

    }
}
