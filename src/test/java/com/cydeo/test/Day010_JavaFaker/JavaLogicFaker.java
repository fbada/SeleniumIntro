package com.cydeo.test.Day010_JavaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.*;

public class JavaLogicFaker {
@Test
    public void FakerPractice() {
    Faker faker = new Faker();
//    System.out.println(faker.finance().creditCard());
//    System.out.println(faker.finance().creditCard().replaceAll("-", ""));
//    System.out.println(faker.bothify("?#? #?#", true));
//    System.out.println(faker.chuckNorris().fact().replaceAll("Chuck Norris", "Fenrir"));

   // System.out.println("createNames(30) = " + createNames(30));
//    Person person1 = new Person();
//    System.out.println(person1);
    HashMap<String, Person> map = mapPeople(4);
    printMap(map);


}
public HashMap<String, Person> mapPeople(int num){

    HashMap<String ,Person> map = new HashMap<>();
    String ID = "1230";
    for (int i = 0; i < num; i++) {
        Person person = new Person();
        ID += "2HHS"+ person.getAddress().length() + person.getFirstName().substring(1, 3).toUpperCase();
        ID = ID.substring(1, 9);
        map.put(ID, person);
    }

    return map;
}

   public static List<String> createNames(int numNamesNeeded){
    Faker faker = new Faker();
    List<String> names = new ArrayList<>();
       for (int i = 0; i < numNamesNeeded; i++) {
           names.add(faker.funnyName().name());
       }
    return  names;
   }

    public static void printMap(HashMap<String, Person> map){

        map.entrySet().forEach(entry -> {
            System.out.println("==============================\nID : "+entry.getKey()  +
                    "\nEmployee Information\n" + entry.getValue());
        });

    }

   class Person{
       Faker faker = new Faker();
     private String firstName = faker.name().firstName(),
             secondName = faker.name().lastName(),
             address = faker.address().streetAddress(),
             state = faker.address().state(),
             zip = faker.address().zipCode(),
             creditCArdNum = faker.finance().creditCard();

       public Person() {
           this.firstName = firstName;
           this.secondName = secondName;
           this.address = address;
           this.state = state;
           this.zip = zip;
           this.creditCArdNum = creditCArdNum;
       }

       public String getFirstName() {
           return firstName;
       }

       public String getSecondName() {
           return secondName;
       }

       public String getAddress() {
           return address;
       }

       public String getState() {
           return state;
       }

       public String getZip() {
           return zip;
       }

       public String getCreditCArdNum() {
           return creditCArdNum;
       }

       @Override
       public String toString() {
           return "First Name = " + firstName +
                   "\nLast Name = " + secondName +
                   "\nAddress = " + address +
                   "\nState = " + state +
                   "\nZip = " + zip +
                   "\nCredit Card Number = " + creditCArdNum;
       }

   }
}
