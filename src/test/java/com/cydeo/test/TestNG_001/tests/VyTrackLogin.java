package com.cydeo.test.TestNG_001.tests;

import com.cydeo.test.TestNG_001.DataSet.UserCreds;
import com.cydeo.test.TestNG_001.pages.VyTrackLoginPage;
import com.cydeo.Utilities.*;
import org.testng.annotations.Test;

public class VyTrackLogin extends TestBase {

   @Test(dataProviderClass = UserCreds.class, dataProvider = "UserCredAll")
    public void check_pos_login(String usr, String pswd){
        VyTrackLoginPage login = new VyTrackLoginPage();
        login.login_Base(usr, pswd);
    }
    @Test
    public void check_Neg_login(){
        VyTrackLoginPage login = new VyTrackLoginPage();
        login.login_Invalid("no", "clue");
    }
}
