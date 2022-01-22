package com.inin3_pr1_2.kordalski;

public class LPG extends Car{
    public LPG(String producer, String model, int yearOfProduction, String colour, Double engineVolume) {
        super(producer, model, yearOfProduction, colour, engineVolume);
    }

    @Override
    public void Refuel() {
        System.out.println("Refuel");
    }
}
