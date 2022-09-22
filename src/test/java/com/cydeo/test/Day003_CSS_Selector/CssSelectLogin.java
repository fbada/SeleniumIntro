package com.cydeo.test.Day003_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CssSelectLogin {

    @Test
    public static void loginCss() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[type='submit']"));

        String actText = loginBtn.getAttribute("value");
        String expText = "Log In";

        System.out.println("expText = " + expText);
        System.out.println("actText = " + actText);

         Assert.assertEquals(actText, expText,"Login Button Text verification Failed");

         driver.quit();

    }
}
