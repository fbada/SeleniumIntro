package com.cydeo.test.Day010_JavaFaker;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class javafaker {

@Test
public static void javaFaker(){

        Faker jfaker = new Faker();

        System.out.println(jfaker.name().fullName());
        System.out.println(jfaker.address().streetAddress());
        System.out.println(jfaker.address().cityName());
        System.out.println(jfaker.address().state());
        System.out.println(jfaker.address().zipCode());
        System.out.println("--------------------------------");
        System.out.println(jfaker.number().numberBetween(20, 123444));
        System.out.println(jfaker.numerify("(347)-###-####"));
        System.out.println(jfaker.letterify("??????"));

        System.out.println(jfaker.finance().creditCard(CreditCardType.VISA));

        System.out.println("--------------------------------");

        Faker faker = new Faker();
        String name = faker.name().fullName();
        System.out.println(name);
        String street = faker.address().streetAddress();
        System.out.println(street);
        String city = faker.address().city();
        System.out.println(city);
        String state = faker.address().stateAbbr();
        System.out.println(state);
        String zip = faker.address().zipCode();
        System.out.println(zip);
        String creditCard = faker.finance().creditCard(CreditCardType.VISA);
        System.out.println(creditCard);
    }
}


