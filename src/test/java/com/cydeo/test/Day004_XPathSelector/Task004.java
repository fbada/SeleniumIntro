package com.cydeo.test.Day004_XPathSelector;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task004 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/abtest");

       List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));
       System.out.println("Number of links: "+links.size());
       for(WebElement each: links){
           System.out.println(each.getText());
           System.out.println(each.getAttribute("href"));
       }
       driver.quit();
    }
}
