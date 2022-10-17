package com.cydeo.test.Day003_CSS_Selector;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResetPwsd {
@Test()
    public static void checkResetPswdText() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        driver.findElement(By.cssSelector("a[class='login-link-forgot-pass']")).click();

        String actText = driver.findElement(By.cssSelector("button[class='login-btn']")).getAttribute("value");
        String expText = "Reset password";

        Assert.assertEquals(actText, expText, "Reset password button verification FAILED");
        driver.quit();

    }
}
