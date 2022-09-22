package com.cydeo.test.Day003;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.cydeo.test.Day003.WebDriverFactory.getDriver;

public class CRMLoginFail {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbaseCRM.com");
        driver.manage().window().maximize();

        WebElement userField = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        userField.sendKeys("invalid@gmail.com"+ Keys.ENTER);
        WebElement psdwField = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        psdwField.sendKeys("wrongpswd");

        driver.findElement(By.cssSelector("input[class ='login-btn']")).click();

        String expText="Incorrect login or password";
        String actText = driver.findElement(By.cssSelector(".errortext")).getText();

       if (expText.equals(actText)){
           System.out.println("Negative Login PASSED");
       }else{
           System.out.println("Negative Login FAILED");
       }

        driver.quit();

    }
}
