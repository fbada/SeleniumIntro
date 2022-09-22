package com.cydeo.test.TestNG_001;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login001 {


    @Test (dataProvider =  "logInData")
    public void logIn(String email, String password){
        System.out.println("Log In Credentials: " + "\n" +
                "  Email = " + email + "\n" +
                "  Password = " + password );
    }

    @DataProvider
    public Object [][] logInData(){
        Object [][] data = new Object[2][9];
        data[0][0] = "hr10@cydeo.com";
        data[0][1] = "UserUser";

        data[1][0] = "helpdesk10@cydeo.com";
        data[1][1] = "UserUser";

        data[2][0] = "marketing10@cydeo.com";
        data[2][1] = "UserUser";

        data[3][0] = "hr11@cydeo.com";
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
