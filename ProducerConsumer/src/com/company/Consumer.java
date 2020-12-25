package com.company;

public class Consumer extends Thread{
    SharedResources sr;
    Consumer(SharedResources sr){
        this.sr=sr;
        //Thread t = new Thread(this,"Consumer");
       // t.start();
    }

   public  void run(){
        for (int i = 1; i < 10; i++)
            //consumer gets item
           sr.get();

    }
}
