package com.cydeo.test.TestNG_001;

import org.testng.annotations.DataProvider;

public class SignIn {

    @DataProvider(name = "signin-provider")
    public Object[][] logInData() {

        Object[][] data = new Object[9][2];
        data[0][0] = "hr36@cydeo.com";
        data[0][1] = "UserUser";

        data[1][0] = "helpdesk37@cydeo.com";
        data[1][1] = "UserUser";

        data[2][0] = "marketing35@cydeo.com";
        data[2][1] = "UserUser";

        data[3][0] = "hr67@cydeo.com";
        data[3][1] = "UserUser";

        data[4][0] = "helpdesk11@cydeo.com";
        data[4][1] = "UserUser";

        data[5][0] = "marketing11@cydeo.com";
        data[5][1] = "UserUser";

        data[6][0] = "hr12@cydeo.com";
        data[6][1] = "UserUser";

        data[7][0] = "helpdesk12@cydeo.com";
        data[7][1] = "UserUser";

        data[8][0] = "marketing12@cydeo.com";
        data[8][1] = "UserUser";
        return data;
    }
}