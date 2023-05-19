package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.EtsyPage;
import utitlies.TestBase;

public class test2 extends TestBase {


    @Test(groups = {"regression"})
    public void test3(){
        System.out.println("Test 3");
        EtsyPage etsyPage=new EtsyPage();

        driver.get("https://www.etsy.com");
        etsyPage.searchBox.sendKeys("carpet"+ Keys.ENTER);
    }

    @Test(groups = {"smoke","regression"})
    public void test4(){
        System.out.println("Test 4");
    }
}
