package com.cydeo.test.Day002_locators_getText_getAttribut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocateByLinkTxt extends BaseTest {

    public static void main(String[] args) {

        setUp("https://www.google.com");

        WebElement linkTxtAbout = driver.findElement(By.linkText("About"));
        linkTxtAbout.click();

        tearDown();

    }
}
