package pages;

import base_class.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseClass {


    @FindBy(linkText = "Talent Intelligence") public WebElement talentIntelligenceLnk;

    @FindBy(linkText = "Overview") public WebElement overviewLnk;

    public MainPage(){
        PageFactory.initElements(driver,this);
    }



}
