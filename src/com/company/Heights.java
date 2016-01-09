package com.company;

/**
 * Created by jondann on 1/8/16.
 */
public class Heights {

    public static void main(String[] args){

        int[] heights = new int[] {45, 67, 23, 54, 23, 87, 34, 65, 102, 21, 2, 65, 34, 65, 45};
        int tallest = 0;
        int total = 0;

        for (int i = 0; i < heights.length; i++){

            //find the tallest height
            if (heights[i] > tallest) {
                tallest = heights[i];
            }

            //for finding the average
            total +=heights[i];
        }

        System.out.println(tallest);
        System.out.println(heights.length);
        System.out.println(total / (double)heights.length);

    }

}
