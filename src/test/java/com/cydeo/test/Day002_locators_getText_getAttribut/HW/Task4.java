package com.cydeo.test.Day002_locators_getText_getAttribut.HW;

import com.google.common.base.Verify;
import org.openqa.selenium.By;

public class Task4 extends BaseTest{

//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/inputs
//3- Click to “Home” link
//4- Verify title is as expected:
//    Expected: Practice
//    PS: Locate “Home” link using “className” locator

    public static void main(String[] args) {
        setUp("https://practice.cydeo.com/inputs");
        //3- Click to “Home” link
        driver.findElement(By.className("nav-link")).click();
        //4- Verify title is as expected:
        String actTitle = driver.getTitle();
        String expTitle = "Practice";

        if(actTitle.equals(expTitle)){
            System.out.println("Title Verification PASSED");
        }else {
            System.out.println("Title Verification FAILED");
        }
        tearDown();
//    Expected: Practice
    }
}
