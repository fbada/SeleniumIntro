package com.cydeo.test.TestNG_001;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NextBaseCRMLogin {

    WebDriver driver;

@Test (dataProviderClass = SignIn.class, dataProvider = "signin-provider")
    public void signin(String username, String password){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement usrName = driver.findElement(By.xpath("//input[@name = 'USER_LOGIN']"));
        usrName.sendKeys(username);
        WebElement pswdField = driver.findElement(By.xpath("//input[@name = 'USER_PASSWORD']"));
        pswdField.sendKeys(password);

        driver.findElement(By.xpath("//input[@class ='login-btn']")).click();

       WebElement actElementChatCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']"));
      String actText= actElementChatCalls.getAttribute("title");
      String exptext = "Chat and Calls";

       Assert.assertEquals(actText, exptext);

        driver.quit();
    }
}
