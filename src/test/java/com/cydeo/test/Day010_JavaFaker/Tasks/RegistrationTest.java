package com.cydeo.test.Day010_JavaFaker.Tasks;

import com.cydeo.Utilities.TestBase;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @Test
    public void fill_out_registration_form_valid() {
        Faker faker = new Faker();
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.filloutForm(faker);
    }

    @Test
    public void fill_out_registration_form_invalid() {
        Faker faker = new Faker();
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.filloutForm_Invalid(faker);

    }
}




