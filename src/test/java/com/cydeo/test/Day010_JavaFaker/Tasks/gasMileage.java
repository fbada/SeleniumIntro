package com.cydeo.test.Day010_JavaFaker.Tasks;

import com.cydeo.Utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class gasMileage extends BaseTest {
@Test
    public static void calculator_Test() throws InterruptedException {

        driver.get("https://www.calculator.net");
        driver.findElement(By.id("calcSearchTerm")).sendKeys("gas mileage");
        driver.findElement(By.xpath("//a[contains(text(), 'Gas Mileage')]")).click();

        assertTrue(driver.getTitle().equals("Gas Mileage Calculator"));
        assertTrue(driver.findElement(By.xpath("//h1")).getText().equals("Gas Mileage Calculator"));

       WebElement odometerRead =  driver.findElement(By.xpath("//input[@id = 'uscodreading']"));
       odometerRead.clear();
       odometerRead.sendKeys("7925");

       WebElement prevOdRead = driver.findElement(By.id("uspodreading"));
       prevOdRead.clear();
       prevOdRead.sendKeys("7550");

       WebElement gasAdd = driver.findElement(By.id("usgasputin"));
       gasAdd.clear();
       gasAdd.sendKeys("16");

       WebElement gasPrice = driver.findElement(By.id("usgasprice"));
       gasPrice.clear();
       gasPrice.sendKeys("3.55");

       driver.findElement(By.xpath("//table[@id ='standard']//td/input[@value ='Calculate']")).click();
       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

       String exp = "23.44 mpg";
       String act = driver.findElement(By.xpath("//p//b")).getText();

       assertTrue(exp.equals(act));

    }
}
