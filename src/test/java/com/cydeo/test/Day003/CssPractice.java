package com.cydeo.test.Day003;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");


        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
        searchBox.sendKeys("cydeo"+ Keys.ENTER);

        WebElement cydeoText = driver.findElement(By.cssSelector("a[href = 'https://cydeo.com/']>h3"));
        String actText = cydeoText.getText();
        String expText = "Cydeo";

        if(actText.equals(expText)){
            System.out.println("Cydeo Text verification PASSED!");
        }else{
            System.out.println("Cydeo Text verification FAILED!");
        }
        driver.quit();
    }
}
