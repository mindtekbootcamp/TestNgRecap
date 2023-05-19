package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.*;
import pages.EtsyPage;
import utitlies.TestBase;

public class test3 extends TestBase {

    @Test(groups = {"regression"})
    public void test5(){
        System.out.println("Test 5");
        EtsyPage etsyPage=new EtsyPage();

        driver.get("https://www.etsy.com");
        etsyPage.searchBox.sendKeys("carpet"+ Keys.ENTER);
    }

}
