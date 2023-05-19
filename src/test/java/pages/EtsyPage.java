package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utitlies.Driver;

public class EtsyPage {

    public EtsyPage(){
        WebDriver driver= Driver.driver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;

}
