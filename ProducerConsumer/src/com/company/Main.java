package com.company;

public class Main {

    public static void main(String[] args) {
	SharedResources sr = new SharedResources();
	Producer pt = new Producer(sr);
	Consumer ct = new Consumer(sr);
	pt.start();
	ct.start();
	//new Consumer(sr);
	//new Producer(sr);
    }
}
