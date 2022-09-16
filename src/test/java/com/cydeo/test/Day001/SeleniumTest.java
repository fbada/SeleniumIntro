package com.cydeo.test.Day001;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
     // System.setProperty("webdriver.chrome.driver",
         //       "/Users/rds1/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

    }
}
