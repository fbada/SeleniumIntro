package com.cydeo.test.Day006_AlertIFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class iFrames extends BaseTest{

    @Test
    public void iFrameTest(){
        driver.get("https://practice.cydeo.com/iframe");
        WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));

        driver.switchTo().frame(iFrame);
        // can be as found as an index, id , or a web element
        WebElement textArea = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        assertTrue(textArea.isDisplayed());
        driver.switchTo().defaultContent();
        //.toParentFrame() when the iframe is a nested frame
        WebElement headerTxt = driver.findElement(By.xpath("//h3"));

        assertTrue(headerTxt.isDisplayed());
        assertTrue(headerTxt.getText().equals("An iFrame containing the TinyMCE WYSIWYG Editor"));

    }

}
