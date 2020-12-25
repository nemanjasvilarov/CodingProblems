package com.company;
import java.util.concurrent.Semaphore;


public class SharedResources {

    int item;
    static Semaphore semProducer = new Semaphore(1);
    static Semaphore semConsumer = new Semaphore(0);

    void get() {
        try {
            semConsumer.acquire();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        System.out.println("Consumer consuming item:" + item);
        semProducer.release();
    }

    void put(int item) {
        try{
            semProducer.acquire();
        } catch (InterruptedException e){
            System.out.println("InterruptedException caught");
        }
        this.item=item;
        System.out.println("Producer producing item:" + item);
        semConsumer.release();
    }
}


