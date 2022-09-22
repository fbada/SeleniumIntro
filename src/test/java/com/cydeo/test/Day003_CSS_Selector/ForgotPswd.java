package com.cydeo.test.Day003_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPswd {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/");
        driver.manage().window().maximize();

        WebElement forgotPswd = driver.findElement(By.xpath("//a[@class='login-link-forgot-pass']"));

        String actText = forgotPswd.getText();
        String expText = "FORGOT YOUR PASSWORD?";

        if(actText.equals(expText)){
            System.out.println("Forgot Password text verification Passed");
        }else {
            System.out.println("Forgot Password text verification Failed");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

       String actUrl= forgotPswd.getAttribute("href");
       //System.out.println(actUrl);
       String expUrl = "forgot_password=yes";

       if(actUrl.contains(expUrl)){
           System.out.println("Href verification PASSED");
       }else{
           System.out.println("Href verification FAILED");
       }

        driver.quit();
    }
}
