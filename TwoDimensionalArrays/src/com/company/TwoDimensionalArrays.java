package com.company;

public class TwoDimensionalArrays {

    /**
     * Function that prints two dimensional array
     *
     * @param1 array:array that is passed to function
     * @param2 row
     * @param3 column
     */
    public void printArray(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {

                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }


    /**
     * Function that returns averege out of given row
     *
     * @return Returns int which represents averege number from the given array
     * @param1 array:2D array that is passed to function
     * @param2 index:variable that represents row that is passed to function
     * @param3 row
     * @param4 column
     */
    public float rowAverege(int[][] array, int index) {

        int sum = 0;
        float averege = 0;

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (index == row) {
                    sum = sum + array[row][column];
                }
            }
        }
        averege =(float) sum / array[index].length;

        return averege;
    }


    /**
     * Function that prints diagonal of the given 2D array
     *
     * @param1 array:array that is passed to function
     * @param2 row
     * @param3 column
     */
    public void findDiagonal(int[][] array) {

        for (int row = array.length-1; row >=0; row--) {
            for (int column = 0; column < array[row].length; column++) {
                if ((row + column) == (array.length - 1)) {
                    System.out.print(array[row][column] + " ");
                }
            }
        }
    }


    /**
     * Function that prints elements that are above diagonal of the given 2D array
     *
     * @param1 array:array that is passed to function
     * @param2 row
     * @param3 column
     */
    public void findAboveDiagonal(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {

                if (row + column < array.length - 1) {
                    System.out.print(array[row][column] + " ");
                }
            }
            System.out.println();
        }
    }
}