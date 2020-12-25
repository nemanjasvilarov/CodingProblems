package com.company;

public class Main {

    public static void main(String[] args) {

        Arrays m = new Arrays();

        int[] input1 = {3, 1, 12, 6, 7};
        int[] input2 = {1, 4, 7, 12, 31, 16};
        int[] input3 = {12, 10, 34, 2, 21};


        System.out.println("Element with wanted index:" + m.findIndex(input1, 3));

        System.out.println("Printed array");
        m.printArray(input1);

        int[] array1 = m.evenIndexes(input1);
        System.out.println("Elements with even indexes");
        m.printArray(array1);

        System.out.println("Sum of array is:" + m.sumOfArray(input1));

        int[] array2 = m.biggerThanAverage(input1);
        System.out.println("Array with elements bigger then averege");
        for (int counter = 0; counter < array2.length; counter++)
            System.out.println(array2[counter]);

        System.out.println("Reversed array");
        m.reversedArrey(input2);
        m.printArray(input2);



        System.out.println("Sorted array");
        m.sortArray(input2);
        m.printArray(input2);

        System.out.println("Array with every second element swapped");
        m.swapingSecondElement(input3);
        m.printArray(input3);


    }
}


