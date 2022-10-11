package com.cydeo.test.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    public static void sleep(int second) throws InterruptedException {
        second *= 1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void wait(WebDriver driver, int second){
        driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }

    public static void switchWindowsVerifyTitle(WebDriver driver, String expTitle, String actTitle){

        Set<String> allWin = driver.getWindowHandles();
        for (String s : allWin) {
            driver.switchTo().window(s);
            System.out.println("Current URL: "+ driver.getTitle());

            if(driver.getTitle().contains(expTitle)){
                break;
            }
        }
    }

    public static void verifyTitle(WebDriver driver, String expTitle){
        Assert.assertEquals(driver.getTitle(), expTitle);
    }
}
