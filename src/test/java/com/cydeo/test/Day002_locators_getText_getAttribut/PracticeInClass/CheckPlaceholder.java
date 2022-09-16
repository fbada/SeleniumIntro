package com.cydeo.test.Day002_locators_getText_getAttribut.PracticeInClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckPlaceholder extends BaseTest{

    public static void main(String[] args) {
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/registration_form

        setUp("https://practice.cydeo.com/registration_form");
//        3- Verify header text is as expected:
//        Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String actHeader = headerText.getText();
        String expHeader = "Registration form";

        if(actHeader.equals(expHeader)){
            System.out.println("Header verification PASSED!");
        }else {
            System.out.println("Header verification FAILED!");
        }

//        4- Locate “First name” input box
//        5- Verify placeholder attribute’s value is as expected:
//        Expected: first name

        WebElement firstNameInput = driver.findElement(By.name("firstname"));
        String actPlaceHolder = firstNameInput.getAttribute("placeholder");
        String expPlaceHolder = "first name";

        if(actPlaceHolder.equals(expPlaceHolder)){
            System.out.println("Placeholder verification PASSED!");
        }else{
            System.out.println("Placeholder verification FAILED!");
        }

        tearDown();
    }
}
