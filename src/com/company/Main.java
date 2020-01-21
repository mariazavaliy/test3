package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new MyCar();

        car.color = "baklajan";
        car.model = "Lada";
        car.speed = 20;

        car.description();
        car.gas(50);
        car.brake(10);

    }
}
