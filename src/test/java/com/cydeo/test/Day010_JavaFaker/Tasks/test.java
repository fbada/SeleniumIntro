package com.cydeo.test.Day010_JavaFaker.Tasks;

import com.cydeo.Utilities.BaseTest;
import org.testng.annotations.Test;

public class test extends BaseTest {
    @Test
    public static void test(){
        driver.get("https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract");
        System.out.println(driver.getTitle());
    }
}
