package com.cydeo.test.TestNG_001;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NextBaseCRMLogin {

    WebDriver driver;

   @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
@Test (dataProviderClass = SignIn.class, dataProvider = "signin-provider")

    public void signin(String username, String password) throws InterruptedException {

        driver.get("https://login1.nextbasecrm.com/");
        WebElement usrName = driver.findElement(By.xpath("//input[@name = 'USER_LOGIN']"));
        usrName.sendKeys(username);
        WebElement pswdField = driver.findElement(By.xpath("//input[@name = 'USER_PASSWORD']"));
        pswdField.sendKeys(password);

        driver.findElement(By.xpath("//input[@class ='login-btn']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       WebElement actElementChatCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']"));
      String actText= actElementChatCalls.getAttribute("title");
      String exptext = "Chat and Calls";

       Assert.assertEquals(actText, exptext," Login with valid credentials FAILED");

    }
    @AfterMethod
    public void tearDown(){
       driver.quit();
    }
}
