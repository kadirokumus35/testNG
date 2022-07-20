package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath="//input[@type='text']")
    public WebElement eMail;

    @FindBy (xpath = "//input[@type='password']")
    public  WebElement sifre;

    @FindBy (xpath = "//button[@name='login']")
    public WebElement giris;

@FindBy (xpath = "//div[@class='_9ay7']")
    public WebElement girilemedi;
}
