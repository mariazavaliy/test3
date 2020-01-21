package com.company;

public class MyCar extends Car {

    @Override
    public void description() {
        System.out.println(color + " " + model + " " + speed);

    }
}
