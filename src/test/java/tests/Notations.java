package tests;

import org.testng.annotations.Test;
import utilities.TestBase;

public class Notations extends TestBase {

    @Test
    public  void amazon(){
        driver.get("https://amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void bestbuy(){
        driver.get("https://bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void techproeducation(){
        driver.get("https://techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}
