package com.cydeo.test.Day002_locators_getText_getAttribut.PracticeInClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AppleGoogle extends BaseTest{

    public static void main(String[] args) {

        setUp("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple"+Keys.ENTER);

    //    driver.findElement(By.name("btnK")).click();

        WebElement appleLink = driver.findElement(By.partialLinkText("Apple"));

        String actLink = appleLink.getText();

        if(actLink.startsWith("Apple")){
            System.out.println("Apple search validation PASSED");
        }else {
            System.out.println("Apple search validation FAILED");
        }

        tearDown();

    }
}
