package com.inin3_pr1_2.kordalski;

public class Human extends Animal{
    String firstName;
    String lastName;
    private Double salary;
    public Double cash;
    public Car car;
    Phone phone;
    Animal pet;
    Human h1;

    public Double getSalary(){
        return salary;
    }

    public Human(){
        super("homo sapiens");
        this.salary = 0.0;
        this.cash = 0.0;
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
}

