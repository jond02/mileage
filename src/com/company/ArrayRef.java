package com.company;

import java.util.Arrays;

/**
 * Created by jondann on 1/8/16.
 */
public class ArrayRef {

    public static void main(String[] args){

        String[] arrg = new String[] {"cool", "yes", "ok"};

        System.out.println(Arrays.toString(arrg));

        changeAr(arrg);

        System.out.println(Arrays.toString(arrg));


    }

    private static void changeAr(String[] arr){

        arr[1] = "changed";

    }

}
