package tests;

import org.junit.Test;
import utilities.Driver;

public class YeniDriver {

    @Test
    public void test01(){
        Driver.getDriver().get("https://www.amazon.com");
         /*
        Bugune kadar TestBase classına extends ederek kullandıgımız driver yerine bundan sonra
        Driver classından kullanacagımız getDriver static methodunu kullanacagız.

        Driver.getDriver()    in
        driver               out
        */
        Driver.closeDriver();
    }
}
