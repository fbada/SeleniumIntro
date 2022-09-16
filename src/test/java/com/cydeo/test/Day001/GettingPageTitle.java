package com.cydeo.test.Day001;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class GettingPageTitle {
    // always test this manually to verify that all is as per the Req

    public static void main(String[] args) throws InterruptedException {
//1.Open ChromeBrowser()
        WebDriverManager.safaridriver().setup();
        WebDriver driver = new SafariDriver();
//2.Go to cydeo.com
        driver.get("https://cydeo.com");

        //maximize the page
        driver.manage().window().maximize();

        //set up the variables for actual vs expectedTitle
        String actualTitle = driver.getTitle();
        String expectedTitle = "Cydeo";// copied from the Requirements

//3. Verify the actualTitle is "Cydeo"
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED.");
        }else {
            System.out.println("Title verification FAILED.");
        }

        driver.quit();
    }
}
