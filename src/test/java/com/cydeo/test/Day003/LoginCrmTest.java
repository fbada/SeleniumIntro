package com.cydeo.test.Day003;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCrmTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login1.nextbasecrm.com/");
        driver.manage().window().maximize();
//Testing happy path
        WebElement usrName = driver.findElement(By.xpath("//input[@name = 'USER_LOGIN']"));
        usrName.sendKeys("helpdesk58@cydeo.com");
        WebElement pswdField = driver.findElement(By.xpath("//input[@name = 'USER_PASSWORD']"));
        pswdField.sendKeys("UserUser");

       driver.findElement(By.xpath("//input[@class ='login-btn']")).click();

       String URL = driver.getCurrentUrl();
       String expUrl = "stream";

       if(URL.contains(expUrl)){
           System.out.println("Login PASSED");
       }else{
           System.out.println("Login FAILED");
       }

       driver.findElement(By.xpath("//span[@id = 'user-name']")).click();
       driver.findElement(By.xpath("//span[.='Log out']")).click();

       URL = driver.getCurrentUrl();
       expUrl = "auth";
        if(URL.contains(expUrl)){
            System.out.println("Logout PASSED");
        }else{
            System.out.println("Logout FAILED");
        }

       driver.quit();


    }
}
