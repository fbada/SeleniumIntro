package com.cydeo.test.Day002_locators_getText_getAttribut.HW;

import org.openqa.selenium.By;

public class Task3 extends BaseTest{

    public static void main(String[] args) {

//        TC #3: Back and forth navigation
//        1- Open a chrome browser
//        2- Go to: https://google.com
        setUp("https://google.com");
//        3- Click to Gmail from top right.
        driver.findElement(By.linkText("Gmail")).click();
//        4- Verify title contains: Expected: Gmail
        String actTitleText = driver.getTitle();
        String expTitleText = "Gmail";

        if(actTitleText.contains(expTitleText)){
            System.out.println("Gmail Title verification PASSED");
        }else {
            System.out.println("Gmail Title verification FAILED");
        }
//        5- Go back to Google by using the .back();
        driver.navigate().back();
//        6- Verify title equals: Expected: Google
            actTitleText = driver.getTitle();
            expTitleText = "Google";
        if(expTitleText.equals(actTitleText)){
            System.out.println("Google Title verification PASSED");
        }else {
            System.out.println("Google Title verification FAILED");
        }
    tearDown();
    }
}
