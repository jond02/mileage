package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nMiles, mpg;
        double perGallon, total;
        Scanner s1 = new Scanner(System.in);
        DecimalFormat nf = new DecimalFormat("#.00");

        System.out.println("Please enter the miles");
        nMiles = s1.nextInt();

        System.out.println("Please enter the mpg");
        mpg = Integer.parseInt(s1.next());

        System.out.println("Enter the price of gas");
        perGallon = Double.parseDouble(s1.next());

        total = getTotal(nMiles, mpg, perGallon);

        System.out.println("Your total will be " + nf.format(total));

    }

    private static double getTotal(int nMiles, int mpg, double perGallon){
        return nMiles / mpg * perGallon;
    }

}
