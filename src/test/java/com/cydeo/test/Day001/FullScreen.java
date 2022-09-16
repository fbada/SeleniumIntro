package com.cydeo.test.Day001;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FullScreen {

    public static void main(String[] args) throws InterruptedException {

            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();

        //    driver.manage().window().maximize();


            driver.get("https://cydeo.com");
           driver.manage().window().maximize();
            Thread.sleep(1000);

            driver.quit();

        }
    }

