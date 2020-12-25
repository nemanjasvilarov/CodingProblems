package com.company;


import java.util.ArrayList;

public class DoublyLinkedList {
    DoubleNode head;

    /**
     * @param Data
     */
    public void insert(int Data) {
        DoubleNode node = new DoubleNode();
        node.Data = Data;
        node.prev = null;
        if (head == null) {
            head = node;
        } else {
            DoubleNode n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            node.prev = n;
        }
    }

    /**
     * @param index
     * @param Data
     */
    public void insertAt(int index, int Data) {
        DoubleNode node = new DoubleNode();
        node.Data = Data;
        node.next = null;
        if (index == 0) {
            insert(Data);
        } else {
            DoubleNode n = head;
            DoubleNode n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            node.next = n1;
            n.next = node;
            n1.prev = node;
            node.prev = n;

        }
    }

    /**
     * @param index
     */
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            DoubleNode n = head;
            DoubleNode n1 = null;
            DoubleNode n2 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n2 = n1.next;
            n.next = n2;
            n2.prev = n;
            n1 = null;
        }
    }

    /**
     *
     */
    public void printFront() {
        DoubleNode node = head;
        while (node != null) {
            System.out.print(" " + node.Data);
            node = node.next;
        }
    }

    /**
     *
     */
    public void printBack() {
        DoubleNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        DoubleNode n = node;

        while (n != null) {
            System.out.print(" " + n.Data);
            n = n.prev;
        }

    }

    /**
     * @return
     */
    public double average() {
        DoubleNode node = new DoubleNode();
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
     * @param value
     * @return
     */
    public int findPosition(int value) {
        DoubleNode node = new DoubleNode();
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
        DoubleNode node = new DoubleNode();
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
        DoubleNode node = new DoubleNode();
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
        DoubleNode node = new DoubleNode();
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

}
