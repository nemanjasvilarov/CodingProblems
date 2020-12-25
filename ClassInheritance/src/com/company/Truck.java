package com.company;

public class Truck extends  Engine{

    private String mark;
    private String model;
    private String color;
    private double length;
    private double width;
    private double height;
    private int maximumLoad;

    public Truck(int maximumLoad,double height,double width,double length,String color,String model,String mark,int weight,int horsePower,int consumption,String engineModel){
        super(weight,horsePower,consumption,engineModel);
        this.maximumLoad = maximumLoad;
        this.model=model;
        this.color = color;
        this.height = height;
        this.length = length;
        this.mark = mark;
        this.width=width;
    }

}
