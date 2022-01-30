package com.inin3_pr1_2.kordalski;

import creature.Animal;

import java.util.Arrays;
import java.util.Objects;

public class Human extends Animal {
    String lastName;
    private Double salary;
    public Double cash;
    public Car[] garage;
    Phone phone;
    public Animal pet;
    Human h1;

    public Double getSalary() {
        return salary;
    }

    private final int DEFAULT_GARAGE_SIZE = 4;

    public boolean hasCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] != null && this.garage[i].equals(car)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace(){
        int counterSpace = DEFAULT_GARAGE_SIZE;
        for (Car car : this.garage){
            if (car != null){
                counterSpace -= 1;
            }
        }
        return counterSpace != 0;
    }

    public void removeCar(Car car){
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
                i = this.garage.length;
                System.out.println("Usunięto samochód " + car + " z garażu");
            } else {
                if (i == this.garage.length - 1) {
                    System.out.println("Nie masz takiego auta w garażu :/");
                }
            }
        }
    }

    public void addCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                System.out.println("Dodano auto do garażu, miejsce numer: " + i);
                i = this.garage.length;
            } else {
                if (i == this.garage.length - 1) {
                    System.out.println("Nie masz miejsca w garażu");
                }
            }
        }
    }

    public void carList() {
        int counter = 0;
        for (Car car : garage) {
            if (car != null) {
                counter += 1;
            }
        }
        if (counter > 0) {
            for (int i = 0; i < garage.length; i++) {
                if (this.garage[i] != null) {
                    System.out.println(garage[i]);
                } else {
                    System.out.println("Puste miejsce numer: " + i);
                }
            }
        } else {
            System.out.println("Garaż jest pusty");
        }
    }

    public Double getGarageValue() {
        Double totalValue = 0.0;
        for (Car car : this.garage) {
            if (car != null) {
                totalValue += car.value;
            }
        }
        return totalValue;
    }



    public Human(){
        super("homo sapiens");
        this.salary = 0.0;
        this.cash = 0.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public void setSalary(Double salary) {
/*
        if(salary < 0){
            System.out.println("Chyba cię powaliło, nikt nie będzie" +
                                "pracować za darmo a tym bardziej dopłacać");
        } else {
            this.salary = salary;
        }
        */
        this.salary = salary;

    }
    public void sale(Human seller, Human buyer, Double price){
        if(buyer.cash < price){
            System.out.println("Sorry, nie masz kasy");
        } else if (seller.h1 != this){
            System.out.println("Sorry, ale nie masz człowieka");
        } else {
            System.out.println("Nie wolno handlować ludźmi :/");
        }
    }

    @Override
    public void feed(Double footWeight) {

    }
}

