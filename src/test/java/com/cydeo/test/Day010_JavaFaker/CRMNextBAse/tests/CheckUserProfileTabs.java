package com.cydeo.test.Day010_JavaFaker.CRMNextBAse.tests;

import com.cydeo.Utilities.TestBase;
import com.cydeo.test.Day010_JavaFaker.CRMNextBAse.pages.LoginPage;
import com.cydeo.test.Day010_JavaFaker.CRMNextBAse.pages.UserProfile;
import org.testng.annotations.Test;

public class CheckUserProfileTabs extends TestBase {

    @Test
    public void check_UserProfile_Tabs(){
        LoginPage loginPage = new LoginPage();
        loginPage.Login();
        UserProfile userProfile = new UserProfile();
        userProfile.checkTab_Content();
    }
}
