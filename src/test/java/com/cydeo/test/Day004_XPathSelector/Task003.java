package com.cydeo.test.Day004_XPathSelector;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Task003 {
    @Test
    public static void testButton1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/multiple_buttons");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[.='Button 1']")).click();
        WebElement textRes = driver.findElement(By.xpath("//p[@id='result']"));

        String actRes = textRes.getText();
        String expRes = "Clicked on button one!";

        assertEquals(actRes,expRes, "The result text does NOT match expected text");
        driver.quit();
    }
}
