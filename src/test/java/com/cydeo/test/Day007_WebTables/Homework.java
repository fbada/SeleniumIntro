package com.cydeo.test.Day007_WebTables;

import com.cydeo.Utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Homework extends BaseTest {

@Test(priority = 1)
    public static void test_find_allLinks (){
     driver.get("https://www.openxcell.com");

    List<WebElement> links = driver.findElements(By.xpath("//a[starts-with(@href, 'https')]"));
    assertEquals(links.size(), 338);

}
@Test(priority = 2)
public static void test_printAllLinks(){
    driver.get("https://www.openxcell.com");
    List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href, 'https')]"));
    System.out.println("Number of links on page: "+links.size());
    links.forEach(link -> System.out.println(link.getAttribute("href")));

}
@Test(priority = 3)
    public static void test_printLinks() throws InterruptedException {
    driver.get("https://www.openxcell.com");
    List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href, 'https')]"));
    int actBlankLinks =  0;
    for(WebElement eachLink : links){
       if(eachLink.getText().length() == 0){
           actBlankLinks++;
       }
    }
    Thread.sleep(3000);
    System.out.println("Num of blank links: "+actBlankLinks);
    assertEquals(actBlankLinks, 254);
        }
}
