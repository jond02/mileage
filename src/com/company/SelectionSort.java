package com.company;

/**
 * Created by jondann on 1/8/16.
 */
public class SelectionSort {

    public static void main(String[] args){

        int[] numbers = {67, 78, 4, 15, 47, 30, 99, 33, 65, 85};

        SelectionSort(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + "\t");
        }

    }

    public static void SelectionSort(int[] list){

        /**
         * Start at the beginning of the array. Go through the array and look for the smallest value.
         * At the end of the list swap the value with the smallest value found. Creates a sorted section at the
         * beginning of the list and a non-sorted section at the end. As it moves through the index it adds to
         * the sorted section by finding the smallest available value
         */

        int minValue, minValIndex, temp;

        //step through the array
        for (int i = 0; i < list.length; i++){

            minValIndex = i;
            minValue = list[i];

            //locate smallest value
            for (int j = i + 1; j < list.length; j++){

                if(list[j] < list[minValIndex]){
                    minValue = list[j];
                    minValIndex = j;
                }
            }

            //swap
            temp = list[i];
            list[i] = minValue;
            list[minValIndex] = temp;
        }
    }
}
