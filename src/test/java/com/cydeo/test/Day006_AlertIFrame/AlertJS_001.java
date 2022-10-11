package com.cydeo.test.Day006_AlertIFrame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class AlertJS_001 extends BaseTest{


    @Test
    public void test(){
        driver.get("https://practice.cydeo.com/javascript_alerts");
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick = 'jsAlert()']"));
        jsAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resText = driver.findElement(By.xpath("//p[@id='result']"));
        assertTrue(resText.isDisplayed());
    }

    @Test
    public void test2(){
        driver.get("https://practice.cydeo.com/javascript_alerts");
        WebElement jsAlertConfirm = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        jsAlertConfirm.click();
        Alert alertConfirm = driver.switchTo().alert();
        alertConfirm.dismiss();
        WebElement resTextConfirm = driver.findElement(By.xpath("//p[@id='result']"));

        String actText = resTextConfirm.getText();
        System.out.println("actText = " + actText);
        String expText = "Cancel";
        assertTrue(actText.contains(expText));
    }

    @Test
    public void test3(){
        driver.get("https://practice.cydeo.com/javascript_alerts");
        ////button[.='Click for JS Prompt']
        WebElement alertJSprompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        alertJSprompt.click();
        Alert alertPrompt = driver.switchTo().alert();
        alertPrompt.sendKeys("I AM PROMPTED TO WRITE !!!!");
        alertPrompt.accept();

        //check for the result to state a specific text
        WebElement resPromptTxt = driver.findElement(By.xpath("//p[@id='result']"));

        String actText = resPromptTxt.getText();
        System.out.println("actText = " + actText);
        String expText = "You entered:";

        assertTrue(actText.contains(expText));


    }
}
