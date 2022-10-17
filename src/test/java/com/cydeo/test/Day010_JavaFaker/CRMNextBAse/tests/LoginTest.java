package com.cydeo.test.Day010_JavaFaker.CRMNextBAse.tests;

import com.cydeo.Utilities.TestBase;
import com.cydeo.test.Day010_JavaFaker.CRMNextBAse.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void valid_login(){
        LoginPage loginPage = new LoginPage();
        loginPage.Login();
    }

    @Test
    public void invalid_login(){
        LoginPage loginPage = new LoginPage();
        loginPage.invalidLogin();
    }
}
