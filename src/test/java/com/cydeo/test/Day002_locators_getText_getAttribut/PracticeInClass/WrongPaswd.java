package com.cydeo.test.Day002_locators_getText_getAttribut.PracticeInClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WrongPaswd  extends  BaseTest {

    public static void main(String[] args) {
//        1. Open Chrome browser
//        2. Go to http://library2.cydeo.com/login.html
        setUp("http://library2.cydeo.com/login.html");

//        3. Enter username: “incorrect@email.com”
        WebElement emailField = driver.findElement(By.id("inputEmail"));
        emailField.sendKeys("incorrect@email.com");

//        4. Enter password: “incorrect password”
        WebElement pswdField = driver.findElement(By.id("inputPassword"));
        pswdField.sendKeys("incorrect password");
        driver.findElement(By.tagName("button")).click();

//        5. Verify: visually “Sorry, Wrong Email or Password”
//        displayed

    }
}