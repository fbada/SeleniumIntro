package com.cydeo.test.Day005_DropDownTestNG;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task002 {

    WebDriver driver = WebDriverFactory.getDriver("chrome");

/*
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking. USE
 */
    @BeforeClass
    public void setup(){
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test(priority = 2)
    public void verifyDeleteNotDisplayed(){
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        WebElement delButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        Assert.assertEquals(delButton.isDisplayed(), true,"Delete button is NOT displayed." );
        delButton.click();

        try {
           Assert.assertFalse(delButton.isDisplayed());
        }catch (StaleElementReferenceException e ){
            System.out.println("StaleElementReferenceException for Delete Button; This is expected" +
                    "\nas this cannot be displayed since it is NOT there anymore.");
        }
    }

    @Test(priority=1)
    public void verifyDeleteDisplayed() {
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        WebElement delButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        Assert.assertEquals(delButton.isDisplayed(), true, "Delete button is NOT displayed.");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
