package com.inin3_pr1_2.kordalski;

public class Application {

    public String nameApplication;
    public String version;
    public Double priceApplication;
    public boolean installedApplication;


    public Application(String nameApplication, String version, Double priceApplication) {
        this.nameApplication = nameApplication;
        this.version = version;
        this.priceApplication = priceApplication;
        this.installedApplication = false;
    }

    public String toString(){
        return "Application {" +
                "Aplikacja: '" + nameApplication + '\'' +
                ", Wersja: '" + version + '\'' +
                ", Cena aplikacji: " + priceApplication +
                '}';
    }

}