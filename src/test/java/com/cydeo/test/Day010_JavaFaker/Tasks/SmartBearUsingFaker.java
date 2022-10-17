package com.cydeo.test.Day010_JavaFaker.Tasks;

import com.cydeo.Utilities.BaseTest;
import com.cydeo.Utilities.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearUsingFaker extends BaseTest {
    @Test
    public void fill_out_order(){
        SmartBearUtils.loginSmartBear(driver, "Tester", "test");
        SmartBearUtils.placeOrder(driver);
        SmartBearUtils.fillOutBillingInfo(driver);
    }

    @Test
    public void login_test() {
        SmartBearUtils.loginSmartBear(driver, "Tester", "test");
        List<WebElement> listLinks = driver.findElements(By.tagName("a"));
        System.out.println(listLinks.size());
        for (WebElement each : listLinks) {
            System.out.println(each.getText());
        }
    }
    @Test
    public void order_verification(){
        SmartBearUtils.loginSmartBear(driver, "Tester", "test");
        String expDate = "01/05/2010";
        SmartBearUtils.CheckOrderStats(driver, "Susan", expDate);
    }
}
