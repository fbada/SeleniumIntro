package com.cydeo.test.Day005_DropDownTestNG;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
    /*
            1. Open Chrome browser
            2. Go to https://practice.cydeo.com/radio_buttons
            3. Click to “Hockey” radio button
            4. Verify “Hockey” radio button is selected after clicking.
             */

public class Task001 {
    static WebDriver driver = WebDriverFactory.getDriver("chrome");
   @BeforeClass
    public void setUp(){
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test(priority = 1)
    public static void hockeyRadioButton() {

        WebElement rButtonHockey = driver.findElement(By.xpath("//input[@id='hockey']"));
        rButtonHockey.click();
        boolean actual = rButtonHockey.isSelected();
        Assert.assertEquals(actual, true, "Radio button selection verified.");

    }
    @Test(priority = 2 )
    public void sportsAllButtons(){
        List<WebElement> allRadioSport = driver.findElements(By.xpath("//input[@name ='sport']"));
        int numSportRButtons = allRadioSport.size();
        int expNumButtons = 4;

        Assert.assertEquals(numSportRButtons, expNumButtons,
                "Number of 'Sport' radio buttons verified.");
        List<String> sportRadioBtns = new ArrayList<>();
        String actButtons = "";
        String expButtons ="basketball football hockey water_polo";

        for(WebElement each : allRadioSport){
            if(each.isEnabled()) {
                each.click();
                sportRadioBtns.add(each.getAttribute("id"));
            }
            Assert.assertEquals(each.isSelected(), true,  each.getAttribute("id")+ " button CANNOT be selected.");
            actButtons += each.getAttribute("id")+" ";
        }
        System.out.println(sportRadioBtns);
        Assert.assertEquals(actButtons.trim(), expButtons,"SPORT Button Verification Failed" );

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
