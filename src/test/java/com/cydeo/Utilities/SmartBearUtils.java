package com.cydeo.Utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmartBearUtils {
    public static void loginSmartBear(WebDriver driver, String usrName, String pswd){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(usrName);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(pswd);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public static void wait(WebDriver driver, int sec){
        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }

    public static void placeOrder(WebDriver driver){
        driver.findElement(By.xpath("//a[.='Order']")).click();
        SmartBearUtils.wait(driver, 5);
        WebElement dropdown = driver.findElement(By.xpath("//select[@id ='ctl00_MainContent_fmwOrder_ddlProduct']"));
        Select sel = new Select(dropdown);
        sel.selectByIndex(1);
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")).sendKeys("2");
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
    }
    public static void fillOutBillingInfo(WebDriver driver){

        Faker faker = new Faker();
        String name = faker.name().fullName();
        String street = faker.address().streetAddress();
        String city = faker.address().city();
        String state = faker.address().stateAbbr();
        String zip = faker.numerify("#####");
        String creditCard = faker.finance().creditCard().replaceAll("-","");


        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(name);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(street);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(city);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(state);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zip);

        WebElement radioVisa = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        radioVisa.click();
        assertTrue(radioVisa.isSelected());

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(creditCard);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("10/23");

        driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")).click();

        WebElement confirmOrderMsg = driver.findElement(By.xpath("//strong[contains(text(), 'order has')]"));
        String act = confirmOrderMsg.getText(), exp = "New order has been successfully added.";
        assertEquals(act, exp);

    }
    public static void CheckOrderStats(WebDriver driver, String str, String expDate){

        driver.findElement(By.xpath("//a[contains(text(), 'all order')]")).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        WebElement date =  driver.findElement(By.xpath("//td[contains(text(), '" +str +
                "')]/following-sibling::td[3]"));
        String actDate = date.getText();
        assertEquals(actDate,expDate);
    }
}
