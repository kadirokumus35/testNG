package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

   public BrcPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement ilkLogin;

   @FindBy (xpath = "//input[@id='formBasicEmail']")
   public WebElement eMailAdress;

   @FindBy (xpath = "//input[@id='formBasicPassword']")
public  WebElement password;

   @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement ikinciLogin;

   @FindBy (xpath = "//button[@id='dropdown-basic-button']")
    public WebElement kullaniciProfil;


}
