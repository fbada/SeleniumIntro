package com.cydeo.test.Day001;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigate {


    public static void main(String[] args) throws InterruptedException {
        String actualTitle, expectedTitle;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.tesla.com");

     //   driver.get("https://www.google.com");



        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        Thread.sleep(2000);

        actualTitle = driver.getTitle();
        expectedTitle = "Electric Cars, Solar & Clean Energy | Tesla";

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Failed");
        }

       String URL =  driver.getCurrentUrl();
        System.out.println("Current URL: "+ URL);
        //Assert.assertEquals(driver.getTitle(), expectedTitle,actualTitle);

        Thread.sleep(3000);
        driver.close();
    }
}
