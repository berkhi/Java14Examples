package com.bilgeadam.lesson021;

import java.io.Serializable;

public class Ogrenci implements Serializable {
    private String name;
    private double avarage;

    public Ogrenci(String name, double avarage) {
        this.name = name;
        this.avarage = avarage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvarage() {
        return avarage;
    }

    public void setAvarage(double avarage) {
        this.avarage = avarage;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", avarage=" + avarage +
                '}';
    }
}
