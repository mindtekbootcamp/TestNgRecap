package utitlies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver2 {

    /*
    Singleton design pattern rules:
    1. Constructor should be private
    2. Create a .getInstance(); method that will instantiate object only once
    if it is instantiated already then it will return previous instance.
    3. Attributes should be private
     */
    private static WebDriver driver;

    private Driver2(){}

    public static WebDriver getInstance(){
        String browserType=ConfigReader.getProperty("browser");
        if(driver==null || ((RemoteWebDriver)driver).getSessionId()==null){
            System.out.println("Setting up driver...");
            if(browserType.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
        }
        return driver;
    }

    public static void main(String[] args) {
        System.out.println(Driver2.getInstance().hashCode());
        System.out.println(Driver2.getInstance().hashCode());
        System.out.println(Driver2.getInstance().hashCode());
    }

}
