package com.cydeo.test.Day002_locators_getText_getAttribut.PracticeInClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ABTask extends BaseTest{

    public static void main(String[] args) throws InterruptedException {

//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/
        setUp("https://practice.cydeo.com/ ");

//        3- Click to A/B Testing from top of the list.
        WebElement abTestLink = driver.findElement(By.partialLinkText("A/B"));
        abTestLink.click();

//        4- Verify title is:
//        Expected: No A/B Test
        String actTitle = driver.getTitle();
        String expTitle = "No A/B Test";
        if(actTitle.equals(expTitle)){
            System.out.println("A/B title verification PASSED;");
        }else {
            System.out.println("A/B title verification FAILED;");
        }
//        5- Go back to home page by using the .back();
        driver.navigate().back();

//        6- Verify title equals:
//        Expected: Practice
       actTitle = driver.getTitle();
       expTitle = "Practice";


        if(actTitle.equals(expTitle)){
            System.out.println("Practice Title verification PASSED;");
        }else {
            System.out.println("Practice Title verification FAILED;");
        }
            tearDown();
    }
}
