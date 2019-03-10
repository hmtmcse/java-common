package com.hmtmcse.test;

import com.hmtmcse.math.TMMath;

import java.math.RoundingMode;

public class TestMain {

    public static void mathTest() {
        Double number1 = 0.1;
        Double number2 = 0.13;


        System.out.println("");
        System.out.println("Double Add: " + (number1 + number2));
        System.out.println("TMMath Add: " + TMMath.start(number1).add(number2).toDouble());

        System.out.println("");
        System.out.println("Double Multiply: " + (number1 * number2));
        System.out.println("TMMath Multiply: " + TMMath.start(number1).multiply(number2).toDouble());

        System.out.println("");
        System.out.println("Double Divide: " + (number1 / number2));
        System.out.println("TMMath Divide: " + TMMath.start(number1).divide(number2, RoundingMode.HALF_UP).toDouble());
        System.out.println("TMMath Divide: " + TMMath.start(10).divide(2).toDouble());


    }


    public static void main(String[] args) {
        mathTest();
    }

}
