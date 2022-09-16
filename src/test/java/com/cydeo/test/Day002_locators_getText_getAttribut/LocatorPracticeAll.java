package com.cydeo.test.Day002_locators_getText_getAttribut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorPracticeAll extends BaseTest {
    public static void main(String[] args) {

        setUp("https://app.vytrack.com/user/login");

        WebElement usrField = driver.findElement(By.id("prependedInput"));
        usrField.sendKeys("abcd");

        WebElement pswdField = driver.findElement(By.id("prependedInput2"));
        pswdField.sendKeys("abcd");

        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        WebElement checkTextLogFail = driver.findElement(By.className("alert-error"));
        String actText = checkTextLogFail.getText();
        String expText = "Invalid user name or password.";

        if(expText.equals(actText)){
            System.out.println("Invalid credential test PASSED");
        }else{
            System.out.println("Invalid credential test FAILED");
        }

        String URL =  driver.getCurrentUrl();
        String contains = "vytrack";

        if(URL.contains(contains)){
            System.out.println("Url test verification PASSED");
        }else {
            System.out.println("Url verification FAILED");

           driver.findElement(By.partialLinkText("Forgot your")).click();

           String actTitle =  driver.getTitle();
           String expTitle = "Forgot Password";

           if(expText.equals(actText)){
               System.out.println("Title is verified!");
           }else{
               System.out.println("FAILED!!");
           }
        }
        tearDown();
    }
}
