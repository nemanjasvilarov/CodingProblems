package com.company;

public class MinMaxSum {
    /**
     * Function that finds minimum and maximum element of given array and prints sum of elements without min element and sum of elements without max element
     *
     * @param1 array:array of elements that is used for finding min and max elements
     * @param2 min:variable used for storing minimum element
     * @param3 max:variable for storing maximum element
     * @param4 sum1:variable for storing sum of elements without maximum element
     * @param5 sum2:variable for storing sum of elements without minimum element
     */
    public void minMaxSum(int[] array) {


        int sum1 = 0;
        int sum2 = 0;


        int temp = 0;
        for (int counter1 = array.length - 1; counter1 > 0; counter1--) {
            for (int counter2 = 0; counter2 < counter1; counter2++) {
                if (array[counter2] > array[counter2 + 1]) {
                    temp = array[counter2];
                    array[counter2] = array[counter2 + 1];
                    array[counter2 + 1] = temp;

                }
            }
        }

        for (int counter = 0; counter <= 3; counter++) {
            sum1 += array[counter];
        }

        for (int counter = array.length - 1; counter >= array.length - 4; counter--) {
            sum2 += array[counter];
        }

        System.out.println(" " + sum1 + " " + sum2);
    }
}

