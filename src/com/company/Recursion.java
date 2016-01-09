package com.company;

/**
 * Created by jondann on 1/8/16.
 */

public class Recursion {

    public static void main(String[] args){

        countdown(10);

    }

    private static void countdown(int num){

        if(num <= 0){
            System.out.println("Blast off!");
        } else {
            System.out.println(num);
            countdown(num - 1);
        }

    }

}
