package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import java.io.IOException;

public class ScreenShotReusableMethod {
    @Test
    public void test() throws IOException {
        //amazon sayfasina gidip fotografini cekelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethod.getScreenshot("amazon");
        Driver.closeDriver();
    }
}

