package com.itacademy.postulatidemo;

public class Car {

    String make;
    String model;
    int weight;
    String color;

    static int noCarInTheShowroom = 12;

    public Car() {

    }

    public Car(String make, String model, int weight, String color)
        this.make = make;
        this.model = model;
        this.weight = weight;
        this.color = color;
}

void startEngine() {
    System.out.println("The engine of" +this.make + "" + this.model +"has been started.");
}
