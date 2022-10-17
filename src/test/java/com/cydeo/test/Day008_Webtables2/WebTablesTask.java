package com.cydeo.test.Day008_Webtables2;

import com.cydeo.Utilities.BaseTest;
import org.testng.annotations.Test;

import static com.cydeo.Utilities.WebTableUtils.orderVerify;
import static com.cydeo.Utilities.WebTableUtils.returnOrderDate;
import static org.testng.Assert.assertEquals;

public class WebTablesTask extends BaseTest {

    @Test
    public void order_name_verify_test(){
        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        driver.get("https://practice.cydeo.com/web-tables");
//        WebElement usrName = driver.findElement(By.xpath("//table[@id ='ctl00_MainContent_orderGrid']" +
//                "//td[.='Bob Martin']"));
//        String exp = usrName.getText();
//        String act = "Bob Martin";
//        assertEquals(act, exp,"Name verification failed");

        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
//        WebElement orderDate = driver.findElement(By.xpath("//table[@id ='ctl00_MainContent_orderGrid']" +
//                "//td[.='Bob Martin']/following-sibling::td[3]"));
//        // //td[.='Bob Martin']/../td[5] <-- can also be used
//        act = orderDate.getText();

        String driverOrderDate = returnOrderDate(driver, "Samuel Jackson");
        System.out.println(driverOrderDate);


    }
    @Test
    public static void test_cleanedUp_002(){
        driver.get("https://practice.cydeo.com/web-tables");
        orderVerify(driver, "Samuel Jackson", "12/21/2021");
    }
}
