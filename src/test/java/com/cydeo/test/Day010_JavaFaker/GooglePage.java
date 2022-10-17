package com.cydeo.test.Day010_JavaFaker;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver002;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class GooglePage {

   public GooglePage(){

       PageFactory.initElements(Driver002.getDriver(), this);
   }
   @FindBy (name = "q")
   private WebElement searchbox;

   public void searchGoogle(String str){
       POM_navigate_toMethod("https://www.google.com");
       searchbox.sendKeys(str+Keys.ENTER);
       BrowserUtils.wait(1);

   }

    public static void POM_navigate_toMethod(String str){
        Driver002.getDriver().get(str);
    }



}
