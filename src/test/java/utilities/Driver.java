package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
     /*
       page object modelde driverimiz icin  TestBase classına extends etmek yerine
       Driver classından static methodlar kullanarak
       driver olusturulup ilgili ayarların yapilmasi
       ve ensonda driverin kapatilmasi tercih edilmistir

       POM de Driver Classındaki getDriver()in obj olusturarak kullanılmasını
       engellemek icin Singleton pattern kullanimi benimsenmistir

       Singleton Pattern : tekli kullanim, bir classın farkli classlardan
       obje olusturularak kullanimini engellemek icin kullanilir

       Bunu saglamak icin yapmamiz gereken sey oldukca basittir
       obje olusturmak icin kullanilan constructor i private yaptiginizda
       baska classlarda Driver classindan obje olusutrulmasi ile mumkundur
        */

    private Driver() {

    }

    static WebDriver driver;

    public  static WebDriver getDriver(){

        if(driver==null) {
            switch(ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "headless-edge": //
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver(new EdgeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null) {//driver a deger atanmis
            driver.close();
            driver = null;
        }
    }
}
