package com.company;

import java.util.ArrayList;


public class LinkedList {
    Node head;

    /**
     * @param Data
     */
    public void insert(int Data) {
        Node node = new Node();
        node.Data = Data;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    /**
     * @param index
     * @param Data
     */
    public void insertAt(int index, int Data) {
        Node node = new Node();
        node.Data = Data;
        node.next = null;

        if (index == 0) {
            insert(Data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }


    /**
     * @return
     */
    public double average() {
        Node node = new Node();
        int sum = 0;
        int counter = 0;
        node = head;
        while (node != null) {
            sum += node.Data;
            counter++;
            node = node.next;
        }
        double avrg = (double) sum / (double) counter;
        return avrg;
    }

    /**
     * @param index
     */
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }


    /**
     * @param value
     * @return
     */
    public int findPosition(int value) {
        Node node = new Node();
        node = head;
        int counter = 0;

        while (node != null) {
            if (node.Data == value) {
                return counter;
            }
            counter++;
            node = node.next;
        }
        return -1;
    }


    /**
     * @param value1
     * @param value2
     * @return
     */

    public int indexOfBiggerValue(int value1, int value2) {
        Node node = new Node();
        node = head;
        int counter = 0;
        while (node != null) {
            if (value1 > value2 && node.Data == value1) {
                return counter;
            } else {
                if (value2 > value1 && node.Data == value2) {
                    return counter;
                }
            }
            counter++;
            node = node.next;
        }
        return -1;
    }


    /**
     * @param value
     * @return
     */
    public ArrayList bigerThenNumber(int value) {
        Node node = new Node();
        ArrayList<Integer> list = new ArrayList<>();

        node = head;
        while (node != null) {
            if (node.Data > value) {
                list.add(node.Data);
            }
            node = node.next;
        }
        return list;
    }


    /**
     * @param index
     * @param value
     */
    public void addValue(int index, int value) {
        Node node = new Node();
        node = head;
        int counter = 0;
        while (node != null) {
            if (counter == index) {
                node.Data = value;
            }
            counter++;
            node = node.next;
        }
    }

    /**
     *
     */
    public void sort() {
        boolean swapped;
        Node node = new Node();
        do {
            swapped = false;
            node = head;
            while (node.next != null) {
                if (node.Data > node.next.Data) {
                    int temp = node.Data;
                    node.Data = node.next.Data;
                    node.next.Data = temp;
                    swapped = true;
                }
                node = node.next;
            }
        }
        while (swapped);
    }

    /**
     *
     */
    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(" " + node.Data);
            node = node.next;
        }

    }

    /**
     * @param Data
     */
    public void insertFirst(int Data) {
        Node node = new Node();
        node.Data = Data;
        node.next = null;
        node.next = head;
        head = node;
    }

    /**
     * @param Data
     */
    public void insertLast(int Data) {
        Node node = new Node();
        Node temp = head;
        node.Data = Data;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }


}
