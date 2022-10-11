package com.cydeo.test.Day006_AlertIFrame;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

import static org.testng.Assert.assertEquals;

public class aylasMath{
    public static void main(String[] args) {

        int a ,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        a =  sc.nextInt();
        System.out.println("Please enter Second number: ");
        b =  sc.nextInt();

        int sum;
        if(b > a){
            System.out.println(b+" is the addend");
            for (int i = 0; i < a; i++) {
                b++;
                sum =b;
            }
            System.out.println("Sum = " + b);
        }else if(a > b){
            System.out.println(a+" is the addend ");
            for (int i = 0; i <b ; i++) {
                a++;
                sum = a;
            }
            System.out.println("Sum = " + a);
        }

    }
}
