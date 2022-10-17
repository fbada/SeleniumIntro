package com.cydeo.test.Day004_XPathSelector;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task005 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement cBox1 = driver.findElement(By.xpath("//input[@id='box1']"));
        WebElement cBox2 = driver.findElement(By.xpath("//input[@id='box2']"));

        System.out.println(cBox1.isSelected());
        System.out.println(cBox2.isSelected());

        cBox1.click();
        cBox2.click();

        System.out.println(cBox1.isSelected());
        System.out.println(cBox2.isSelected());


        driver.quit();

    }
}
