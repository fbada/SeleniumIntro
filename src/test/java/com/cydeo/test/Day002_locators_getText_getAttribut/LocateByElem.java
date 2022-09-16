package com.cydeo.test.Day002_locators_getText_getAttribut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocateByElem extends BaseTest{
    public static void main(String[] args) {
        String url = "https://www.google.com";
       setUp(url);
        WebElement luckyTxt = driver.findElement(By.id("gbqfbb"));

        String text = luckyTxt.getAttribute("value");

        if(text.equals("I'm Feeling Lucky")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        tearDown();
    }

}
