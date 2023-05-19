package utitlies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver driver(){
        String browserType=ConfigReader.getProperty("browser");
        if(driver==null || ((RemoteWebDriver)driver).getSessionId()==null){
            System.out.println("Setting up a driver...");
            if(browserType.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
        }
        return driver;
    }

    public static void main(String[] args) {
        System.out.println( Driver.driver().hashCode());
        System.out.println( Driver.driver().hashCode());
        System.out.println( Driver.driver().hashCode());
    }

}
