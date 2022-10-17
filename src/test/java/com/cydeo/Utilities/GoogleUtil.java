package com.cydeo.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class GoogleUtil {

    public static void googleSearch(WebDriver driver){

        driver.get(ConfigurationReader.getProperty("envt2"));
        WebElement searchbox = driver.findElement(By.name("q"));
        String search = ConfigurationReader.getProperty("search.google");
        searchbox.sendKeys(search + Keys.ENTER);
        BrowserUtils.wait(1);
        assertEquals(driver.getTitle(), search +" - Google Search");
    }
}
