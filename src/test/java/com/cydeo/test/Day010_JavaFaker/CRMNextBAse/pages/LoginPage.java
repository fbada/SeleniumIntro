package com.cydeo.test.Day010_JavaFaker.CRMNextBAse.pages;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Driver002;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@class='errortext']")
    private WebElement errorMsg;

    @FindBy(xpath = "//span[contains(text(),'Activity Stream')][@class='menu-item-link-text']")
    private WebElement ActivityStreamBtn;

    public void Login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("crmNextBase"));
        userName.sendKeys(ConfigurationReader.getProperty("CRMuser"));
        passwordField.sendKeys(ConfigurationReader.getProperty("CRMpswd"));
        loginBtn.click();
        BrowserUtils.wait(2);
        Assert.assertTrue(ActivityStreamBtn.isDisplayed());

    }

    public void invalidLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("crmNextBase"));
        userName.sendKeys("noValid");
        passwordField.sendKeys("noclue");
        loginBtn.click();
        BrowserUtils.wait(1);
        Assert.assertTrue(errorMsg.isDisplayed());
    }

    public void Login(String user, String pswd){
        Driver.getDriver().get(ConfigurationReader.getProperty("crmNextBase"));
        userName.sendKeys(user);
        passwordField.sendKeys(pswd);
        loginBtn.click();
        BrowserUtils.wait(1);
        Assert.assertTrue(ActivityStreamBtn.isDisplayed());
    }

}
