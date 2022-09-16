package com.cydeo.test.Day002_locators_getText_getAttribut;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LocateByName extends BaseTest {

    public static void main(String[] args) {
String url = "https://www.google.com";
        setUp(url);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium"+ Keys.ENTER);

        tearDown();
    }


}
