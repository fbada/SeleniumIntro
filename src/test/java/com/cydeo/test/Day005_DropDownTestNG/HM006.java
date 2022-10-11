package com.cydeo.test.Day005_DropDownTestNG;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HM006 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("safari");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
@Test
    public void selAllLang(){
        driver.get("https://practice.cydeo.com/dropdown  ");
        Select selectAllLang = new Select(driver.findElement(By.name("Languages")));
       selectAllLang.selectByIndex(0);
       selectAllLang.selectByIndex(1);
       selectAllLang.selectByIndex(2);
       selectAllLang.selectByIndex(3);
       selectAllLang.selectByIndex(4);

       List<WebElement> allSelect = selectAllLang.getAllSelectedOptions();
        allSelect.forEach(p -> System.out.println(p.getText()));
        selectAllLang.deselectAll();

   WebElement dropdown = driver.findElement(By.name("Languages"));
 //   System.out.println(dropdown.isSelected());
    Assert.assertFalse(dropdown.isSelected());

    }

}
