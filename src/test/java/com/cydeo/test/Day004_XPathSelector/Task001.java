package com.cydeo.test.Day004_XPathSelector;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Task001 {

    /*
    1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
     */

@Test()
        public  void elemVisible() {
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("https://practice.cydeo.com/forgot_password");
            driver.manage().window().maximize();

    WebElement homeLink = driver.findElement(By.xpath("//a[@class ='nav-link']"));
    WebElement forgotPswd = driver.findElement(By.cssSelector("div[class= 'example']>h2"));
    WebElement emailTxt = driver.findElement(By.xpath("//label[@for= 'email']"));
    WebElement emailField = driver.findElement(By.cssSelector("input[name='email']"));
    WebElement cydeoTxt = driver.findElement(By.xpath("//div[@class='large-4 large-centered columns']/div"));

    Assert.assertEquals(homeLink.isDisplayed(), true, "Element is not visible");
    Assert.assertEquals(forgotPswd.isDisplayed(), true, "Element is not visible");
    Assert.assertEquals(emailTxt.isDisplayed(), true, "Element is not visible");
    Assert.assertEquals(emailField.isDisplayed(), true, "Element is not visible");
    Assert.assertEquals(cydeoTxt.isDisplayed(), true, "Element is not visible");

    driver.quit();

}






    }

