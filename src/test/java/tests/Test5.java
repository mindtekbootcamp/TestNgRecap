package tests;

import data.DataProvider1;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utitlies.TestBase;

import java.util.Random;
import java.util.UUID;

public class Test5 extends TestBase {


    @Test(dataProviderClass = DataProvider1.class, dataProvider = "creatingAccount")
    public void test7(String firstName, String lastName, String email, String password){
        // John doe
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        driver.findElement(By.id("firstname")).sendKeys(firstName);
        driver.findElement(By.id("lastname")).sendKeys(lastName);
        String uuid=UUID.randomUUID().toString().substring(0,5);
        System.out.println(uuid);
        // faker library -> generates random data (firstName, lastName, email, and etc...)
         driver.findElement(By.id("email_address")).sendKeys(uuid+email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("password-confirmation")).sendKeys(password);
        driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
        Assert.assertEquals(driver.getTitle(), "My Account");
    }

    @Test(dependsOnMethods = {"test7"})
    public void test8(){

    }

}
