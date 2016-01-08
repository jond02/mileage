package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jondann on 1/8/16.
 */
public class GroceryList {

    public static void main(String[] args){

        double[] list = new double[5];
        double total = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < list.length; i++){

            System.out.println("Enter a price:");
            list[i] = in.nextDouble();
            total += list[i];
        }

        System.out.println("Prices are:");
        System.out.println(Arrays.toString(list));
        System.out.printf("The total is: $%5.2f", total);
    }

}
