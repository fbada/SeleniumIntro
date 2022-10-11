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

import static org.testng.Assert.*;

public class HM001 extends BaseTest{
    /*
    Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
     */


    @Test
    public void test1(){
        driver.get("https://practice.cydeo.com/dropdown");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement dropdown = driver.findElement(By.id("state"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Illinois");
        select.selectByValue("VA");

        //finding the index for requested element
        List<WebElement> allIndexSrch = select.getOptions();
        int i = -1;
        int CaliIndex = 0;
        //use the i = -1 as the first element is default, AND the index starts at 0,
        //  so 1-2 will give you the appropriate starting point
        for(WebElement each: allIndexSrch){
            i++;
            if(each.getText().equals("California")){
               break;
            }
        }
        select.selectByIndex(i);
        assertTrue(select.getFirstSelectedOption().getText().equals("California"));
    }
    /*
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/dropdown
    3. Select “December 1st, 1923” and verify it is selected.
     Select year using   : visible text
    Select month using    : value attribute Select
    day using : index number
     */
    @Test
    public void test2(){
        driver.get("https://practice.cydeo.com/dropdown");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select yearSel = new Select(driver.findElement(By.xpath("//select[@id = 'year']")));
        yearSel.selectByVisibleText("1923");
        Select monthSel = new Select(driver.findElement(By.xpath("//select[@id = 'month']")));
        monthSel.selectByValue("11");
        Select daySel = new Select(driver.findElement(By.xpath("//select[@id = 'day']")));
        daySel.selectByIndex(0);

        assertEquals(yearSel.getFirstSelectedOption().getText(), "1923");
        assertEquals(monthSel.getFirstSelectedOption().getText(), "December");
        assertEquals(daySel.getFirstSelectedOption().getText(), "1");
    }
    /*
    2. Go to https://practice.cydeo.com/dropdown
    3. Click to non-select dropdown
    4. Select Facebook from dropdown
    5. Verify title is “Facebook - Log In or Sign Up”
     */
    @Test
    public void test3(){
        driver.get("https://practice.cydeo.com/dropdown");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement dropdown = driver.findElement(By.xpath("//a[@id = 'dropdownMenuLink']"));
        dropdown.click();
        WebElement selectFB = driver.findElement(By.linkText("Facebook"));
        selectFB.click();

        String actTitle = driver.getTitle();
        String expTitle = "Facebook";
        assertTrue(actTitle.contains(expTitle));
    }
    @Test
    public void test4(){
        driver.get("https://practice.cydeo.com/dropdown  ");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement dropdown = driver.findElement(By.name("Languages"));
        Select selectAllLang = new Select(dropdown);

        List<WebElement> eachLangSelect = selectAllLang.getOptions();
        eachLangSelect.forEach(p -> p.click());
        eachLangSelect.forEach(p -> System.out.print(p.getText()+" "));

        selectAllLang.deselectAll();


        assertTrue(!dropdown.isSelected(), "Dropdown has selected elements.");
    }
}
