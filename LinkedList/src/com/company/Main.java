package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        SortedLinkedList sList1 = new SortedLinkedList();
        SortedLinkedList sList2 = new SortedLinkedList();
        DoublyLinkedList dList =  new DoublyLinkedList();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

      /*  list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertFirst(40);
        list.insertLast(12);
        list.insertAt(1, 25);
        list.deleteAt(2);
        list.addValue(3, 5);
        list.print();
        System.out.println();
        System.out.println("Average value is:" + list.average());
        System.out.println("Position of given value is: " + list.findPosition(25));
        System.out.println("Position of bigger value is: " + list.indexOfBiggerValue(20, 5));
        System.out.println("Nodes that are bigger then given value are: " + list.bigerThenNumber(20));
        list.sort();
        System.out.println("Sorted:");
        list.print();
        System.out.println();
        System.out.println("/////////////////////////////////////////////");
        */



        Node h1;
        Node h2;
        sList1.insert(2);
        sList1.insert(10);
        sList1.insert(-10);
        sList1.insert(25);
        sList1.insert(11);
        sList2.insert(2);
        sList2.insert(10);
        sList2.insert(-10);
        sList2.insert(25);
        sList2.insert(11);
       // sList1.insert(250);
       // sList1.insert(143);
        //sList1.insert(39);





        sList1.insertAt(3,6);



        //
        //sList.insertAt(1, 7);
       sList1.print();
        //System.out.println();
        //System.out.println("Average value is:" + sList.average());
       // System.out.println("Position of given value is: " + sList.findPosition(25));
        //System.out.println("Position of bigger value is: " + sList.indexOfBiggerValue(25, 5));
        //System.out.println(" Bigger then number:" + sList.bigerThenNumber(24));

        /*
        System.out.println("/////////////////////////////////////////////");

        dList.insert(1);
        dList.insert(2);
        dList.insert(3);
        dList.deleteAt(1);
        dList.insertAt(1,5);
        dList.insert(7);
        dList.insert(10);
        System.out.println("Printing front:");
        dList.printFront();
        System.out.println();
        System.out.println("Printing from back");
        dList.printBack();
        System.out.println();
        System.out.println("Position of given value is: " + dList.findPosition(5));
        System.out.println("Average value is:" + dList.average());
        System.out.println("Position of bigger value is: " + dList.indexOfBiggerValue(5, 7));
        System.out.println("Nodes that are bigger then given value are: " + dList.bigerThenNumber(6));

        System.out.println("/////////////////////////////////////////////");

        Merge m = new Merge();
        SortedLinkedList sll1 = new SortedLinkedList();
        SortedLinkedList sll2 = new SortedLinkedList();
        sll1.insert(1);
        sll1.insert(2);
        sll1.insert(3);
        sll2.insert(4);
        sll2.insert(5);
        sll2.insert(6);
       */




    }
}
