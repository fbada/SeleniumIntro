package com.cydeo.test.TestNG_001.pages;

import com.cydeo.Utilities.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static com.cydeo.Utilities.BrowserUtils.POM_navigate_toMethod;

public class VyTrackLoginPage  {

   public VyTrackLoginPage(){

       PageFactory.initElements(Driver.getDriver(), this);
   }

    @FindBy (xpath = "//input[@id ='prependedInput']")
    public WebElement email;

    @FindBy(id = "prependedInput2")
    public  WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class ='alert alert-error']")
    public WebElement errorMsg;

    @FindBy(xpath = "//i[@title='Get help']")
    public WebElement getHelpBtn;

public void login_ValidTest(){
   Driver.getDriver().get(ConfigurationReader.getProperty("envt3"));
   email.sendKeys(ConfigurationReader.getProperty("username"));
   password.sendKeys(ConfigurationReader.getProperty("password"));
   submitButton.click();
    BrowserUtils.wait(2);
   Assert.assertTrue(getHelpBtn.isDisplayed());

}

public void login_Base(String usr, String pswd) {
    Driver.getDriver().get(ConfigurationReader.getProperty("envt3"));
    email.sendKeys(usr);
    password.sendKeys(pswd);
    submitButton.click();
    BrowserUtils.wait(2);
    Assert.assertTrue(getHelpBtn.isDisplayed());
    Driver.closeDriver();
}

public void login_Invalid(String usr, String pswd){
    Driver.getDriver().get(ConfigurationReader.getProperty("envt3"));
        email.sendKeys(usr);
        password.sendKeys(pswd);
        submitButton.click();
        Assert.assertTrue(errorMsg.isDisplayed());
        Driver.closeDriver();
    }


}
