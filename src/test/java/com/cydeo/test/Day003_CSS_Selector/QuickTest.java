package com.cydeo.test.Day003_CSS_Selector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuickTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://my.cydeo.com/member/my-programs/63-java-selenium-sdet/" +
                "courses/480-ui-test-automation#8461-ui-test-shorts");
        driver.manage().window().maximize();

        WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
        emailField.sendKeys("adafetic@gmail.com"+Keys.ENTER);

        WebElement pswdField = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
        pswdField.sendKeys("Summer_1887"+Keys.ENTER);

        driver.findElement(By.xpath("//span[.='Courses']")).click();
        driver.findElement(By.xpath("//a[.=' UI Test Automation ']")).click();
        driver.findElement(By.xpath("//div[.=' UI TEST SHORTS ' and @class ='NS_Item-Card-Header' ]")).click();


        driver.findElement(By.xpath("//a[contains(., 'Xpath Practice')]")).click();

    }
}
