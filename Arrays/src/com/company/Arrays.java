package com.company;


public class Arrays {

    /**
     * This function gets array and index so it couled raturn element with wanted index
     *
     * @return Returns integer which represents element of given index
     * @param1 array:array of given elements that is used in function
     * @param2 index:given index that is used for finding element
     */
    public int findIndex(int[] array, int index) {

        return array[index];
    }


    /**
     * This function gets array and prints it using for loop
     *
     * @param array:array of given elements that is used in function
     */
    public void printArray(int[] array) {
        for (int counter = 0; counter < array.length; counter++)
            System.out.println("Array:" + array[counter]);
    }

    /**
     * Function gets array and returns sum of all elements in given array
     *
     * @param array:array of given elements that is used in function
     * @return Returns integer which represents sum of elements in given array
     */
    public int sumOfArray(int[] array) {
        int sum = 0;
        for (int counter = 0; counter < array.length; counter++) {

            sum = sum + array[counter];
        }
        return sum;
    }

    /**
     * Function gets array and returns elements with even indexes
     *
     * @return Returns array of integers that have even indexes
     * @param1 array:array of given elements that is used in function
     * @param2 array1:array used for storing elements with even indexes
     */
    public int[] evenIndexes(int[] array) {
        int myArray[];
        int myCounter = 0;
        if (array.length % 2 == 0) {
            myArray = new int[array.length / 2];
        } else {
            myArray = new int[array.length / 2 + 1];
        }
        for (int counter = 0; counter < array.length; counter++) {
            if (counter % 2 == 0) {
                myArray[myCounter] = array[counter];
                myCounter++;
            }

        }
        return myArray;
    }

    /**
     * Function that gets array and calculates sum and averege using elements of the given array.
     * After calculating averege this function returns every element that is bigger than averege.
     *
     * @return Returns array of integeres which represents array of all elements that are bigger than averege
     * @param1 array:given array of integers that is used in function
     * @param2 sum:variable that was used for storing sum of elements in given array
     * @param3 averege:variable that is used for storing averege
     * @param4 myArray:array used for storing elements that are bigger than averege
     */
    public int[] biggerThanAverage(int[] array) {
        int sum = 0;
        int average = 0;
        int myCounter=0;
        int countBiggerThanAverage=0;
        for (int counter = 0; counter < array.length; counter++) {
            sum += array[counter];
        }
        average = sum / array.length;
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] > average) {
                countBiggerThanAverage++;
            }
        }
        int [] elementsBiggerThanAverage = new int[countBiggerThanAverage];

        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] > average) {
                elementsBiggerThanAverage[myCounter]=array[counter];
                myCounter++;
            }
        }
        return elementsBiggerThanAverage;
    }

    /**
     * Function that returns reversed array
     *
     * @return Returns array of integers which represents elements that are reversed
     * @param1 array:given array of integers that is used in function
     * @param2 myArray:array that is used for storing reversed array
     */
    public int[] reversedArrey(int[] array) {

        int temp = 0;
        for (int counter = 0; counter < array.length / 2; counter++) {
            temp = array[counter];
            array[counter] = array[array.length - counter - 1];
            array[array.length - counter - 1] = temp;
        }
        return array;

    }


    /**
     * This function sorts array using bubble sort method
     * Bubble sort is algorithm which compares the first element of the array to the next one.
     * If the current element of the array is numerically greater than the next one, the elements are swapped.
     *
     * @return Returns array of integers which represent elements that are sorted in descending order
     * @param1 array:given array of integers that is used in function
     * @param2 temp:temprorary variable used for storing elements of array that are used for swapping
     */
    public int[] sortArray(int[] array) {

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
        // return temp;
        return array;
    }

    /**
     * Function that returnes array with every second index swapped
     *
     * @return Returns array of integers that have every second index swapped
     * @param1 array:given array of integers that is used in function
     * @param2 temp:temprorary variable used for storing elements of array that are used for swapping
     */
    public int[] swapingSecondElement(int[] array) {
        int temp = 0;


        for (int i = 0; i < array.length - 1; i += 2) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        // return temp;
        return array;
    }

}




