package com.cydeo.test.TestNG_001.DataSet;

import org.testng.annotations.DataProvider;

public class UserCreds {

    @DataProvider(name = "UserCredAll")
    public Object[][] testData() {
        return new Object[][]{
                {"storemanager63", "UserUser123"},
                {"storemanager64", "UserUser123"},
                {"storemanager65", "UserUser123"},
                {"salesmanager113", "UserUser123"},
                {"salesmanager114", "UserUser123"},
                {"salesmanager115", "UserUser123"},
                {"user19", "UserUser123"},
                {"user20", "UserUser123"},
                {"user21", "UserUser123"},
                {"user22", "UserUser123"}
        };
    }
}
