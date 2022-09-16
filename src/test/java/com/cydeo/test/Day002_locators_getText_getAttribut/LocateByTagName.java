package com.cydeo.test.Day002_locators_getText_getAttribut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocateByTagName extends BaseTest {

    public static void main(String[] args) {

        String url = "https://practice.cydeo.com/";
        String expText = "Test Automation Practice";
        setUp(url);

        WebElement textTag = driver.findElement(By.tagName("h1"));
        String actTagTxt =  textTag.getText();
       if(expText.equals(actTagTxt)){
           System.out.println("PASSED");
       }else {
           System.out.println("FAILED");
       }
       tearDown();
    }
}
