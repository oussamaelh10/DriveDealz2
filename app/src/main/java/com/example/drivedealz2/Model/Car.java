package com.example.drivedealz2.Model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Car {
    @PrimaryKey
    private int Id;
    private String brand;
    private String model;
    private int year;

    private double price;

    public Car() {
    }

    public Car(int id, String brand, String model, int year, double price) {
        Id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}


