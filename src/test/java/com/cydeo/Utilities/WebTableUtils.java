package com.cydeo.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class WebTableUtils {

    /*
Method #1 info:
• Name: returnOrderDate ()
• Return type: String
• Arg1: WebDriver driver
• Arg2: String costumerName
This method should accept a costumerName and return the costumer order date
as a String.
     */

    public static String returnOrderDate (WebDriver driver, String custumerName){

        String locator = "//td[.='"+custumerName+"']/following-sibling::td[3]";
        WebElement orderDate = driver.findElement(By.xpath(locator));
       return orderDate.getText();

    }
    public static void orderVerify(WebDriver driver, String custumerNAme, String expOrderDate){
//This method should accept above mentioned arguments and internally assert
//expectedOrderDate matching actualOrderDate.
       String actOrderDate = WebTableUtils.returnOrderDate(driver, custumerNAme);
       Assert.assertEquals(actOrderDate, expOrderDate, "Order Verification failed.");

}


}
