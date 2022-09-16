package com.cydeo.test.Day002_locators_getText_getAttribut.HW;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Task1 extends BaseTest{

    public static void main(String[] args) {
//        TC #1: Etsy Title Verification
//        1. Open Chrome browser
//        2. Go to https://www.etsy.com
        setUp("https://www.etsy.com");

//        3. Search for “wooden spoon”
        WebElement searchField = driver.findElement(By.id("global-enhancements-search-query"));
        searchField.sendKeys("wooden spoon");

//        4. Verify title:
//        Expected: “Wooden spoon | Etsy”
        String actTitle = driver.getTitle();
        String expTitle = "Wooden spoon - Etsy";
        if (actTitle.equals(expTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }
        tearDown();
    }
}
