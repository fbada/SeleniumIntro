package com.cydeo.test.Day005_DropDownTestNG;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task004 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void test1() {
        // test for the avaliable options
        // specific ones selected
        // default option -> .currentSelectedOption(); return WebElement
        driver.get("https://practice.cydeo.com/dropdown");
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select selectInitial = new Select(dropdown);
        Assert.assertEquals(selectInitial.getFirstSelectedOption().getText(),"Please select an option");
    }
        @Test(priority = 2)
        public void test2(){
            driver.get("https://practice.cydeo.com/dropdown");
           Select sel2 = new Select(driver.findElement(By.xpath("//select[@id='state']")));
           Assert.assertEquals(sel2.getFirstSelectedOption().getText(), "Select a State");
        }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
