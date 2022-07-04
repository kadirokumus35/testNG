package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Before_and_After extends TestBase {

    //JUnit te @BeforeClass ve @AfterClass notasyonuna sahip methodlar static olmak zorundaydı
    // testNG bu zorunluluktan kurtarıyor bizi

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }
    @Test
    public void amazon(){
        driver.get("https://www.amazon.com");
    }
    @Test
    public void bestbuy(){
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void techproedu(){
        driver.get("https://www.techproeducation.com");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }
}
