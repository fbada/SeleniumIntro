package com.cydeo.Utilities;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class BrowserUtils {

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void verifyTitle(WebDriver driver, String expTitle){
        String exp = expTitle, act = driver.getTitle();
        assertEquals(exp,act);
    }

    public static void impWaiit(int sec){

        Driver.getDriver().manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }
    public static void POM_navigate_toMethod(String str){
        Driver.getDriver().get(str);
    }


}
