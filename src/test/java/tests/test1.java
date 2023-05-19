package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.*;
import pages.EtsyPage;
import utitlies.TestBase;

public class test1 extends TestBase {


    @Test(groups = {"smoke","regression"})
    public void testA(){
        System.out.println("test 2");
    }

    @Test(groups = {"smoke","regression"})
    public void testB(){
        System.out.println("test 2");
    }

    @Test(groups = {"smoke","regression"}, priority = 2)
    public void test1(){
        System.out.println("test 1");

        EtsyPage etsyPage=new EtsyPage();

        driver.get("https://www.etsy.com");
        etsyPage.searchBox.sendKeys("carpet"+ Keys.ENTER);
    }


}
