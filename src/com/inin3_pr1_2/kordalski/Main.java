package com.inin3_pr1_2.kordalski;

import creature.Animal;
import creature.Pet;

public class Main {

    public static void main(String[] args) {


        Pet dog = new Pet("Burek");
        Pet cat = new Pet("Marek");

        Car fiat = new Car("Fiat", "Bravo", 2016, "Black", 3.0) ;
        Car passerati = new Car("VW", "Passat", 2004, "Black", 3.0);
        Car firstCar = new Car("Porshe", "911", 2004, "Black", 3.0);

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
    }
}
