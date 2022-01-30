package com.inin3_pr1_2.kordalski;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements Saleable{

    Double engineVolume;
    private String plates;
    public double value;

    public List<Human> oList;
    public List<Human> bList;
    public List<Human> sList;
    public List<String> transactions;
    public Human human;


    public Car(String producer, String model, int yearOfProduction, String colour, Double engineVolume) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 1.9;
        this.oList = new ArrayList<>();
        this.bList = new ArrayList<>();
        this.sList = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.human = human;

    }

    public String toString() {
        return "Producent: " + this.producer + ", model: " + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyk");
        System.out.println("silnik odpalił niczym żyleta");
    }

    @Override
    public boolean isTurnedOn() {
        return false;
    }

    public void sale(Human seller, Human buyer, Double price){
        if(buyer.cash < price){
            System.out.println("Sorry, nie masz kasy");
        } else if (seller.hasCar(this)){
            System.out.println("Sorry, ale nie masz samochodu");

        }else {
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            this.oList.add(buyer);
            this.bList.add(buyer);
            this.sList.add(seller);
            this.transactions.add("Były właściciel: " + seller.name + " nowy właściciel: " + buyer.name + " auta: ");
            System.out.println("Udało się sprzedać auto za " + price + " cebulionów");
        }
    }

    public boolean checkOwnersCar(){
        return oList.size() != 0;
    }

    public void nowCarOwners(){
        System.out.println("Auto: " + this);
        int counter = 1;
        if(oList.size() == 0){
            System.out.println(" auto nie posiada właściciela");
        }else{
            for (Human human : oList) {
                if(counter == oList.size()){
                    this.human = human;
                    System.out.println(counter + " " + this.human + " jest aktualnym właścicielem pojazdu");
                }else{
                    System.out.println(counter + " " + human);
                    counter += 1;
                }
            }
        }
    }

    public Integer transactionCount(){
        int counter = 0;
        for (String transaction : transactions) {
            counter += 1;
        }
        return counter;
    }

    public boolean checkSelling(Human seller, Human buyer){
        for (int i = 0; i < transactionCount(); i++) {
            if(sList.contains(seller) && bList.contains(buyer))
                if(sList.get(i) == seller && bList.get(i) == buyer){
                    return true;
                }
        }
        return false;
    }



    public abstract void Refuel();
}

