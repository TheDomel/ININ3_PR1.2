package com.inin3_pr1_2.kordalski;

public class Human extends Animal{
    String firstName;
    String lastName;
    private Double salary;

    public Double getSalary(){
        return salary;
    }

    public Human(){
        super("homo sapiens");
        this.salary = 0.0;
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
}

