package utitlies;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;

    @BeforeMethod(groups = {"smoke","regression"})
    public void beforeMethod(){
        System.out.println("Before method");
        driver=Driver.driver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod(groups = {"smoke","regression"})
    public void afterMethod(){
        System.out.println("After method");
        driver.quit();
    }
}
