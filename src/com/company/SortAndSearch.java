package com.company;

/**
 * Created by jondann on 1/8/16.
 */
public class SortAndSearch {

    public static void main(String[] args){

        int[] numbers = {67, 78, 4, 15, 47, 30, 99, 33, 65, 85};

        //SelectionSort(numbers);
        insertSort(numbers);

        System.out.println(binarySearch(numbers,0,numbers.length,78));

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

    public static void insertSort(int[] list){

        int key, temp, j;


        /**
         * Starting with index 0, go through list and compare values to the neighbor to their left.
         * When the number to the left is no longer smaller then it is sorted correctly
         */

        for (int i = 1; i < list.length; i++){

            key = list[i];
            j = i - 1;

            while(j >= 0 && key < list[j]){

                //if key is less then number to left then swap
                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                j--;
            }
        }
    }

    public static int binarySearch(int[] list, int lBound, int uBound, int key){

        int position = (lBound + uBound) / 2;

        while (list[position] != key && lBound <= uBound){

            if (list[position] > key){
                uBound = position - 1;
            } else {
                lBound = position + 1;
            }

            position = (lBound + uBound) / 2;
        }

        if (lBound <= uBound){
            return position;
        } else {
            return -1;
        }
    }
}
