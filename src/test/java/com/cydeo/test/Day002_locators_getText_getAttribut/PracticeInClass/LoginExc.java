package com.cydeo.test.Day002_locators_getText_getAttribut.PracticeInClass;

public class LoginExc extends BaseTest{

    public static void main(String[] args) {
        setUp("https://www.qa1.excelsoirinsurance.com/login");

        //3. Verify URL contains Expected: "excelsoirinsurance"
       String actURL = driver.getCurrentUrl();
       if(actURL.contains("excelsoirinsurance")){
           System.out.println("URL verification PASSED");
       }else {
           System.out.println("URL verification FAILED");
       }

        //4. Verify title: Expected: "Login | Excelsoir Insurance"
        String actTitle = driver.getTitle();
       if(actTitle.equals("Login | Excelsoir Insurance")){
           System.out.println("Title verification PASSED");
       }else {
           System.out.println("Title verification FAILED");
       }
       tearDown();
    }
}
