package com.cydeo.test.Day002_locators_getText_getAttribut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocateByPartLnkTxt extends BaseTest {

    public static void main(String[] args) {
        setUp("https://www.google.com");

        WebElement partLinkTxt = driver.findElement(By.partialLinkText("Recovery Month"));
        String textFromLink =  partLinkTxt.getText();
        System.out.println(textFromLink);

        tearDown();
    }
}
