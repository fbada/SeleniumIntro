package com.cydeo.test.Day010_JavaFaker.Tasks;

import com.github.javafaker.Faker;

public class fakeID {
    Faker faker = new Faker();

    String fName = faker.name().firstName(),
            lName = faker.name().lastName();
    String usrName = faker.name().username(),
            email = usrName + "@gmail.com",
            password = "password1",
            phoneNum = faker.numerify("???-???-????"),
            DoB = "12/12/1998";
}
