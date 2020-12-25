package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] input = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int [][] input2 = {{1,1,1,1,1,1},{1,1,1, 5 ,2,2,2},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
        int [][] input3 = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
        TwoDimensionalArrays tDA = new TwoDimensionalArrays();
        System.out.println("Printed array");
        tDA.printArray(input);
        System.out.println("Averege value of a given row");
        System.out.println(tDA.rowAverege(input2, 1));
        System.out.println("Elements on second diagonal");
        tDA.findDiagonal(input3);
        System.out.println();
        System.out.println("Elements above second diagonal");
        tDA.findAboveDiagonal(input3);
    }
}
