package com.company;

public class Engine {
    private int weight;
    private int horsePower;
    private int consumption;
    private String engineModel;

    public Engine(int weight,int horsePower,int consumption,String engineModel){
        this.consumption  = consumption;
        this.horsePower = horsePower;
        this.engineModel = engineModel;
        this.weight = weight;
    }
}
