package com.inin3_pr1_2.kordalski;

import creature.Animal;
import creature.Pet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Pet dog = new Pet("Burek");
        Pet cat = new Pet("Marek");

        LPG fiat = new LPG("Fiat", "Bravo", 2016, "Black", 3.0) ;
        Electric passerati = new Electric("VW", "Passat", 2004, "Black", 3.0);
        Diesel firstCar = new Diesel("Porshe", "911", 2004, "Black", 3.0);

        Phone firstPhone = new Phone("Apple", "iPhone 11", 2020,"Black", 8, 64);

        System.out.println(firstPhone);

        Human me = new Human();


        me.setSalary(10000.0);
        System.out.println(me.getSalary());

        me.Feed();
        me.GoForWalk();
        System.out.println(me.species);
        System.out.println(me.weight);

        System.out.println(fiat.getAge());

        Pet cat1 = new Pet("felis");

        fiat.turnOn();
        fiat.isTurnedOn();
        firstPhone.turnOn();
        firstPhone.isTurnedOn();

        Human brotherInLow = new Human();

        brotherInLow.cash = 200000.0;
        me.car = fiat;
        me.pet = cat1;
        me.phone = firstPhone;
        me.h1 = me;

        fiat.sale(me,brotherInLow, 8000.0);
        firstPhone.sale(me, brotherInLow, 8000.0);
        cat1.sale(me, brotherInLow, 800000.0);
        me.sale(me, brotherInLow, 8000.0);

        List<String> apps = new ArrayList<>();
        apps.add("fb");
        apps.add("gmail");
        apps.add("tiktok");
        firstPhone.installAnApp("fb");
        fiat.Refuel();
        passerati.Refuel();
        firstCar.Refuel();
    }
}
