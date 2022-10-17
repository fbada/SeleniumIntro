package com.cydeo.test.Day010_JavaFaker.Tasks;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.List;

public class RegistrationPage {

   RegistrationPage()
   {
      PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(xpath = "//input[@name='firstname']")
   private  WebElement firstName;

   @FindBy(xpath = "//input[@name='lastname']")
           private WebElement lastName;

   @FindBy(xpath = "//input[@name='username']")
   private WebElement username;

   @FindBy(xpath = "//input[@name='email']")
   private WebElement emailAddress;

   @FindBy(xpath = "//input[@name='password']")
   private WebElement password;

   @FindBy(xpath = "//input[@name='phone']")
   private WebElement phoneNumber;

   @FindAll(@FindBy(xpath = "//input[@type='radio']"))
   private List<WebElement> gender;

   @FindBy(xpath = "//input[@name='birthday']")
   private WebElement dateOfBirth;

   @FindBy(xpath = "//select[@name='department']")
   private WebElement department;

   @FindBy(xpath = "//select[@name='job_title']")
   private WebElement jobTitle;

  @FindAll( @FindBy(xpath = "//input[@class='form-check-input']"))
   private List<WebElement> programmingLang;

   @FindBy(xpath = "//button[@id='wooden_spoon']")
   private WebElement signUpBtn;

   @FindBy(xpath = "//div[@class='alert alert-success']/p")
   private WebElement confirmMsg;

   @FindBy(xpath = "//div[@class='form-group has-feedback has-error']")
   private WebElement errorAlrt;

   public void filloutForm(Faker faker ){
      Driver.getDriver().get(ConfigurationReader.getProperty("cydeoRegPage"));

      firstName.sendKeys(faker.name().firstName());
      lastName.sendKeys(faker.name().lastName().replaceAll("'",""));
      username.sendKeys(faker.bothify("???##????"));
      emailAddress.sendKeys(faker.internet().emailAddress().toLowerCase());
      password.sendKeys(faker.internet().password());
      phoneNumber.sendKeys(faker.numerify("###-###-####"));

      for(WebElement each : gender){
         gender.get(faker.number().numberBetween(0, 2)).click();
      }

      SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
      String dob = sdf.format(faker.date().birthday());
      dateOfBirth.sendKeys(dob);

      Select jobDropdown = new Select(department);
      jobDropdown.selectByIndex(faker.number().numberBetween(1, 9));

      Select deptJobDropdown = new Select(jobTitle);
      deptJobDropdown.selectByIndex(faker.number().numberBetween(1, 9));

      for (WebElement each : programmingLang) {
         programmingLang.get(faker.number().numberBetween(0, 2)).click();
      }

      signUpBtn.click();

      //15. Verify success message “You’ve successfully completed registration.” is
      //displayed
      String actualMessage = confirmMsg.getText();
      String expectedMessage = "You've successfully completed registration!";
      Assert.assertEquals(actualMessage, expectedMessage);
   }

   public void filloutForm_Invalid(Faker faker){
      Driver.getDriver().get(ConfigurationReader.getProperty("cydeoRegPage"));

      firstName.sendKeys(faker.name().firstName());
      lastName.sendKeys(faker.name().lastName());
      signUpBtn.click();

      //Confirm an error is displayed
      Assert.assertTrue(errorAlrt.isDisplayed());
   }


}



