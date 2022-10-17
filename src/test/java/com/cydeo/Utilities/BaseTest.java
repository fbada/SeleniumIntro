package com.cydeo.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

  protected static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = Driver002.getDriver();
        driver.manage().window().maximize();
        BrowserUtils.wait(4);
    }

    @AfterMethod
    public void tearDown(){
       Driver.closeDriver();
    }
}
