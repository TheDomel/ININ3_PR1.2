package com.inin3_pr1_2.kordalski;

public class Phone extends Device{

    final int ram;
    final String ramText;
    int totalStorage;

    public Phone(String producer, String model, int yearOfProduction, String colour, int ram, int totalStorage) {

        super(producer, model, yearOfProduction, colour);
        this.ram = ram;
        this.totalStorage = totalStorage;
        this.ramText = ram + "GB";
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", ramText='" + ramText + '\'' +
                ", totalStorage=" + totalStorage +
                '}';
    }
}

