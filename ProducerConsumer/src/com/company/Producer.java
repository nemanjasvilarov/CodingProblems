package com.company;



 public class Producer extends Thread{

    SharedResources sr;
     Producer(SharedResources sr){
        this.sr=sr;
        //Thread t = new Thread(this,"Producer");
       // t.start();

    }

    public void run(){

        for (int i = 1; i < 10; i++)
            // producer puts items
                sr.put(i);

    }
}
