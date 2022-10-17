package com.cydeo.test.Day010_JavaFaker;

import com.cydeo.Utilities.BaseTest;
import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Driver002;
import com.cydeo.Utilities.TestBase;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.Test;

public class SingletonDriver extends TestBase {


    @Test(priority = 1)
    public void googleTitle() {
        Driver002.getDriver().get("https://google.com");
        SessionId s = ((RemoteWebDriver) Driver002.getDriver()).getSessionId();
        System.out.println(s);
    }

    @Test(priority = 2)
    public void yahooTitle() {
        Driver002.getDriver().get("https://yahoo.com");
        SessionId s = ((RemoteWebDriver) Driver002.getDriver()).getSessionId();
        System.out.println(s);
    }

    @Test(priority = 3)
    public void etsyTitle() {
        Driver002.getDriver().get("https://etsy.com");
        SessionId s = ((RemoteWebDriver) Driver002.getDriver()).getSessionId();
        System.out.println(s);
    }
}