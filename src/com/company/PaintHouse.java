package com.company;

import java.util.Scanner;

/**
 * Created by jondann on 1/8/16.
 */
public class PaintHouse {

    /*
    declare vars
    get house length, width, and height
    number and size of the windows
    same for doors
    calculate surface area
     */

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double length, width, height, windowHeight, windowWidth, doorHeight, doorWidth, surface;
        int nWindows, nDoors, gallons;

        System.out.println("House length:");
        length = in.nextDouble();
        System.out.println("House width:");
        width = in.nextDouble();
        System.out.println("House height:");
        height = in.nextDouble();
        System.out.println("Window height:");
        windowHeight = in.nextDouble();
        System.out.println("Window width:");
        windowWidth = in.nextDouble();
        System.out.println("Door width:");
        doorWidth = in.nextDouble();
        System.out.println("Door height:");
        doorHeight = in.nextDouble();
        System.out.println("Number of windows:");
        nWindows = in.nextInt();
        System.out.println("Number of doors:");
        nDoors = in.nextInt();

        surface = (height * width + 2) + (height * length + 2);
        surface -= (doorHeight * doorWidth) * nDoors;
        surface -= (windowHeight * windowWidth) * nWindows;

        System.out.printf("Surface area is %5.2f\n", surface);

        gallons = (int)surface / 100;

        System.out.println("You will need around " + gallons + " gallons of paint.");

    }

}
