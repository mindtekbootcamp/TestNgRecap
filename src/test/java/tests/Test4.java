package tests;

import listeners.MyTestListener;
import listeners.RerunFailedTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utitlies.TestBase;

import java.util.List;

@Listeners(MyTestListener.class)
public class Test4 extends TestBase {

    @Test()
    public void test6(){
        driver.get("https://www.etsy.com/");
        String actualTitle=driver.getTitle();
        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyoe";
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle);

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("carpet"+ Keys.ENTER);

        List<WebElement> descriptions=driver.findElements(By.tagName("//h3"));

        for(int i=0; i<descriptions.size(); i++){
            softAssert.assertTrue(descriptions.get(i).getText().toLowerCase().contains("carpet"));
        }
        softAssert.assertAll();
    }

}
