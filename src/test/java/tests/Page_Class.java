package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class Page_Class {

    @Test
    public void test01(){
        FacebookPage facebookPage=new FacebookPage();

        Driver.getDriver().get("https://www.facebook.com");

        Faker faker=new Faker();

    }
}
