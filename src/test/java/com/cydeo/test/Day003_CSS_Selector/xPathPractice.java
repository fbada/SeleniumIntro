package com.cydeo.test.Day003_CSS_Selector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@name = 'q' or @class = 'gLFyf gsfi']"));
        searchBox.sendKeys("cydeo"+ Keys.ENTER);

        String actText = driver.findElement(By.xpath("//h3[.='Cydeo']")).getText();
        String expText = "Cydeo";

        if(actText.equals(expText)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!");
        }
        driver.quit();
    }
}
