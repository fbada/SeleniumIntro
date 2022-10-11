package com.cydeo.test.Day006_AlertIFrame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WindowHandle extends BaseTest{

@Test(priority = 1)
    public void test1() throws InterruptedException {
    driver.get("https://practice.cydeo.com/windows");

    String curHandle = driver.getWindowHandle();
   // System.out.println("curHandle = " + curHandle);
   Set<String> allHandles = driver.getWindowHandles();
   // System.out.println("allHandles = " + allHandles);
    assertTrue(driver.getTitle().equals("Windows"));

    WebElement clickLink = driver.findElement(By.xpath("//a[.='Click Here']"));
    clickLink.click();

    for(String eachHandle : driver.getWindowHandles()){
        driver.switchTo().window(eachHandle);
        System.out.println("eachHandle = " + eachHandle);
      //  if(driver.getTitle().equals("New Window")){
      //     break;
    }
    assertEquals(driver.getTitle(), "New Window");
    }
    
}

