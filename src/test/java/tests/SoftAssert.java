package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;
import utilities.TestBase;

public class SoftAssert extends TestBase {

    //1. “http://zero.webappsecurity.com/” Adresine gidin
    // 2. Sign in butonuna basin
    // 3. Login kutusuna “username” yazin
    // 4. Password kutusuna “password” yazin
    // 5. Sign in tusuna basin
    // 6. Online banking menusu icinde Pay Bills sayfasina gidin
    // 7. “Purchase Foreign Currency” tusuna basin
    // 8. “Currency” drop down menusunden Eurozone’u secin
    // 9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
    // 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
    // "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)",
    // "Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)",
    // "Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)",
    // "Thailand (baht)"

    @Test
    public void test01(){
        //1. “http://zero.webappsecurity.com/” Adresine gidin
        driver.get("http://zero.webappsecurity.com/");
        // 2. Sign in butonuna basin
        WebElement signIn=driver.findElement(By.xpath("//*[@id='signin_button']"));
        signIn.click();
        // 3. Login kutusuna “username” yazin
        WebElement loginKutusu=driver.findElement(By.xpath("//*[@id='user_login']"));
        loginKutusu.sendKeys("username");
        // 4. Password kutusuna “password” yazin
        WebElement password= driver.findElement(By.xpath("//*[@id='user_password']"));
        password.sendKeys("password");
        // 5. Sign in tusuna basin
        WebElement sıgnİn=driver.findElement(By.xpath("//*[@value='Sign in']"));
        sıgnİn.click();
        // 6. Online banking menusu icinde Pay Bills sayfasina gidin
        driver.navigate().back();
        WebElement onlineBanking=driver.findElement(By.xpath("//strong[text()='Online Banking']"));
        onlineBanking.click();
        WebElement payBills=driver.findElement(By.xpath("//*[@id='pay_bills_link']"));
        payBills.click();
        // 7. “Purchase Foreign Currency” tusuna basin
        WebElement purchaseForeign=driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']"));
        purchaseForeign.click();
        // 8. “Currency” drop down menusunden Eurozone’u secin
        WebElement ddm=driver.findElement(By.xpath("//*[@id='pc_currency']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Eurozone (euro)");
        // 9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        org.testng.asserts.SoftAssert softAssert=new org.testng.asserts.SoftAssert();
        String actualOption=select.getFirstSelectedOption().getText();
        String expectedOption="Eurozone (Euro)";
        softAssert.assertEquals(actualOption,expectedOption,"secilen optional uygun degil");
        // 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin

        // "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)",
        // "Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)",
        // "Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)",
        // "Thailand (baht)"
    }
}
