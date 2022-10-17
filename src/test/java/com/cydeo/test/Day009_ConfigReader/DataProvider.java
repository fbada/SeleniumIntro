package com.cydeo.test.Day009_ConfigReader;

import com.cydeo.Utilities.BaseTest;
import com.cydeo.Utilities.GoogleUtil;
import org.testng.annotations.Test;

public class DataProvider extends BaseTest {

    @Test
    public static void testData(){

        GoogleUtil.googleSearch(driver);
    }
}
