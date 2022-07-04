package tests;

import org.testng.annotations.Test;
import utilities.TestBase;

public class Priority extends TestBase {

    //daefault sifir olarak alir kucukten buyuge sirali calisir
    @Test (priority=2)
    public void amazon(){
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void bestbuy(){
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test (priority=-3)
    public void techproedu(){
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}
