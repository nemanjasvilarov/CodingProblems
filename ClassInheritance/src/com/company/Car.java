package com.company;

public class Car extends Engine {

    private String mark;
    private String model;
    private String color;
    private double length;
    private double width;
    private double height;
    private int  trunkLoad;
    private int  numberOfPassangers;

    public Car(int numberOfPassangers,double height,double width,double length,String color,String model,String mark,int trunkLoad,int weight,int horsePower,int consumption,String engineModel){
        super(weight,horsePower,consumption,engineModel);
        this.numberOfPassangers =numberOfPassangers;
        this.model=model;
        this.color = color;
        this.height = height;
        this.length = length;
        this.mark = mark;
        this.width=width;
        this.trunkLoad  = trunkLoad;
    }


}
