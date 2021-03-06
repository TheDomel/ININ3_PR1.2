package com.inin3_pr1_2.kordalski;

import creature.Animal;
import creature.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Pet dog = new Pet("Burek");
        Pet cat = new Pet("Marek");

        LPG fiat = new LPG("Fiat", "Bravo", 2016, "Black", 3.0) ;
        Electric passerati = new Electric("VW", "Passat", 2004, "Black", 3.0);
        Diesel firstCar = new Diesel("Porshe", "911", 2004, "Black", 3.0);

        Phone firstPhone = new Phone("Apple", "iPhone 11", 2020,"Black", 8, 64);
        Phone secondPhone = new Phone("Xiaomi", "mi 9t", 2019,"Blue", 6, 64);

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

        me.name = "Dominik";
        brotherInLow.name = "Franek";

        brotherInLow.cash = 200000.0;
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

        Integer[] numbers = {2, 1, 3, 2};
        String[] days = {"pn", "wt", "śr", "czw"};
        Integer[] otherNumbers = new Integer[4];
        otherNumbers[0] = 2;
        otherNumbers[1] = 1;
        otherNumbers[2] = 3;
        otherNumbers[3] = 2;

        List<Integer> listOfNumbers = new LinkedList<>();
        listOfNumbers.add(2);
        listOfNumbers.add(1);
        listOfNumbers.add(15);

        Human[] family = new Human[5];
        family[0] = me;
        family[1] = me;
        family[2] = brotherInLow;
        System.out.println();

        List<Human> otherFamily = new LinkedList<>();
        otherFamily.add(me);
        otherFamily.add(brotherInLow);
        otherFamily.add(me);
        System.out.println(otherFamily.size());


        Set<Human> anotherFamily = new HashSet<>();
        anotherFamily.add(me);
        anotherFamily.add(me);
        anotherFamily.add(me);
        anotherFamily.add(me);
        anotherFamily.add(brotherInLow);
        System.out.println(anotherFamily.size());

        fiat.value = 15000;
        passerati.value = 10000;
        firstCar.value = 1000000;

        me.addCar(fiat);
        me.addCar(passerati);

        brotherInLow.addCar(firstCar);
        System.out.println("Twoje auta w garażu: ");
        me.carList();

        System.out.println("Ich wartość wynosi: " + me.getGarageValue() + " cebulionów");
        System.out.println("Auta twojego ziomka: ");
        System.out.println("Ich wartość wynosi: " + brotherInLow.getGarageValue() + " cebulionów");
        brotherInLow.carList();

        me.removeCar(passerati);
        System.out.println("Twoje auta w garażu: ");
        me.carList();
        System.out.println("Ich wartość wynosi: " + me.getGarageValue() + " cebulionów");

        fiat.sale(me, brotherInLow, 20000.0);
        System.out.println("Twoje auta w garażu: ");
        me.carList();
        System.out.println("Auta twojego ziomka: ");
        brotherInLow.carList();

        Application Darknet = new Application("DARK NET", "21.37", 10.0);
        Application Study = new Application("Study", "0.00001", 200.0);
        Application C19 = new Application("C19", "3.0", 2000.0);
        Application Instagram = new Application("Instagram", "220.0.0.16.115", 0.0);



        System.out.println(Darknet.toString());
        System.out.println(Study.toString());
        System.out.println(C19.toString());
        System.out.println(Instagram.toString());

        System.out.println(" ");
        System.out.println("Twoje cebuliony: " + me.cash);
        System.out.println(" ");
        firstPhone.installAnAppSecondTime(me, Darknet);
        firstPhone.installAnAppSecondTime(me, Instagram);
        firstPhone.installAnAppSecondTime(me, Study);
        System.out.println(" ");
        firstPhone.installAnAppSecondTime(me, Darknet);
        System.out.println(" ");
        firstPhone.installedApplicationName();
        System.out.println(" ");
        firstPhone.installedApplicationPrice();
        System.out.println(" ");
        firstPhone.freeApplications();
        System.out.println(" ");
        System.out.println("Wartość wszystkich aplikacji: " + firstPhone.installedAppsCost() + " cebulionów");
        System.out.println(" ");
        System.out.println("Twoje cebuliony po zakupie aplikacji: " + me.cash);

        System.out.println(" ");
        System.out.println("Twoje cebuliony: " + brotherInLow.cash);
        System.out.println(" ");
        secondPhone.installAnAppSecondTime(brotherInLow, Darknet);
        secondPhone.installAnAppSecondTime(brotherInLow, Study);
        secondPhone.installAnAppSecondTime(brotherInLow, C19);
        System.out.println(" ");
        secondPhone.installedApplicationName();
        System.out.println(" ");
        firstPhone.installedApplicationPrice();
        System.out.println(" ");
        secondPhone.freeApplications();
        System.out.println("Wartość wszystkich aplikacji: " + secondPhone.installedAppsCost() + " cebulionów");
        System.out.println(" ");
        System.out.println("Twoje cebuliony po zakupie aplikacji: " + brotherInLow.cash);
    }
}
