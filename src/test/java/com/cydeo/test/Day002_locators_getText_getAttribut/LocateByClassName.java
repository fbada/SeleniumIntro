package com.cydeo.test.Day002_locators_getText_getAttribut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocateByClassName extends BaseTest{

    public static void main(String[] args) {
        String url = "https://www.google.com";
        setUp(url);

        WebElement helpFulText = driver.findElement(By.className("NKcBbd"));

        String expText = "Learn more about National Recovery Month";
        String actText = helpFulText.getText();
        if(actText.equals(expText)){
            System.out.println("Text appears correctly!");
        }else {
            System.out.println("Text is incorrect!");
        }

        tearDown();
    }


}
