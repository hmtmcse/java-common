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


        System.out.println("");
        Double roundDub = 10.00;
        Integer roundInt = 10;
        Double roundFloat = 10.0123;
        Integer roundLong = 10;
        System.out.println("TMMath Rounding Double Test (" + roundDub + "): " + TMMath.start(roundDub).mathRound(2).toString());
        System.out.println("TMMath Rounding Int Test (" + roundInt + "): " + TMMath.start(roundInt).mathRound(2).toString());
        System.out.println("TMMath Rounding Float Test (" + roundFloat + "): " + TMMath.start(roundFloat).mathRound(2).toString());
        System.out.println("TMMath Rounding Long Test (" + roundLong + "): " + TMMath.start(roundLong).mathRound(2).toString());


    }


    public static void main(String[] args) {
        mathTest();
    }

}
