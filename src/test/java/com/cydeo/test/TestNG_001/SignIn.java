package com.cydeo.test.TestNG_001;

import org.testng.annotations.DataProvider;

public class SignIn {
    @DataProvider(name = "signin-provider")
    public Object[][] logInData() {
        return new Object[][]{
                {"hr87@cydeo.com", "UserUser"},
                {"helpdesk78@cydeo.com", "UserUser"}

    };
    }
}