package com.cydeo.test.Day005_DropDownTestNG;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void verifyGoogleTitle(){
       driver.get("https://www.google.com");
        String expectTitle = "Google";
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle, expectTitle, "Title verification failed.");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
