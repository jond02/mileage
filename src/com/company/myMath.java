package com.company;

import java.util.Random;

/**
 * Created by jondann on 1/8/16.
 */
public class myMath {

    private static Random rand = new Random();

    public static void main(String[] args){

        for(int i = 1; i < 101; i++){
            System.out.println(randNumber(i));
        }

    }

    private static int randNumber(int bound){
        return rand.nextInt(bound);
    }

}
