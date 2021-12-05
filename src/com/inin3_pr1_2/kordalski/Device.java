package com.inin3_pr1_2.kordalski;

abstract public class Device implements Saleable{

    String producer;
    String model;
    int yearOfProduction;
    String colour;

    public Device(String producer, String model, int yearOfProduction, String colour) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
    }

    public Integer getAge(){
        return 2021 - yearOfProduction;
    }

    abstract public void turnOn();
    abstract public boolean isTurnedOn();


}
