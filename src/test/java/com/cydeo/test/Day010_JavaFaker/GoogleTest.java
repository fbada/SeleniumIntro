package com.cydeo.test.Day010_JavaFaker;

import com.cydeo.Utilities.TestBase;
import org.testng.annotations.Test;

public class GoogleTest extends TestBase{

    @Test
    public void testSearch(){
        GooglePage googlePage = new GooglePage();
        googlePage.searchGoogle("Panda");
    }
}
