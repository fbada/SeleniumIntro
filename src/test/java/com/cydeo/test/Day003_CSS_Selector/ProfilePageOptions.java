package com.cydeo.test.Day003_CSS_Selector;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ProfilePageOptions {
@Test()
    public static void checkProfilePage() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbaseCRM.com");
        driver.manage().window().maximize();

        WebElement userField = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        userField.sendKeys("helpdesk52@cydeo.com" + Keys.ENTER);

        WebElement psdwField = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        psdwField.sendKeys("UserUser");

        // click the Login In button
        driver.findElement(By.cssSelector("input[class ='login-btn']")).click();

        //  The user should be able to click the user profile name, and a drop-down menu will appear.
        driver.findElement(By.xpath("//span[@id='user-name']")).click();

        //User should be able to click "My Profile" opiton
        driver.findElement(By.xpath("//span[.='My Profile']")).click();

        String actTitle = driver.getTitle();
        String expTitle = "Helpdesk52";

        if (actTitle.contains(expTitle)) {
            System.out.println("Correct Page");
        } else {
            System.out.println("Incorrect page.");
        }

        List<WebElement> list = driver.findElements(By.xpath("//*[@id='profile-menu-filter']/a"));
        System.out.println("There are " + list.size() + " elements");

        String actTabs = "";
        for (WebElement eachTab : list) {
            actTabs += eachTab.getText() + " ";
        }

        System.out.println(actTabs);
        String expTabs = "General Drive Tasks Calendar Conversations";

        Assert.assertEquals(actTabs.trim(), expTabs,"My Profile page tabs verification FAILED" );
        driver.quit();
    }
}