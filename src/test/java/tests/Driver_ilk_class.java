package tests;

import org.testng.annotations.Test;
import utilities.Driver;

public class Driver_ilk_class {

    @Test
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");
     /*
        Bugune kadar TestBase classına extends ederek kullandıgımız driver yerine bundan sonra
        Driver classından kullanacagımız getDriver static methodunu kullanacagız.

        Driver.getDriver()    in
        driver               out
        */
        Driver.closeDriver();
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.facebook.com");

        Driver.closeDriver();
    }
}

