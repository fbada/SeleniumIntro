package com.cydeo.test.Day010_JavaFaker.CRMNextBAse.pages;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Driver002;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class UserProfile {

    private WebDriver driver;

    public UserProfile(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id ='user-name']")
    private WebElement profileIcon;

    @FindBy(xpath = "//span[@class='menu-popup-item-text'][text()='My Profile']")
    private  WebElement myProfileOption;

    @FindBy(xpath = "//a[@class ='profile-menu-name']")
    private WebElement userVerifiction;

    @FindAll({@FindBy(xpath = "//div[@id='profile-menu-filter']/a")})
    private List<WebElement>Tabs;

    public void get_to_profilePage(){
        profileIcon.click();
        BrowserUtils.wait(1);
        myProfileOption.click();
    }

    public void checkTab_Content(){
        get_to_profilePage();
        String act = "";
        for(WebElement each : Tabs){
            act += each.getText()+" ";
        }
        String exp = "General Drive Tasks Calendar Conversations";
        Assert.assertEquals(act.trim(), exp);
    }

}
