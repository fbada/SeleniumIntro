package com.cydeo.test.Day009_ConfigReader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties
{

    @Test
    public static void readProperties() {
        Properties properties = new Properties();
        try{

            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
        }catch (IOException e){
            System.out.println("File not found");
            e.printStackTrace();
        }

        System.out.println(properties.getProperty("browser"));

    }
}
