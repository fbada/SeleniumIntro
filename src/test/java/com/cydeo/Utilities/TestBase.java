package com.cydeo.Utilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public abstract class TestBase {

    @AfterClass
    public static  void tearDown(){
        Driver.closeDriver();
    }
}
