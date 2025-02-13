package com.keyin.animalshelter;

public class Animal {

    private String name;
    private int arrivalTime;

    public Animal(String name, int arrivalTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
    }

    public String getName(){
        return name;
    }

    public int arrivalTime(){
        return arrivalTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
