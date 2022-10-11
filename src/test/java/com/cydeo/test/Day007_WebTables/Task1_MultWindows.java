package com.cydeo.test.Day007_WebTables;

import com.cydeo.test.Utilities.BaseTest;
import com.cydeo.test.Utilities.BrowserUtils;
import com.cydeo.test.Utilities.ConfigReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task1_MultWindows extends BaseTest {
/*
        //3. Assert: Title is “Windows”
        //4. Click to: “Click Here” link
        //5. Click to: “CYDEO” link
        //6. Switch to Cydeo page.
        //7. Assert: Title is “Cydeo
 */
    @Test
    public void multiple_window_test(){
        driver.get(ConfigReader.getProperty("envt1")+"windows");
        BrowserUtils.wait(driver, 3);
        BrowserUtils.verifyTitle(driver, ConfigReader.getProperty("title1"));
        driver.findElement(By.xpath("//a[contains(text(),'Here')]")).click();
        driver.findElement(By.xpath("//a[contains(.,'CYDEO')]")).click();

        String expTitle = ConfigReader.getProperty("title2");
        // traverse through the handles
        for(String eachHandle : driver.getWindowHandles()){
            driver.switchTo().window(eachHandle);
            if(driver.getTitle().equals(expTitle)){
                break;
            }
        }
      BrowserUtils.verifyTitle(driver, expTitle);
    }
}
