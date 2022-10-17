package com.cydeo.test.Day003_CSS_Selector;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//        1- Open a chrome browser
//        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
//        3- Enter incorrect username into login box:
//        4- Click to `Reset password` button
//        5- Verify “error” label is as expected
//        Expected: Login or E-mail not found

public class Task5 {

    @Test()
    public static void checkResetPswdError() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("wrong@cydeo.com");
        driver.findElement(By.xpath("//button[@class='login-btn']")).click();
        String actText = driver.findElement(By.xpath("//div[@class='errortext']")).getText();
        String  expText = "Login or E-mail not found";

        System.out.println("expText = " + expText);
        System.out.println("actText = " + actText);

        Assert.assertEquals(actText, expText, "Error label text verification FAILED.");

        driver.quit();
    }
}
