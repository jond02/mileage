package com.company;

/**
 * Created by jondann on 1/8/16.
 */
public class DataConversion {

    public static void main(String[] args){

        System.out.println((3 + 5 + 8) / 3);
        System.out.println((3 + 5 + 8) / 3.0);
        System.out.println((3 + 5 + 8.0) / 3);

        //if divide two ints without casting will just get the int value
        double volume = (double)4/3 * Math.PI * 10*10*10;

        System.out.println(volume);

        double fahrenheit = 100;
        double celsius = (fahrenheit - 32) * 5/9.0;
        System.out.println(celsius);

    }

}
