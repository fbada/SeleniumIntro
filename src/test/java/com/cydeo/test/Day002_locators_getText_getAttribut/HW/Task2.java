package com.cydeo.test.Day002_locators_getText_getAttribut.HW;

import com.google.common.base.Verify;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task2 extends BaseTest{
    public static void main(String[] args) {
//        TC #2: Zero Bank header verification
//        1. Open Chrome browser
//        2. Go to http://zero.webappsecurity.com/login.html

        setUp("http://zero.webappsecurity.com/login.html");
        //        3. Verify header text
//        Expected: “Log in to ZeroBank”
        WebElement headerText = driver.findElement(By.tagName("h3"));
        String actHeaderText = headerText.getText();
        String expHeaderText = "Log in to ZeroBank";

        if(actHeaderText.equals(expHeaderText)){
            System.out.println("Header text verification PASSED");
        }else {
            System.out.println("Header text verification FAILED");
        }
        tearDown();
    }
}
