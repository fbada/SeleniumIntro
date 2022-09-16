package com.cydeo.test.Day001;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask {
    /*
    TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to
https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice

     */
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();

//        WebDriverManager.safaridriver().setup();
//        WebDriver driver = new SafariDriver();

        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com

        driver.get("https://practice.cydeo.com");

//3. Verify URL contains Expected: cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED");
        }else {
            System.out.println("URL verification FAILED");
        }
//4. Verify title:  Expected: Practice
        String expTitle = "Practice";
        String actTitle = driver.getTitle();

        if(actTitle.contains(expTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
