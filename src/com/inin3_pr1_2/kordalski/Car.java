package com.inin3_pr1_2.kordalski;

public class Car extends Device{

    Double engineVolume;
    private String plates;

    public Car(String producer, String model, int yearOfProduction, String colour, Double engineVolume) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Producent: " + this.producer + ", model: " + this.model;
    }


}

